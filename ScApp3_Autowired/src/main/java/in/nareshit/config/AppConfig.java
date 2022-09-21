package in.nareshit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "in.nareshit.beans")
@PropertySource("classpath:bean.properties")
public class AppConfig {

}
