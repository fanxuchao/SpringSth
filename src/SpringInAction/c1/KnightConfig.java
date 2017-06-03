package SpringInAction.c1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig  {
	
	@Bean
	public Quest quest(){
		return new KillDragonQuest(System.out);
	}
	
	@Bean
	public BraveKnight braveKnight(){
		return new BraveKnight(quest());
	}
}
