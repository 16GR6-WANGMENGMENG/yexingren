package strue;

import org.aopalliance.intercept.Invocation;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LinJieQi extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation  invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("我要开始拦截喽！！");
	
		String stu=invocation.invoke();//请求放行，交给下一个拦截器或Action组件
		System.out.println("返回代码"+stu);
		return stu;
	}

}
