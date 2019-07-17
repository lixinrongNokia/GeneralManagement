package com.gzwl.demo.util;

/**
 * 
 * @Title: ResultBean.java
 * @Package com.gzwl.oa.utils.weichat
 * @Description: 处理请求返回json字符串对象包装
 * @author lixinrong
 * @date 2019年3月1日 下午3:57:08
 * @version V1.0
 */
public final class ResultBean implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 返回码
	 */
	private int code;
	/**
	 * 请求业务是否成功
	 */
	private boolean result_code;
	/**
	 * 返回结果是否成功
	 */
	private boolean return_code;

	/**
	 * 返回值
	 */
	private Object result;
	/**
	 * 错误返回信息
	 */
	private String msg;
	/**
	 * 分页查询返回页数
	 */
	private int count;

	/**
	 * 请求业务是否成功返回
	 * 
	 * @param code
	 */
	public ResultBean(boolean result_code) {
		this.result_code = result_code;
	}

	/**
	 * 有返回错误信息
	 * 
	 * @param result_code
	 * @param msg
	 */
	public ResultBean(boolean result_code, String msg) {
		this.result_code = result_code;
		this.msg = msg;
	}

	/**
	 * 请求业务成功,是否有结果返回
	 * 
	 * @param return_code
	 * @param result_code
	 */
	public ResultBean(boolean result_code, boolean return_code) {
		this.return_code = return_code;
		this.result_code = result_code;
	}

	/**
	 * @param result_code
	 * @param return_code
	 * @param code
	 */
	public ResultBean(boolean result_code, boolean return_code, int code) {
		this.result_code = result_code;
		this.return_code = return_code;
		this.code = code;
	}

	/**
	 * 全部成功又有返回结果时返回
	 * 
	 * @param return_code
	 * @param result_code
	 * @param result
	 */
	public ResultBean(boolean result_code, boolean return_code, Object result) {
		this.return_code = return_code;
		this.result_code = result_code;
		this.result = result;
	}

	/**
	 * @param result_code
	 * @param return_code
	 * @param result
	 * @param count
	 */
	public ResultBean(boolean result_code, boolean return_code, Object result, int count) {
		this.result_code = result_code;
		this.return_code = return_code;
		this.result = result;
		this.count = count;
	}

	/**
	 * @return the return_code
	 */
	public boolean isReturn_code() {
		return return_code;
	}

	/**
	 * @param return_code the return_code to set
	 */
	public void setReturn_code(boolean return_code) {
		this.return_code = return_code;
	}

	/**
	 * @return the result_code
	 */
	public boolean isResult_code() {
		return result_code;
	}

	/**
	 * @param result_code the result_code to set
	 */
	public void setResult_code(boolean result_code) {
		this.result_code = result_code;
	}

	/**
	 * @return the result
	 */
	public Object getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(Object result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
