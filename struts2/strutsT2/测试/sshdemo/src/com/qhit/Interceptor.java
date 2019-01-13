package com.qhit;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionInvocation;

public interface Interceptor  extends Serializable{
	
	void destroy();
	void init();
	String interceptor(ActionInvocation invocation)throws Exception;

}
