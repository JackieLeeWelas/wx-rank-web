package cn.jackielee.biz.ranklist.book;

import cn.jackielee.base.BaseController;
import cn.jackielee.biz.ranklist.common.CommonRespVo;
import cn.jackielee.biz.ranklist.common.CommonRespVoCode;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lxb on 2019/1/7.
 */
@Slf4j
@RestController
@RequestMapping(value = "/book")
public class BookListController extends BaseController{
    public Object execute() {return null;}

    // http://localhost:8080/book/top250?start=0&limit=10
    @RequestMapping(value = "/top250")
    public CommonRespVo<List<JSONObject>> getTop250Book() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            List<JSONObject> result = this.getTop250BookListFromDoubanApi(start, limit);
            if (result != null) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        }catch (Exception e){
//            log.error("获取豆瓣top250书籍异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code,"获取不到豆瓣top250书籍");
    }

    private List<JSONObject> getTop250BookListFromDoubanApi(String start, String limit){
        String url = "https://api.douban.com/v2/movie/top250?start=%s&count=%s";
        String finalUrl = String.format(url,start,limit);
        return this.getInfoFromHttpApi(finalUrl);
    }

}
