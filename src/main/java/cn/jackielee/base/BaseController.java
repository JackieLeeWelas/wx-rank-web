package cn.jackielee.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Created by lxb on 2019/1/7.
 */
public abstract class BaseController<T> {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BaseController.class);

    public abstract T execute();

    protected HttpServletRequest getHttpServletRequest() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();

        return request;
    }

    protected HttpServletResponse getHttpServletResponse() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletResponse response = sra.getResponse();
        return response;
    }

    protected Map<String, String> getCookieMap() {
        HttpServletRequest request = this.getHttpServletRequest();
        Cookie[] cookies = request.getCookies();
        Map<String, String> res = Maps.newHashMap();
        if (cookies != null) {
            for (Cookie ck : cookies) {
                res.put(ck.getName(), ck.getValue());
            }
        }
        return res;
    }

    //分页获取结果
    protected List<JSONObject> getSubList(List<JSONObject> allList){
        List<JSONObject> result = Lists.newArrayList();
        HttpServletRequest request = this.getHttpServletRequest();
        String start = request.getParameter("start");
        String limit = request.getParameter("limit");
        int startInt = NumberUtils.toInt(start);
        int limitInt = NumberUtils.toInt(limit);
        int end = startInt + limitInt;
        if (CollectionUtils.isNotEmpty(allList) && startInt < allList.size()) {
            if (end >= allList.size()){
                end = allList.size();
            }
            result = allList.subList(startInt, end);
        }
        return result;
    }
}
