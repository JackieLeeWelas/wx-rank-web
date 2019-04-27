package cn.jackielee.biz.ranklist.book;

import cn.jackielee.biz.ranklist.common.utils.HttpUtil;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import cn.jackielee.biz.ranklist.common.vo.ListCommonVo;
import cn.jackielee.biz.ranklist.music.MusicBaseController;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by lxb on 2019/4/24.
 */
@RestController
@RequestMapping(value = "/book")
public class BookSearchController extends BookBaseController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BookSearchController.class);

    /**
     * 搜索书籍，type=0搜关键词，type=1搜类型
     * http://localhost:8080/book/search?start=0&limit=10&keyWord=论语&type=0
     * @return
     */
    @RequestMapping(value = "/search")
    public CommonRespVo<List<ListCommonVo>> execute() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String keyWord = request.getParameter("keyWord");
            String start = request.getParameter("start");
            String limit = request.getParameter("limit");
            String type = request.getParameter("type");

            List<ListCommonVo> searchResult = this.searchBook(keyWord, start, limit, type);
            if (CollectionUtils.isNotEmpty(searchResult)) {
                return new CommonRespVo(searchResult, CommonRespVoCode.SUCCESS);
            }
        }catch (Exception e){
            log.error("搜索书籍异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 搜索书籍，type=0搜关键词，type=1搜类型
     * @param keyWord
     * @param start
     * @param limit
     * @param type
     * @return
     */
    private List<ListCommonVo> searchBook(String keyWord, String start, String limit, String type){
        try {
            keyWord = URLEncoder.encode(keyWord,"UTF-8");
        } catch (Exception e) {
            log.error("书籍搜索encode搜索词异常",e);
        }
        String url = String.format("https://api.douban.com/v2/book/search?q=%s&start=%s&count=%s&apikey=0b2bdeda43b5688921839c8ecb20399b",keyWord,start,limit);
        if ("1".equalsIgnoreCase(type)){
            url = String.format("https://api.douban.com/v2/book/search?tag=%s&start=%s&count=%sapikey=0b2bdeda43b5688921839c8ecb20399b",keyWord,start,limit);
        }

        JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
        List<ListCommonVo> listCommonVos = this.bookListDataTrans(jsonObject);
        return listCommonVos;
    }
}
