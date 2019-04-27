package cn.jackielee.biz.ranklist.movie;

import cn.jackielee.biz.ranklist.common.utils.HttpUtil;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lxb on 2019/2/23.
 */
@RestController
@RequestMapping(value = "/movie")
public class MovieCommentController extends MovieBaseController{
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(MovieCommentController.class);

    @Override
    public Object execute() {
        return null;
    }

    /**
     * 电影详情页
     * test: http://localhost:8080/movie/comments?id=26266893
     * https://api.douban.com/v2/movie/subject/%s/comments?apikey=0b2bdeda43b5688921839c8ecb20399b
     * @return
     */
    @RequestMapping(value = "/comments")
    public CommonRespVo<JSONObject> getMovieComments() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            //电影Id
            String id = request.getParameter("id");
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            String url = String.format("https://api.douban.com/v2/movie/subject/%s/comments?apikey=0b2bdeda43b5688921839c8ecb20399b&start=%s&count=%s",id,start,limit);
            JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
            if (jsonObject != null) {
                return new CommonRespVo(jsonObject, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取豆瓣即将上映电影信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
