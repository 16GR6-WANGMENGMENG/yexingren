package denlu01;

import org.jboss.interceptor.InterceptorException;

import com.opensymphony.xwork2.Action;

public class lanjieqi01 implements Action {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
     public String timems() throws InterruptedException {
    	Thread.sleep(1000);
		return INPUT;
    	 
     }
	
}
