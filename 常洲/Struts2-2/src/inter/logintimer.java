package inter;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import denlu01.user;

public class logintimer extends AbstractInterceptor {
   
   user us=new user();
   
	public String intercept(ActionInvocation arg) throws Exception {
		// TODO Auto-generated method stub
		String username= us.getName();
		int ac=username.length();
		System.out.println("À¹½ØÆ÷²âÊÔ");
		if (ac>=3) {
			return arg.invoke();
		} else {
			return Action.ERROR;
		}
		
	}

}
