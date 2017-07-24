package SpringInAction.c2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringInAction.c1.KnightMain;

public class C2Main {
	public static ClassPathXmlApplicationContext context;
	
    public static void main(String[] args) {
/*    	String path = KnightMain.class.getResource("/").toString();
        StringBuffer configXmlPath = new StringBuffer(path); 
        configXmlPath.append("SpringInAction/c2/c2Config.xml");
        context = new ClassPathXmlApplicationContext(configXmlPath.toString());
        CDPlayer cdPlay1 = context.getBean(CDPlayer.class);
        cdPlay1.palycd();
		cdPlay1.zplay(); 
*/        
        ApplicationContext aContext = new AnnotationConfigApplicationContext(C2ConfigClass.class);  
        
        CDPlayer cdPlay = (CDPlayer) aContext.getBean("cdPlay");
        cdPlay.palycd();
    }

}
