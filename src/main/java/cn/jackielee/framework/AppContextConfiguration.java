package cn.jackielee.framework;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lxb on 19/01/07.
 */
@Configuration
@ImportResource(locations = {
        "classpath*:config/spring/appcontext-*.xml",
        "classpath*:config/spring/local/appcontext-*.xml"
})

public class AppContextConfiguration extends WebMvcConfigurerAdapter {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }
}
