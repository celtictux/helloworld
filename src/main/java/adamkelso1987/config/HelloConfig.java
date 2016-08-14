package adamkelso1987.config;

import adamkelso1987.hello.HelloWorld;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by adamkelso on 14/08/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "adamkelso1987")
public class HelloConfig {

    public HelloWorld helloWorld() {
        return new HelloWorld("to the world!");
    }
}
