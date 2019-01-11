package cn.jackielee.biz.ranklist.movie;

import cn.jackielee.base.BaseController;
import cn.jackielee.biz.ranklist.common.CommonRespVo;
import cn.jackielee.biz.ranklist.common.CommonRespVoCode;
import cn.jackielee.biz.ranklist.movie.source.ChinaTicketTopMovieData;
import cn.jackielee.biz.ranklist.movie.source.ChinaTopMovieData;
import cn.jackielee.biz.ranklist.movie.source.DCMovieData;
import cn.jackielee.biz.ranklist.movie.source.WorldTicketTopMovieData;
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

    /**
     * 华语top100电影
     * test: http://localhost:8080/movie/chinaTopMovie?start=0&limit=10
     * @return
     */
    @RequestMapping(value = "/chinaTopMovie")
    public CommonRespVo<List<JSONObject>> getChinaTopMovie() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            List<JSONObject> allChinaTopMovies = Lists.newArrayList(ChinaTopMovieData.chinaTopMovieData);
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

    /**
     * 华语票房榜电影
     * test: http://localhost:8080/movie/chinaTicketTopMovie?start=0&limit=10
     * @return
     */
    @RequestMapping(value = "/chinaTicketTopMovie")
    public CommonRespVo<List<JSONObject>> getChinaTicketTopMovie() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            List<JSONObject> allChinaTicketTopMovie = Lists.newArrayList(ChinaTicketTopMovieData.chinaTicketTopMovieData);
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

    /**
     * 世界票房榜电影
     * test: http://localhost:8080/movie/worldTicketTopMovie?start=0&limit=10
     * @return
     */
    @RequestMapping(value = "/worldTicketTopMovie")
    public CommonRespVo<List<JSONObject>> getWorldTicketTopMovie() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            List<JSONObject> worldTicketTopMovieData = Lists.newArrayList(WorldTicketTopMovieData.worldTicketTopMovieData);
            int startInt = NumberUtils.toInt(start);
            int limitInt = NumberUtils.toInt(limit);
            List<JSONObject> result = worldTicketTopMovieData.subList(startInt,startInt + limitInt);
            if (result != null) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        }catch (Exception e){
            log.error("获取世界票房榜电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code,"未获取到数据");
    }

    /**
     * 漫威电影推荐
     * test: http://localhost:8080/movie/dCMovie?start=0&limit=10
     * @return
     */
    @RequestMapping(value = "/dCMovie")
    public CommonRespVo<List<JSONObject>> getdCMovie() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            List<JSONObject> dCMovieData = Lists.newArrayList(DCMovieData.dCMovieData);
            int startInt = NumberUtils.toInt(start);
            int limitInt = NumberUtils.toInt(limit);
            List<JSONObject> result = dCMovieData.subList(startInt,startInt + limitInt);
            if (result != null) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        }catch (Exception e){
            log.error("获取世界票房榜电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code,"未获取到数据");
    }
}
