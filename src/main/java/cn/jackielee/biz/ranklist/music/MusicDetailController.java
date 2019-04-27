package cn.jackielee.biz.ranklist.music;

import cn.jackielee.biz.ranklist.common.utils.HttpUtil;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import cn.jackielee.biz.ranklist.movie.MovieBaseController;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 音乐详情页
 * Created by lxb on 2019/2/23.
 */
@RestController
@RequestMapping(value = "/music")
public class MusicDetailController extends MusicBaseController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(MusicDetailController.class);

    @Override
    public Object execute() {
        return null;
    }

    /**
     * 音乐详情页
     * test: http://localhost:8080/music/detail?id=30389111
     * https://api.douban.com/v2/music/2337701?apikey=0b2bdeda43b5688921839c8ecb20399b
     * @return
     */
    @RequestMapping(value = "/detail")
    public CommonRespVo<JSONObject> getMusicDetail() {
        try {
            HttpServletRequest request = this.getHttpServletRequest();
            String id = request.getParameter("id");
            String url = String.format("https://api.douban.com/v2/music/%s",id);
            JSONObject jsonObject = HttpUtil.getInfoFromHttpApi(url);
//            List<ListCommonVo> listCommonVos = this.movieListDataTrans(jsonObject);

            if (jsonObject != null) {
                return new CommonRespVo(jsonObject, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取豆瓣音乐详情异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
