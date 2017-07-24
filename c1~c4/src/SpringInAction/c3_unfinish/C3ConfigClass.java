package SpringInAction.c3_unfinish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import SpringInAction.c2.SongsCD;

@Configuration
public class C3ConfigClass {
	
	@Bean
	public CD getZhoucd(){
		return new ZhouCd();
	}
    @Bean(value="aaa")
	public CDPlayer getCdplayer(){
		return new CDPlayer(getZhoucd());
	}
  
}
