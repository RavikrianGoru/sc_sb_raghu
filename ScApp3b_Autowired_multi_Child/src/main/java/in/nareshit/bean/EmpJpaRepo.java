package in.nareshit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("empJpaRepo")
@Primary //way-3
public class EmpJpaRepo implements IEmpRepo {
	@Value("JPA-REPO-MODEL")
	private String model;

	@Override
	public String toString() {
		return "EmpJpaRepo [model=" + model + "]";
	}

}
