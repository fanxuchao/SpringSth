package SpringInAction.c2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import SpringInAction.c2.SongsCD;

@Configuration
//@ComponentScan(basePackageClasses={SongsCD.class}) //以basePackageClasses属性内所在的包作为基础包扫描
@ImportResource("classpath:SpringInAction/c2/c2Config.xml")   //配置类中载入配置xml，实现配置类和xml混合配置
public class C2ConfigClass {
	
	@Bean
	public CD getZhoucd(){
		return new ZhouCd();
	}
    @Bean(value="aaa")
	public CDPlayer getCdplayer(){
		return new CDPlayer(getZhoucd());
	}
  
}
