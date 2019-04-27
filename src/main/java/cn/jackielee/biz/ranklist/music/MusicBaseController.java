package cn.jackielee.biz.ranklist.music;

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
public abstract class MusicBaseController extends BaseController{
    /**
     * 从豆瓣接口返回的音乐列表数据解析转换
     * @param searchResult
     * @return
     */
    protected List<ListCommonVo> musicListDataTrans(JSONObject searchResult){
        List<ListCommonVo> listCommonVos = Lists.newArrayList();

        if (searchResult != null && CollectionUtils.isNotEmpty(searchResult.getJSONArray("musics"))) {
            JSONArray jsonArray = searchResult.getJSONArray("musics");
            List<JSONObject> jsonObjects = jsonArray.toJavaList(JSONObject.class);
            for (JSONObject jo : jsonObjects) {
                ListCommonVo vo = new ListCommonVo();
                //id
                vo.setId(jo.getIntValue("id"));
                //标题
                vo.setTitle(jo.getString("title"));
                //图片
                vo.setPic(jo.getString("image"));
                vo.setUrl(jo.getString("mobile_link"));
                //演唱者
                JSONArray authorArray = jo.getJSONArray("author");
                List<JSONObject> authorList = authorArray != null ? authorArray.toJavaList(JSONObject.class) : null;
                StringBuilder authorSB = new StringBuilder();
                authorList.forEach(o -> authorSB.append(o.getString("name")).append(" "));
                vo.setAuthor(authorSB.toString());
                //出版日期
                String date = jo.getJSONObject("attrs").getJSONArray("pubdate").getString(0);
                vo.setDate(date);
                //评分
                vo.setScore(jo.getJSONObject("rating").getString("average"));
                //评分人数
                vo.setScoreNum(jo.getJSONObject("rating").getString("numRaters"));

                JSONArray tags = jo.getJSONArray("tags");
                StringBuilder tagsSB = new StringBuilder();
                tags.forEach(o -> tagsSB.append(((JSONObject)o).getString("name")).append(" "));
                vo.setDesc(tagsSB.toString());
                listCommonVos.add(vo);
            }
        }

        return listCommonVos;
    }
}
