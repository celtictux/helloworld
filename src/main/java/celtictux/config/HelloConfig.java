package celtictux.config;

import celtictux.hello.HelloWorld;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by celtictux@github on 14/08/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "celtictux")
public class HelloConfig {

    public HelloWorld helloWorld() {
        return new HelloWorld("to the world!");
    }
}
