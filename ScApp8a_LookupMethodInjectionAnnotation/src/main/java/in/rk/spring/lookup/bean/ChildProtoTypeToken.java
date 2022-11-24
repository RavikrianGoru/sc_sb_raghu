package in.rk.spring.lookup.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ChildProtoTypeToken {
	
	@Value("${child.bean.name}")
	private String name;
	
	public void displyToke()
	{
		System.out.println("Token No:"+Math.random());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
