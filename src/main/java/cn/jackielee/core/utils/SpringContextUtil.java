package cn.jackielee.core.utils;

import org.springframework.context.ApplicationContext;

public class SpringContextUtil {
	private static ApplicationContext applicationContext;

	public static void setApplicationContext(ApplicationContext context) {
	    applicationContext = context;
	  }
	  
	public static Object getBean(String beanId) {
	    return applicationContext.getBean(beanId);
	  }
}