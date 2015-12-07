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
        Notice n = (Notice)context.getBean("notice");
        
        /*n.setTitle("hello");*/
        
        System.out.println(n.getTitle());
    }
}
