package cn.jackielee.biz.ranklist.movie;

import cn.jackielee.base.BaseController;
import cn.jackielee.biz.ranklist.common.CommonRespVo;
import cn.jackielee.biz.ranklist.common.CommonRespVoCode;
import cn.jackielee.biz.ranklist.movie.source.ChinaTicketRankSource;
import cn.jackielee.biz.ranklist.movie.source.ChinaTopMovieSource;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.assertj.core.util.Lists;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lxb on 2019/1/7.
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = "/movie")
public class MovieListController extends BaseController {
    public Object execute() {
        return null;
    }

    //http://localhost:8080/jackielee/rank/movie/chinaTopMovie?start=0&limit=10
    @RequestMapping(value = "/chinaTopMovie")
    public CommonRespVo<List<JSONObject>> getChinaTopMovie() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            List<JSONObject> allChinaTopMovies = Lists.newArrayList(ChinaTopMovieSource.chinaTopMoviesJSON);
            int startInt = NumberUtils.toInt(start);
            int limitInt = NumberUtils.toInt(limit);
            List<JSONObject> result = allChinaTopMovies.subList(startInt,startInt + limitInt);
            if (result != null) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        }catch (Exception e){
            log.error("获取华语Top电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code,"未获取到数据");
    }

    @RequestMapping(value = "/chinaTicketTopMovie")
    public CommonRespVo<List<JSONObject>> getChinaTicketTopMovie() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            List<JSONObject> allChinaTicketTopMovie = Lists.newArrayList(ChinaTicketRankSource.chinaTicketRankJSON);
            int startInt = NumberUtils.toInt(start);
            int limitInt = NumberUtils.toInt(limit);
            List<JSONObject> result = allChinaTicketTopMovie.subList(startInt,startInt + limitInt);
            if (result != null) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        }catch (Exception e){
            log.error("获取国内票房榜信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code,"未获取到数据");
    }
}
