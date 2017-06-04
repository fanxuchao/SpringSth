package SpringInAction.test.iocTest;

public class IocTest {
	public Object toGetClass(String classValue) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class clazz = null;
		
		if(clazz==null){
			clazz =Class.forName(classValue) ;
		}
		clazz.newInstance();
		return clazz.newInstance();
	}
	
	public void test(){
		System.out.println("iiii");
	}
	
}
