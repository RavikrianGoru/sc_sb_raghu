package in.nareshit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empJdbcRepo")
public class EmpJdbcRepo implements IEmpRepo {

	@Value("${app.emp.model:sample model}")
	private String model;

	@Override
	public String toString() {
		return "EmpJdbcRepo [model=" + model + "]";
	}
	
	
}
