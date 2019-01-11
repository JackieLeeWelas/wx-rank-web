package cn.jackielee.biz.ranklist.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by lxb on 2019/1/7.
 */
@Data
public class CommonRespVo<T> implements Serializable{
    /**
     * 基本错误代码
     */
    private int code = CommonRespVoCode.FAILED.code;

    private String msg = CommonRespVoCode.FAILED.text;

    private T data;

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
}
