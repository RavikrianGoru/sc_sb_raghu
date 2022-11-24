package in.rk.spring.lookup.bean;

public class SingletonBeanTokenMachine {
	
	private String name="ParentSingletonBeanTokenMachine";
	public void findToken()
	{
		System.out.println("The token is "+generatedToken());
	}
	//lookup-method: return the child class object(prototype bean)
	//we can keep this class as abstract class and method as abstract method.
	public PrototypeBeanToken generatedToken()
	{
		return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
