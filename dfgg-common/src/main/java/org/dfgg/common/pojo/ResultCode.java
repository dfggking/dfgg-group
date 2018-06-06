package org.dfgg.common.pojo;

/**
 * 定义枚举类ResultCode
 * @author jinyingfei - 835317619@qq.com
 * @create 2018-05-29
 */
public enum ResultCode {

	/** 成功 */
	SUCCESS("SUCCESS", "成功"),

    /** 操作失败 */
    FAIL("FAIL", "操作失败"),

    /** 数据已存在 */
    DATA_IS_HAVE("DATA_IS_HAVE", "数据已存在"),

    /** 没有结果 */
    NOT_DATA("NOT_DATA", "没有结果"),

    /** 没有登录 */
    NOT_LOGIN("NOT_LOGIN", "没有登录"),

    /** 发生异常 */
    EXCEPTION("EXCEPTION", "发生异常"),

    /** 系统错误 */
    SYS_ERROR("SYS_ERROR", "系统错误"),

    /** 参数错误 */
    PARAMS_ERROR("PARAMS_ERROR", "参数错误 "),
    
    /** 参数非空 */
    PARAMS_NOT_NULL("PARAMS_NOT_NULL", "参数非空"),

    /** 不支持或已经废弃 */
    NOT_SUPPORTED("NOT_SUPPORTED", "不支持或已经废弃"),

    /** AuthCode错误 */
    INVALID_AUTHCODE("INVALID_AUTHCODE", "无效的AuthCode"),

    /** 太频繁的调用 */
    TOO_FREQUENT("TOO_FREQUENT", "太频繁的调用"),

    /** 未知的错误 */
    UNKNOWN_ERROR("UNKNOWN_ERROR", "未知错误"),

    /** 未设置方法 */
    NO_METHOD("NO_METHOD", "未设置方法");
	
	private String val;
	private String msg;
	
	private ResultCode(String value, String msg) {
		this.val = value;
		this.msg = msg;
	}
	
	public String val() {
		return val;
	}
	public String msg() {
		return msg;
	}
}
