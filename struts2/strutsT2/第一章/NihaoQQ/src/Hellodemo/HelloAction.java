package Hellodemo;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action{
private String content;
private String uname;

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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		content="���ã�"+uname;
		return Action.SUCCESS;
	}

}
