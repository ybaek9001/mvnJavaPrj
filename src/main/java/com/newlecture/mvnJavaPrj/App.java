package com.newlecture.mvnJavaPrj;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	/*Notice n = new NewNotice();
    	n.setTitle("Hello");*/
    	
    	/*Notice proxy = (Notice)Proxy.newProxyInstance(
					    					n.getClass().getClassLoader(), 
					    					n.getClass().getInterfaces(), 
					    					new NoticeLogHandler(n));*/
    	
    	
    	//System.out.println(proxy.getTitle());
    	
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("com/newlecture/mvnJavaPrj/spring-config.xml"); //같은 패키지 안에 있으므로
        Notice n = (Notice)context.getBean("notice");  /*spring-config설정에 따라 진짜가 될 수 도 가짜가 될 수도 있음(지금은 가짜가 사용)*/
        
        /*n.setTitle("hello");*/
        
        System.out.println(n.getTitle());
    }
}
