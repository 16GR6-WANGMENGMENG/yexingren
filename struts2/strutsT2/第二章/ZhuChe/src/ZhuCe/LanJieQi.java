package ZhuCe;

import com.google.common.collect.AbstractIterator;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LanJieQi extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("��Ҫ��ʼ����ඣ���");
		
		String stu=invocation.invoke();//������У�������һ����������Action���
		System.out.println("���ش���"+stu);
		return stu;

	}

}
