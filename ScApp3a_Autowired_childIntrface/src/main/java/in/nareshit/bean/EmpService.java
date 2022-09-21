package in.nareshit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empService")
public class EmpService {
	
	@Value("${app.empservice.mode:ABC_Mode}")
	private String mode;
	
	@Autowired
	private IEmpRepo empRepo;

	@Override
	public String toString() {
		return "EmpService [mode=" + mode + ", empRepo=" + empRepo + "]";
	}

	
}
