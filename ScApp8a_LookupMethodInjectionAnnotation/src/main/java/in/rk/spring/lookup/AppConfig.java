package in.rk.spring.lookup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"in.rk.spring.lookup.bean"})
@PropertySource(value = "classpath:bean.properties")
public class AppConfig {

}
