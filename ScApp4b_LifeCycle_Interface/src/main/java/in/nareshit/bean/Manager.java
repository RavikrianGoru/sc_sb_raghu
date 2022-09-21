package in.nareshit.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean, DisposableBean {
	private String eid;
	private String name;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Override afterPropertiesSet() from Manager");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Override destroy() from Manager");
	}

	
	public Manager() {
		super();
		System.out.println("From Manager-Constructor");
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
		System.out.println("From setEid() of Manager");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager [eid=" + eid + ", name=" + name + "]";
	}


}
