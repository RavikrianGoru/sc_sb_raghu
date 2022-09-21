package in.rk.spring.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component("msgService")
@Scope("singleton")
public class MsgService {

	public MsgService()
	{
		System.out.println("MsgService-singleton object is created with Lazy Annotation");
	}
}
