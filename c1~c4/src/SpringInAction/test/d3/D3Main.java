package SpringInAction.test.d3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class D3Main {
    public static void main(String args[]){
        ApplicationContext context  = new AnnotationConfigApplicationContext(D3ConfigClass.class);
    	ZhouCD z = context.getBean(ZhouCD.class);
    	z.play();
    }
}
