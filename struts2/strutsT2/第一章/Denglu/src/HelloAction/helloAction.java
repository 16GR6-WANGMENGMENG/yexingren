package HelloAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.omg.PortableServer.ServantActivator;

import com.opensymphony.xwork2.Action;


public class helloAction implements Action {
	private String content;
	private String uname;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		String uname = request.getParameter("uname");
		String mima = request.getParameter("umima");
		if(uname!=null&&""!=uname&&mima!=null&&""!=mima){
			if("zhangsan".equals(uname)&&"123".equals(mima)){
				request.setAttribute("uname", uname);
				return Action.SUCCESS;
				
			}else{
				return Action.ERROR;
			}
		}
		//ц╩сп
		return Action.NONE;
		
	}

}
