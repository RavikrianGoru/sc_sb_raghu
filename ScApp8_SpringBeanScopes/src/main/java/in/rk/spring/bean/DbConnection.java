package in.rk.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dbConnection")
@Scope("singleton")
public class DbConnection {

	@Value("orcl")
	private String name;
	
	@Value("orcl-odbc")
	private String url;

	public DbConnection()
	{
		System.out.println("DbConnection-singleton object is created");
	}
	@Override
	public String toString() {
		return "DbConnection [name=" + name + ", url=" + url + "]";
	}
}
