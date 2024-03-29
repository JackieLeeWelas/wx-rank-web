package cn.jackielee.base;

import cn.jackielee.biz.ranklist.common.CommonRespVo;
import cn.jackielee.biz.ranklist.common.CommonRespVoCode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.assertj.core.util.Lists;
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

    protected JSONObject getInfoFromHttpApi(String url){
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return JSON.parseObject(result);
    }
}
