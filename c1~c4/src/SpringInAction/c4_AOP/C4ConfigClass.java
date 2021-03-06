package SpringInAction.c4_AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan
public class C4ConfigClass {

	@Bean
	public Audience getAduience(){
		return new Audience();
	}
	
	@Bean
	public SingPreformance getSingPreformance(){
		return new SingPreformance();
	} 
}
