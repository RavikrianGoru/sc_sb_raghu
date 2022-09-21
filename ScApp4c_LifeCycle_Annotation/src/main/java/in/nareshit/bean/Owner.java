package in.nareshit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("owr")
public class Owner {
	
	@Value("O101")
	private String eid;
	@Value("Ravi")
	private String name;

	@PostConstruct
	public void setUp()
	{
		System.out.println("setUp method as init in Owner");
	}
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("cleanUp method as destroy in Owner");
	}

	public Owner() {
		super();
		System.out.println("From Owner-Constructor");
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
		System.out.println("From setEid() of Owner");
	}

	@Override
	public String toString() {
		return "Owner [eid=" + eid + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
