package SpringInAction.c4_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C4Main {
	
	public static void main(String[] args){
        ApplicationContext context 
            = new AnnotationConfigApplicationContext(C4ConfigClass.class);		
     //   Audience a = context.getBean(Audience.class);
        SingPreformance s = context.getBean(SingPreformance.class);
        s.perform();
      //  a.performance();
	}
}
