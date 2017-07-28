package SpringInAction.c5_MVC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(basePackages={"c5_MVC"},
    excludeFilters={
		@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
})
public class RootConfig {
}
