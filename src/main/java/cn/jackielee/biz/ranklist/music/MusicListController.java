package cn.jackielee.biz.ranklist.music;

import cn.jackielee.biz.ranklist.common.vo.CommonRespVo;
import cn.jackielee.biz.ranklist.common.vo.CommonRespVoCode;
import cn.jackielee.biz.ranklist.music.source.DouYinTopMusicData;
import cn.jackielee.biz.ranklist.music.source.HotTopMusicData;
import cn.jackielee.biz.ranklist.music.source.NewTopMusicData;
import cn.jackielee.biz.ranklist.music.source.OriginTopMusicData;
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
@RequestMapping(value = "/music")
public class MusicListController extends MusicBaseController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(MusicListController.class);

    public Object execute() {
        return null;
    }

    /**
     * 抖音top100音乐
     * test: http://localhost:8080/music/douYinTopMusic?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/douYinTopMusic")
    public CommonRespVo<List<JSONObject>> getDouYinTopMusic() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(DouYinTopMusicData.douYinTopMusicData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取抖音top100音乐信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 新歌top音乐
     * test: http://localhost:8080/music/newTopMusic?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/newTopMusic")
    public CommonRespVo<List<JSONObject>> getNewTopMusic() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(NewTopMusicData.newTopMusicData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取新歌top音乐信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 热歌top音乐
     * test: http://localhost:8080/music/hotTopMusic?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/hotTopMusic")
    public CommonRespVo<List<JSONObject>> getHotTopMusic() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(HotTopMusicData.hotTopMusicData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取热歌top音乐信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 原创top音乐
     * test: http://localhost:8080/music/originTopMusic?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/originTopMusic")
    public CommonRespVo<List<JSONObject>> getOriginTopMusic() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(OriginTopMusicData.originTopMusicData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取原创top音乐信息异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
