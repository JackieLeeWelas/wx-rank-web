package cn.jackielee.biz.ranklist.common.vo;

/**
 * Created by lxb on 2019/1/7.
 */
public enum CommonRespVoCode {
    SUCCESS(200, "成功"),
    FAILED(500, "失败"),
    BIZ_ERROR(501, "业务失败"),
    INVALID_PARAM(502,"无效参数"),
    UNAUTHORIZED(503,"未登录，未授权");

    public int code;
    public String text;

    CommonRespVoCode(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "CommonRespVoCode{" +
                "code=" + code +
                ", text='" + text + '\'' +
                '}';
    }
}
