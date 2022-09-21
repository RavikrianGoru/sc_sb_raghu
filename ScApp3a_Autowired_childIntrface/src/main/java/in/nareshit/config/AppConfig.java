package in.nareshit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "in.nareshit.bean")
@PropertySource("classpath:model.properties")
public class AppConfig {

}
