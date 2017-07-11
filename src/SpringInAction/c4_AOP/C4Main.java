package SpringInAction.c4_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class C4Main {
	
	public static void main(String[] args){
   /*     ApplicationContext context 
            = new AnnotationConfigApplicationContext(C4ConfigClass.class);		
     //   Audience a = context.getBean(Audience.class);
        SingPreformance s = context.getBean(SingPreformance.class);
        s.perform();
      //  a.performance();
     */
	    //使用xml配置文件
	    String path = C4Main.class.getResource("/").toString();
	    StringBuffer configXmlPath = new StringBuffer(path); 
	    configXmlPath.append("SpringInAction/c4_AOP/c4Config.xml");
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configXmlPath.toString());
		
	    SingPreformance p =  (SingPreformance) context.getBean("singPerformance");
        p.perform();
        
	}
}
