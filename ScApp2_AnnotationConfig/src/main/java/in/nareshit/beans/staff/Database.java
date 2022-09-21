package in.nareshit.beans.staff;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("database")
public class Database {

	@Value("${my.app.db.name}")
	private String dbname;
	
	@Value("${my.app.db.driver}")
	private String dbdriver;

	@Value("${my.app.db.vendor:RK_DB_Vendor}")
	private String dbvendor;

	@Override
	public String toString() {
		return "Database [dbname=" + dbname + ", dbdriver=" + dbdriver + ", dbvendor=" + dbvendor + "]";
	}
	
	
}
