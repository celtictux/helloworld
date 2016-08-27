package celtictux.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by celtictux@github on 09/11/2015.
 */
@RestController()
public class HelloWorld {

    private static final String STATEMENT = "Hello ";
    private String name;

    public HelloWorld(final String name) {
        this.name = name;
    }

    @RequestMapping("/greeting")
    public String sayHello() {
        final StringBuilder stringBuilder = new StringBuilder().append(STATEMENT);
        stringBuilder.append(name);
        return stringBuilder.toString();
    }
}
