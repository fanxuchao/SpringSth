package SpringInAction.test.d2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringInAction.c1.KnightMain;

public class D2Main {

	public static void main(String[] args) {
	    String path = KnightMain.class.getResource("/").toString();
	    StringBuffer configXmlPath = new StringBuffer(path); 
	    configXmlPath.append("SpringInAction/test/d2/d2.xml");
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configXmlPath.toString());
	    User u = context.getBean(User.class);
	    u.uOut();
			
	}

}
