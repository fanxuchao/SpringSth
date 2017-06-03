package SpringInAction.c1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		
	    //使用xml配置文件
	    String path = KnightMain.class.getResource("/").toString();
	    StringBuffer configXmlPath = new StringBuffer(path); 
	    configXmlPath.append("SpringInAction/c1/c1Config.xml");
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configXmlPath.toString());
		Knight knight = context.getBean(Knight.class);
		Knight k2 = (Knight) context.getBean("knight");
		k2.embarkQuest();
		knight.embarkQuest();
		
		//使用配置类Configuration代替xml配置文件
		ApplicationContext context2  
		    = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight2 = context2.getBean(BraveKnight.class);
		knight2.embarkQuest();
	}

}
