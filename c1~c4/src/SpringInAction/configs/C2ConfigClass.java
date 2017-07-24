package SpringInAction.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import SpringInAction.c2.SongsCD;

@Configuration
@ComponentScan(basePackageClasses={SongsCD.class}) //以basePackageClasses属性内所在的包作为基础包扫描
public class C2ConfigClass {
}
