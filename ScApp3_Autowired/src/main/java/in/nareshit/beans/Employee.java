package in.nareshit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	@Value("${my.app.emp.id:001}")
	private String eid;

	@Value("Ravi")
	private String ename;

	@Value("${my.app.emp.office:XYZ}")
	private String eofice;

	@Value("${my.app.emp.qualf:A,B,C}")
	private String[] equalf;

	@Value("#{'${employee.names}'.split(',')}")
	private List<String> employeeNames;

	@Value("#{'${employee.names}'.split(',')[0]}")
	private String firstEmployeeName;

	@Value("#{${employee.age}}")
	private Map<String, Integer> employeeAge;

	@Value("#{${employee.age}.two}")
	private String employeeAgeTwo;

	@Autowired
	private Address addr;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eofice=" + eofice + ", equalf="
				+ Arrays.toString(equalf) + ", employeeNames=" + employeeNames + ", firstEmployeeName="
				+ firstEmployeeName + ", employeeAge=" + employeeAge + ", employeeAgeTwo=" + employeeAgeTwo + ", addr="
				+ addr + "]";
	}

}
