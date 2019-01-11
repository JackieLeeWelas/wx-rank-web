package cn.jackielee;

import cn.jackielee.core.utils.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigurationProperties
@SpringBootApplication(
		exclude = {DataSourceAutoConfiguration.class, MongoAutoConfiguration.class},
		scanBasePackages = {"cn.jackielee"})
public class WxRankWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(WxRankWebApplication.class, args);
		SpringContextUtil.setApplicationContext(run);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WxRankWebApplication.class);
	}
}
