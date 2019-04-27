package cn.jackielee.biz.ranklist.book;

import cn.jackielee.biz.ranklist.common.utils.HttpUtil;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import cn.jackielee.biz.ranklist.movie.MovieBaseController;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 书籍详情页
 * Created by lxb on 2019/2/23.
 */
@RestController
@RequestMapping(value = "/book")
public class BookDetailController extends BookBaseController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BookDetailController.class);

    private static String BOOK_DETAIL_URL = "https://api.douban.com/v2/book/%s?apikey=0b2bdeda43b5688921839c8ecb20399b";

    @Override
    public Object execute() {
        return null;
    }

    /**
     * 书籍详情页
     * test: http://localhost:8080/book/detail?id=3860856
     * https://api.douban.com/v2/book/2337701?apikey=0b2bdeda43b5688921839c8ecb20399b
     * @return
     */
    @RequestMapping(value = "/detail")
    public CommonRespVo<JSONObject> getMovieDetail() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String id = request.getParameter("id");
            if (StringUtils.isNotEmpty(id)) {
                String url = String.format(BOOK_DETAIL_URL, id);
                JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
                if (jsonObject != null) {
                    return new CommonRespVo(jsonObject, CommonRespVoCode.SUCCESS);
                }
            }
        } catch (Exception e) {
            log.error("获取豆瓣书籍详情异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
