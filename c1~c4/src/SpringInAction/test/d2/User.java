package SpringInAction.test.d2;

import org.springframework.stereotype.Component;

@Component(value = "User")
public class User {
	
	public void uOut(){
		System.out.println("out");
	}
}
