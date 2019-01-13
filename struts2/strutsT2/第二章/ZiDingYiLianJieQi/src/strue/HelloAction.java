package strue;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
	private String content;

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		content = "Hello Worder!";
		return Action.SUCCESS;
	}


	public HelloAction(String content) {
		super();
		this.content = content;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public HelloAction() {
		super();
		// TODO Auto-generated constructor stub
	}

}
