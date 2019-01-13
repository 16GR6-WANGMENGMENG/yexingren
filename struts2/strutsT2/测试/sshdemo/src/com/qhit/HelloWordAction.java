package com.qhit;

public class HelloWordAction implements Action {
    private String content;
    
    
	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String execute() throws Exception {
		content="Hello,word";
		return Action.SUCCESS;
	}

}
