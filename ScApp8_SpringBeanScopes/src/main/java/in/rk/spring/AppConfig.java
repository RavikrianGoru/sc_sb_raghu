package in.rk.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "in.rk.spring")
@Configuration
public class AppConfig {
	
	@Bean
	@Scope("singleton")
	public StringBuffer stringBuffer()
	{
		return new StringBuffer("SB obj created through JavaConfiguraion");
	}

}
