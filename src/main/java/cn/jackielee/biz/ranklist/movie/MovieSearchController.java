package cn.jackielee.biz.ranklist.movie;

import cn.jackielee.base.MovieBaseController;
import cn.jackielee.biz.ranklist.common.utils.HttpUtil;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import cn.jackielee.biz.ranklist.common.vo.DetailCommonVo;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
@RestController
@RequestMapping(value = "/movie")
public class MovieSearchController extends MovieBaseController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(MovieSearchController.class);


    /**
     * 搜索搜索电影，type=0搜关键词，type=1搜类型
     * http://localhost:8080/movie/search?start=0&limit=10&keyWord=海王&type=0
     * @return
     */
    @RequestMapping(value = "/search")
    public CommonRespVo<List<DetailCommonVo>> execute() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String keyWord = request.getParameter("keyWord");
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            String type = request.getParameter("type");

            List<DetailCommonVo> searchResult = this.searchMovie(keyWord, start, limit, type);
            if (CollectionUtils.isNotEmpty(searchResult)) {
                return new CommonRespVo(searchResult, CommonRespVoCode.SUCCESS);
            }
        }catch (Exception e){
            log.error("搜索电影异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 搜索电影，type=0搜关键词，type=1搜类型
     * @param keyWord
     * @param start
     * @param limit
     * @param type
     * @return
     */
    private List<DetailCommonVo> searchMovie(String keyWord, String start, String limit,String type){
        try {
            keyWord = URLEncoder.encode(keyWord,"UTF-8");
        } catch (Exception e) {
            log.error("电影搜索encode搜索词异常",e);
        }
        String url = String.format("http://api.douban.com/v2/movie/search?q=%s&start=%s&count=%s",keyWord,start,limit);
        if ("1".equalsIgnoreCase(type)){
            url = String.format("http://api.douban.com/v2/movie/search?tag=%s&start=%s&count=%s",keyWord,start,limit);
        }

        JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
        List<DetailCommonVo> detailCommonVos = this.movieSearchDataTrans(jsonObject);
        return detailCommonVos;
    }
}
