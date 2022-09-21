package in.nareshit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpService {

	@Value("Emp-Service")
	private String mode;
	
	@Autowired
	//@Qualifier("empJdbsRepo")//way-2
	private IEmpRepo repo;//empJdbsRepo //way-1

	@Override
	public String toString() {
		return "EmpService [mode=" + mode + ", repo=" + repo + "]";
	}
	
	

}
