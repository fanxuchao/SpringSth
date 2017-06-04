package SpringInAction.test.d1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringInAction.c1.KnightMain;

public class D1Main {
	public static void main(String[] args){
		String path = KnightMain.class.getResource("/").toString();
		StringBuffer configXmlPath = new StringBuffer(path); 
		configXmlPath.append("SpringInAction/test/d1/d1Config.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configXmlPath.toString());
		User user = context.getBean(User.class);
		user.printUserName();
	}
}
