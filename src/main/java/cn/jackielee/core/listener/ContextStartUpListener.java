package cn.jackielee.core.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by lxb on 19/01/07.
 */
@Component
public class ContextStartUpListener implements ApplicationListener<ContextRefreshedEvent> {

    public void onApplicationEvent(ContextRefreshedEvent event) {
//        ApplicationContext applicationContext = event.getApplicationContext();
//        RestApiAdvice restApiAdvice = (RestApiAdvice) applicationContext.getBean("restApiAdvice");
//        MyWebExceptionResp resp = (MyWebExceptionResp)applicationContext.getBean("myWebExceptionResp");
//        restApiAdvice.setResp(resp);
    }
}
