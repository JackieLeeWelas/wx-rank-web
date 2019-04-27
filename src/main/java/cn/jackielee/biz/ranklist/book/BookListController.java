package cn.jackielee.biz.ranklist.book;

import cn.jackielee.base.BaseController;
import cn.jackielee.biz.ranklist.book.source.BookTop250Data;
import cn.jackielee.biz.ranklist.book.source.DDHotSaleBookTop100Data;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * 当当畅销书top100书籍
     * http://localhost:8080/book/hotsaletop100?start=0&limit=10
     * @return
     */
    @RequestMapping(value = "/hotsaletop100")
    public CommonRespVo<List<JSONObject>> getHotSaleTop100Book() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(DDHotSaleBookTop100Data.DangDangHotSaleBookTop100Data));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取当当畅销书top100书籍信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
