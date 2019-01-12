package cn.jackielee.base;

import cn.jackielee.biz.ranklist.common.DetailCommonVo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.assertj.core.util.Lists;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public abstract class MovieBaseController extends BaseController{

    /**
     * 从豆瓣接口返回的电影数据解析转换
     * @param searchResult
     * @return
     */
    protected List<DetailCommonVo> movieSearchDataTrans(JSONObject searchResult){
        List<DetailCommonVo> detailCommonVos = Lists.newArrayList();

        if (searchResult != null && CollectionUtils.isNotEmpty(searchResult.getJSONArray("subjects"))) {
            JSONArray jsonArray = searchResult.getJSONArray("subjects");
            List<JSONObject> jsonObjects = jsonArray.toJavaList(JSONObject.class);
            for (JSONObject jo : jsonObjects) {
                DetailCommonVo vo = new DetailCommonVo();
                //标题
                vo.setTitle(jo.getString("title"));
                //图片
                vo.setPic(jo.getJSONObject("images").getString("small"));
                //导演
                JSONArray directorArray = jo.getJSONArray("directors");
                List<JSONObject> directorList = directorArray != null ? directorArray.toJavaList(JSONObject.class) : null;
                StringBuilder directorSB = new StringBuilder();
                directorList.forEach(o -> directorSB.append(o.getString("name")).append(" "));
                vo.setDirector(directorSB.toString());
                //上映日期
                vo.setDate(jo.getString("year"));
                //演员
                JSONArray actorArray = jo.getJSONArray("casts");
                List<JSONObject> actorList = actorArray != null ? actorArray.toJavaList(JSONObject.class) : null;
                StringBuilder actorSB = new StringBuilder();
                actorList.forEach(o -> actorSB.append(o.getString("name")).append(" "));
                vo.setActor(actorSB.toString());
                //评分
                vo.setScore(jo.getJSONObject("rating").getString("average"));
                //评分人数
                vo.setScoreNum(jo.getString("collect_count"));
                //类型
                vo.setType(jo.getJSONArray("genres").toString());

                detailCommonVos.add(vo);
            }
        }

        return detailCommonVos;
    }
}
