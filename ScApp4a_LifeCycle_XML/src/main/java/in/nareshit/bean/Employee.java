package in.nareshit.bean;

public class Employee {

	private String eid;
	private String name;
	public Employee() {
		super();
		System.out.println("From Employee-Constructor");
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
		System.out.println("From setEid() of Employee");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setUp()
	{
		System.out.println("setUp method as init in Employee");
	}
	public void cleanUp()
	{
		System.out.println("cleanUp method as destroy in Employee");
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

}
