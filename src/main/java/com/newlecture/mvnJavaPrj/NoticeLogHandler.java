package com.newlecture.mvnJavaPrj;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class NoticeLogHandler implements InvocationHandler {
	private Notice 왕자;
	public NoticeLogHandler(Notice 왕자) {
		this.왕자 = 왕자;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Log log = LogFactory.getLog(this.getClass());
		//시작시간을 재고
		StopWatch sw = new StopWatch();
		sw.start();
		
		//실제 왕자님의 서비스 함술ㄹ 호출
		String title = (String)method.invoke(왕자, args);
		//끝 시간을 재고
		sw.stop();
		
		log.info("[함수 호출 지연시간]:" + sw.getTotalTimeMillis() + "ms가 소요되었습니다");
		return title;
	}

}
