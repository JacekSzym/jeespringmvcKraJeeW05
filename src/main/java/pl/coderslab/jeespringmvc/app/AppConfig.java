package pl.coderslab.jeespringmvc.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("pl.coderslab.jeespringmvc")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
}
