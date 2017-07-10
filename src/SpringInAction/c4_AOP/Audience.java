package SpringInAction.c4_AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Audience {
	
	@Pointcut("execution (** SpringInAction.c4_AOP.Performance.perform(..) )")
	public void performance(){}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("take seat");
	}
	
	@After("performance()")
	public void afterPerform(){
		System.out.println("leave ");
	}
}
