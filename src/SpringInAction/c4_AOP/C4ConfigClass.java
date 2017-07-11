package SpringInAction.c4_AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
public class C4ConfigClass {

	@Bean
	public Audience getAduience(){
		return new Audience();
	}
	
	@Bean
	public Performance getSingPreformance(){
		return new SingPreformance();
	} 
}
