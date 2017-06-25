package SpringInAction.c2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringInAction.c1.KnightMain;
import SpringInAction.configs.C2ConfigClass;

public class C2Main {
	public static ClassPathXmlApplicationContext context;
	
    public static void main(String[] args) {
        String path = KnightMain.class.getResource("/").toString();
        StringBuffer configXmlPath = new StringBuffer(path); 
        configXmlPath.append("SpringInAction/c2/c2Config.xml");
        context = new ClassPathXmlApplicationContext(configXmlPath.toString());
        SongsCD s = context.getBean(SongsCD.class);
        s.play();
		    
        ApplicationContext aContext = new AnnotationConfigApplicationContext(C2ConfigClass.class);  
        s = aContext.getBean(SongsCD.class);
        ZhouCd z = aContext.getBean(ZhouCd.class);
        z.play();
        s.play();
    }

}
