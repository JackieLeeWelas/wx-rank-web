package cn.jackielee.biz.ranklist.book;

import cn.jackielee.base.BaseController;
import cn.jackielee.biz.ranklist.book.source.BookTop250Data;
import cn.jackielee.biz.ranklist.common.CommonRespVo;
import cn.jackielee.biz.ranklist.common.CommonRespVoCode;
import cn.jackielee.biz.ranklist.game.GameListController;
import cn.jackielee.biz.ranklist.movie.source.DCMovieData;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lxb on 2019/1/7.
 */
@RestController
@RequestMapping(value = "/book")
public class BookListController extends BaseController{
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BookListController.class);

    public Object execute() {return null;}

    /**
     * 豆瓣读书top250书籍
     * http://localhost:8080/book/top250?start=0&limit=10
     * @return
     */
    @RequestMapping(value = "/top250")
    public CommonRespVo<List<JSONObject>> getTop250Book() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(BookTop250Data.bookTop250Data));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取豆瓣读书top250书籍信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
