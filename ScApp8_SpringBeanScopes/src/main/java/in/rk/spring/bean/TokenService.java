package in.rk.spring.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tokenService")
@Scope("prototype")
public class TokenService {

	private String token;
	public TokenService()
	{
		token=String.valueOf(new Random().nextInt(1000));
		System.out.println("TokenService-prototype object is created");
	}
	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
}
