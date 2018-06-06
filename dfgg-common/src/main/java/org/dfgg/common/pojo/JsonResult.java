package org.dfgg.common.pojo;

import com.alibaba.fastjson.JSONObject;

/**
 * JsonResult结果集
 * @author jinyingfei - 835317619@qq.com
 * @create 2018-05-29
 */
public class JsonResult {

	private String code;
	private String codeMsg;
	private String msg;
	private Object data;
	private String errorMsg;
	
	public JsonResult() {
		this.setCode(ResultCode.SUCCESS);
		this.setCodeMsg("成功");
	}
	
	public JsonResult(ResultCode code) {
		this.setCode(code);
		this.setCodeMsg(code.msg());
	}
	
	public JsonResult(ResultCode code, String msg) {
		this.setCode(code);
		this.setCodeMsg(code.msg());
		this.setMsg(msg);
	}
	
	public JsonResult(ResultCode code, Object data) {
		this.setCode(code);
		this.setCodeMsg(code.msg());
		this.setData(data);
	}
	
	public JsonResult(ResultCode code, String msg, Object data) {
		this.setCode(code);
		this.setCodeMsg(code.msg());
		this.setMsg(msg);
		this.setData(data);
	}
	
	public JsonResult(ResultCode code, String msg, String errorMsg) {
		this.setCode(code);
		this.setCodeMsg(code.msg());
		this.setMsg(msg);
		this.setErrorMsg(errorMsg);
	}
	
	public String toString() {
		JSONObject json = new JSONObject();
		json.put("code", code);
		json.put("codeMsg", codeMsg);
		json.put("msg", msg);
		json.put("data", data);
		return json.toString();
	}
	public String getCode() {
		return code;
	}
	public void setCode(ResultCode code) {
		this.code = code.val();
	}
	public String getCodeMsg() {
		return codeMsg;
	}
	public void setCodeMsg(String codeMsg) {
		this.codeMsg = codeMsg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
