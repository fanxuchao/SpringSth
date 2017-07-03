package SpringInAction.test.String;

public class StringUtils {
	public static boolean isNotNull(String... s){    //可变参数
		for(String s1 :s){
			if(s1==null){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNotEmpty(String... s){
		for(String s1 :s){
			if(s1 == null ||s1.isEmpty()){
				return false;
			}
		}
		return true;
	}
}
