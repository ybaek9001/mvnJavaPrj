package com.newlecture.mvnJavaPrj;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogAroundAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation method) throws Throwable {
		Log log = LogFactory.getLog(this.getClass());
		//시작시간을 재고
		StopWatch sw = new StopWatch();
		sw.start();
		
		//실제 왕자님의 서비스 함술ㄹ 호출
		String title = (String)method.proceed();
		//끝 시간을 재고
		sw.stop();
		
		log.info("[함수 호출 지연시간]:" + sw.getTotalTimeMillis() + "ms가 소요되었습니다");
		return title;
	}
	
	
}
