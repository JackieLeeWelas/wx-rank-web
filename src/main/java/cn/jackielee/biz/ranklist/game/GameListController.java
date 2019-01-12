package cn.jackielee.biz.ranklist.game;

import cn.jackielee.base.BaseController;
import cn.jackielee.biz.ranklist.common.CommonRespVo;
import cn.jackielee.biz.ranklist.common.CommonRespVoCode;
import cn.jackielee.biz.ranklist.game.source.AndroidTopGameData;
import cn.jackielee.biz.ranklist.game.source.ClientTopGameData;
import cn.jackielee.biz.ranklist.game.source.IOSTopGameData;
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
@RequestMapping(value = "/game")
public class GameListController extends BaseController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(GameListController.class);

    public Object execute() {
        return null;
    }

    /**
     * ios游戏排行榜
     * test: http://localhost:8080/game/iosTopGame?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/iosTopGame")
    public CommonRespVo<List<JSONObject>> getIosTopGame() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(IOSTopGameData.iOSTopGameData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取ios游戏排行榜异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * android游戏排行榜
     * test: http://localhost:8080/game/androidTopGame?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/androidTopGame")
    public CommonRespVo<List<JSONObject>> getAndroidTopGame() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(AndroidTopGameData.androidTopGameData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取android游戏排行榜异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }

    /**
     * 端游游戏排行榜
     * test: http://localhost:8080/game/clientTopGame?start=0&limit=10
     *
     * @return
     */
    @RequestMapping(value = "/clientTopGame")
    public CommonRespVo<List<JSONObject>> getClientTopGame() {
        try {
            List<JSONObject> result = this.getSubList(Lists.newArrayList(ClientTopGameData.clientTopGameData));
            if (CollectionUtils.isNotEmpty(result)) {
                return new CommonRespVo(result, CommonRespVoCode.SUCCESS);
            }
        } catch (Exception e) {
            log.error("获取android游戏排行榜异常",e);
        }
        return new CommonRespVo(CommonRespVoCode.FAILED.code, "未获取到数据");
    }
}
