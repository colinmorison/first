package com.next.first.pojo.common;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.next.first.pojo.dto.User;

public class CommonResponseObject<T> {
	public static String RESPONSE_OK = "200";
	public static String RESPONSE_OK_MSG = "成功";
	
	public CommonResponseObject(String responseCode,String responseMsg) {
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
	}
	private Integer total;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	private List<T> rows;
	private String responseCode;
	private String responseMsg;

}
