package cn.jackielee.biz.ranklist.book;

import cn.jackielee.base.BaseController;
import cn.jackielee.biz.ranklist.common.vo.ListCommonVo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.assertj.core.util.Lists;

import java.util.List;

/**
 * Created by lxb on 2019/4/24.
 */
public abstract class BookBaseController extends BaseController{
    /**
     * 从豆瓣接口返回的书籍列表数据解析转换
     * @param searchResult
     * @return
     */
    protected List<ListCommonVo> bookListDataTrans(JSONObject searchResult){
        List<ListCommonVo> listCommonVos = Lists.newArrayList();

        if (searchResult != null && CollectionUtils.isNotEmpty(searchResult.getJSONArray("books"))) {
            JSONArray jsonArray = searchResult.getJSONArray("books");
            List<JSONObject> jsonObjects = jsonArray.toJavaList(JSONObject.class);
            for (JSONObject jo : jsonObjects) {
                ListCommonVo vo = new ListCommonVo();
                //id
                vo.setId(jo.getIntValue("id"));
                //标题
                vo.setTitle(jo.getString("title"));
                //图片
                vo.setPic(jo.getString("image"));
                //作者
                JSONArray authorArray = jo.getJSONArray("author");
//                List<JSONObject> authorList = authorArray != null ? authorArray.toJavaList(JSONObject.class) : Lists.newArrayList();
                StringBuilder authorSB = new StringBuilder();
                authorArray.forEach(o -> authorSB.append(o).append(" "));
                vo.setAuthor(authorSB.toString());

                //译者
                JSONArray translatorArray = jo.getJSONArray("translator");
                StringBuilder translatorSB = new StringBuilder();
                translatorArray.forEach(o -> translatorSB.append(o).append(" "));
                vo.setTranslator(translatorSB.toString());
                //出版日期
                vo.setDate(jo.getString("pubdate"));
                //评分
                vo.setScore(jo.getJSONObject("rating").getString("average"));
                //评分人数
                vo.setScoreNum(jo.getJSONObject("rating").getString("numRaters"));

//                JSONArray tags = jo.getJSONArray("tags");
//                StringBuilder tagsSB = new StringBuilder();
//                tags.forEach(o -> tagsSB.append(((JSONObject)o).getString("name")).append(" "));
                vo.setDesc(jo.getString("summary"));
                vo.setPress(jo.getString("publisher"));
                listCommonVos.add(vo);
            }
        }

        return listCommonVos;
    }
}
