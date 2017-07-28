package SpringInAction.c3_unfinish;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value="dev") // 条件化的bean 当dev条件被激活时 使用该配置文件
public class DevProfileConfig {
   
}
