package adamkelso1987.hello;

/**
 * Created by Adam Kelso on 09/11/2015.
 */
public class HelloWorld {

    private static final String STATEMENT = "Hello ";
    private String name;

    public HelloWorld(final String name) {
        this.name = name;
    }

    public String sayHello() {
        final StringBuilder stringBuilder = new StringBuilder().append(STATEMENT);
        stringBuilder.append(name);
        return stringBuilder.toString();
    }
}
