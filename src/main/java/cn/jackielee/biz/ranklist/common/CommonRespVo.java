package cn.jackielee.biz.ranklist.common;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;

/**
 * Created by lxb on 2019/1/7.
 */
public class CommonRespVo<T> implements Serializable{
    /**
     * 基本错误代码
     */
    private int code = CommonRespVoCode.FAILED.code;

    private String msg = CommonRespVoCode.FAILED.text;

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommonRespVo() {
        code = CommonRespVoCode.FAILED.code;
    }

    public CommonRespVo(T data, int code) {
        this.data = data;
        this.code = code;
    }

    public CommonRespVo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonRespVo(T data,CommonRespVoCode codeEnum) {
        this.code = codeEnum.code;
        this.msg = codeEnum.text;
        this.data = data;
    }

    public CommonRespVo(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonRespVo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + JSON.toJSONString(data) +
                '}';
    }
}
