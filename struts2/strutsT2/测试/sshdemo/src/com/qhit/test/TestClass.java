package com.qhit.test;

import com.qhit.Action;

public class TestClass  implements Action {
	 private String content;
	 private String uname;
	 private String upassword;
	 
	 
	 
	 
	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public String getUname() {
		return uname;
	}




	public void setUname(String uname) {
		this.uname = uname;
	}




	public String getUpassword() {
		return upassword;
	}




	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}




	@Override
	public String execute() throws Exception {
		content="用户名:"+uname+"密码:"+upassword;
		return Action.SUCCESS;
	}

}
