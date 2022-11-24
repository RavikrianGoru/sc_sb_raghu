package in.rk.spring.lookup.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ParentSingletonTokenMachine {

	@Value("${parent.bean.name}")
	private String name;
	
	public void findToken()
	{
		System.out.println("This token from ParentSingletonTokenMachine: "+name);
	}
	
	//lookup annotation: Spring Container will take care of mapping bean 
	@Lookup
	public ChildProtoTypeToken getChildProtoTypeToken()
	{
		return null;
	}
	
}
