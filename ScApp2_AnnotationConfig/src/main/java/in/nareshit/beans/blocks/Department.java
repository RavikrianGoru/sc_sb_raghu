package in.nareshit.beans.blocks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("depObj")
public class Department {

	@Value("B1-MAC")
	private String depName;

	@Override
	public String toString() {
		return "Department [depName=" + depName + "]";
	}
	
}
