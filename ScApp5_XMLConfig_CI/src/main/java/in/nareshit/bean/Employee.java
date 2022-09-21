package in.nareshit.bean;

public class Employee {

	private String eid;
	private String name;
	private Double sal;

	public Employee(String eid, String name, Double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		System.out.println("Constructor ----- Employee(String eid, String name, Double sal)");
	}

	public Employee() {
		super();
		System.out.println("Constructor ----- Employee(s)");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
