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

/**
 * Created by lxb on 2019/1/7.
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = "/book")
public class BookListController extends BaseController{
    public Object execute() {return null;}

    @RequestMapping(value = "/top250")
    public CommonRespVo<JSONObject> getTop250Book() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            JSONObject result = this.getTop250BookListFromDoubanApi(start, limit);
            if (result != null) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS.code);
            }
        }catch (Exception e){
            log.error("获取豆瓣top250书籍异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code,"未获取到数据");
    }

    private JSONObject getTop250BookListFromDoubanApi(String start, String limit){
        String url = "https://api.douban.com/v2/movie/top250?start=%s&count=%s";
        String finalUrl = String.format(url,start,limit);
        return this.getInfoFromHttpApi(finalUrl);
    }

}
