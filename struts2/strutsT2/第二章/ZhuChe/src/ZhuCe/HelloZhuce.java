package ZhuCe;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
public class HelloZhuce implements Action{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		String uname = request.getParameter("user");
		if(uname!=null&&""!=uname){
		if(uname.length()<3){
			return ERROR;
		}else{
			return SUCCESS;
			
		}
		}
		return NONE;
	}
	

}
