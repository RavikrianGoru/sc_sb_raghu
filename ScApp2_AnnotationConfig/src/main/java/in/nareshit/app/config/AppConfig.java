package in.nareshit.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@ComponentScan("in.nareshit.beans")
//@ComponentScan(basePackages ="in.nareshit.beans")
@ComponentScan(basePackages ={"in.nareshit.beans"})
//@PropertySource("db.properties")
//@PropertySource({"db.properties", "abc.properties"})
@PropertySource("classpath:db.properties")
public class AppConfig {

}
