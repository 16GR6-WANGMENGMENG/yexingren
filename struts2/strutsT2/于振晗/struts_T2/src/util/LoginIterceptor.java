package util;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginIterceptor extends MethodFilterInterceptor{
//������  ��û�е�½ʱ�����������ʱ����ת����½ҳ��
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		String userName = ServletActionContext.getRequest().getParameter("userName");
		if(userName.length()<3){
			//�ص���¼ҳ��
			return "red";
		}else{
			//����
			return  invocation.invoke();
		}
	}

}
