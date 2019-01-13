package denlu01;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class denluAction implements Action{
 
	@Override
	public String execute() throws Exception {
		HttpServletRequest req=ServletActionContext.getRequest();
		String user=req.getParameter("username");
		user us=new user();
		us.setName(user);
		String pwd=req.getParameter("pwd");
		System.out.println(user+pwd);
		if (user!=null&& !"".equals(user)&&pwd!=null &&!"".equals(pwd)) {
			if (user.equals("zxc")&&pwd.equals("123")) {
				req.setAttribute("name", user);
				return Action.SUCCESS;
			}else {
				return Action.ERROR;
			}
		} else{
			return Action.NONE;
		}
		
	}

}
