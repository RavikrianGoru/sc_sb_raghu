package in.nareshit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("8-1-67")
	private String hnumber;
	
	@Value("${my.app.adde.offic.pin:100001}")
	private String offPin;

	@Override
	public String toString() {
		return "Address [hnumber=" + hnumber + ", offPin=" + offPin + "]";
	}
	
	
}
