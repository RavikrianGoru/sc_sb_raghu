package in.nareshit.beans.staff;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("empObj")
public class Employee {

	@Value("101")
	private Integer empid;
	@Value("Ravi")
	private String ename;
	@Value("10000.00")
	private Double sal;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}
