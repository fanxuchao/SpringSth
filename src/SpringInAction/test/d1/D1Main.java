package SpringInAction.test.d1;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringInAction.c1.KnightMain;

public class D1Main {
	public static void main(String[] args){
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(d));
		d.setTime(60*60*24+d.getTime());
		System.out.println(df.format(d));
		String path = KnightMain.class.getResource("/").toString();
		StringBuffer configXmlPath = new StringBuffer(path); 
		configXmlPath.append("SpringInAction/test/d1/d1Config.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configXmlPath.toString());
		User user = context.getBean(User.class);
		user.printUserName();
	}
}
