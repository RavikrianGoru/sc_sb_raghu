package in.nareshit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empJdbsRepo")
public class EmpJdbsRepo implements IEmpRepo {

	@Value("JDBC-REPO-MODEL")
	private String model;

	@Override
	public String toString() {
		return "EmpJdbsRepo [model=" + model + "]";
	}
}
