package SpringInAction.test.d1;


/**
 * spring 中使用set方式注入属性
 * @author fanxuchao
 *
 */
public class User {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void printUserName(){
		System.out.println("userName = ="+userName);
	}
}
