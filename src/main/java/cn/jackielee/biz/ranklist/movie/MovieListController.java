package cn.jackielee.biz.ranklist.movie;

import cn.jackielee.biz.ranklist.common.utils.HttpUtil;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import cn.jackielee.biz.ranklist.common.vo.ListCommonVo;
import cn.jackielee.biz.ranklist.movie.source.ChinaTicketTopMovieData;
import cn.jackielee.biz.ranklist.movie.source.ChinaTopMovieData;
import cn.jackielee.biz.ranklist.movie.source.DCMovieData;
import cn.jackielee.biz.ranklist.movie.source.WorldTicketTopMovieData;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 电影列表页
 * Created by lxb on 2019/1/7.
 */
@RestController
@RequestMapping(value = "/movie")
public class MovieListController extends MovieBaseController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(MovieListController.class);

    public Object execute() {
        return null;
    }

    /**
     * 华语top100电影
     * test: http://localhost:8080/movie/chinaTopMovie?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/chinaTopMovie")
    public CommonRespVo<List<JSONObject>> getChinaTopMovie() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(ChinaTopMovieData.chinaTopMovieData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取华语Top电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 华语票房榜电影
     * test: http://localhost:8080/movie/chinaTicketTopMovie?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/chinaTicketTopMovie")
    public CommonRespVo<List<JSONObject>> getChinaTicketTopMovie() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(ChinaTicketTopMovieData.chinaTicketTopMovieData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取国内票房榜信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 世界票房榜电影
     * test: http://localhost:8080/movie/worldTicketTopMovie?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/worldTicketTopMovie")
    public CommonRespVo<List<JSONObject>> getWorldTicketTopMovie() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(WorldTicketTopMovieData.worldTicketTopMovieData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取世界票房榜电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 漫威电影推荐
     * test: http://localhost:8080/movie/dCMovie?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/dCMovie")
    public CommonRespVo<List<JSONObject>> getdCMovie() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(DCMovieData.dCMovieData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取世界票房榜电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 豆瓣top250电影
     * test: http://localhost:8080/movie/top250?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/top250")
    public CommonRespVo<List<ListCommonVo>> getMovieTop250() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            String url = String.format("https://api.douban.com/v2/movie/top250?start=%s&count=%s",start,limit);
            JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
            List<ListCommonVo> listCommonVos = this.movieListDataTrans(jsonObject);

            if (CollectionUtils.isNotEmpty(listCommonVos)) {
                return new CommonRespVo(listCommonVos, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取豆瓣top250电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 豆瓣正在热映的电影
     * test: http://localhost:8080/movie/inTheaters?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/inTheaters")
    public CommonRespVo<List<ListCommonVo>> getMovieInTheaters() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            String url = String.format("https://api.douban.com/v2/movie/in_theaters?start=%s&count=%s",start,limit);
            JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
            List<ListCommonVo> listCommonVos = this.movieListDataTrans(jsonObject);

            if (CollectionUtils.isNotEmpty(listCommonVos)) {
                return new CommonRespVo(listCommonVos, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取豆瓣正在热映电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 豆瓣即将上映的电影
     * test: http://localhost:8080/movie/comingSoon?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/comingSoon")
    public CommonRespVo<List<ListCommonVo>> getMovieComingSoon() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            String url = String.format("https://api.douban.com/v2/movie/coming_soon?start=%s&count=%s",start,limit);
            JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
            List<ListCommonVo> listCommonVos = this.movieListDataTrans(jsonObject);

            if (CollectionUtils.isNotEmpty(listCommonVos)) {
                return new CommonRespVo(listCommonVos, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取豆瓣即将上映电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
