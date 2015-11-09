package adamkelso1987.hello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Kelso on 09/11/2015.
 */
public class HelloWorldTest {

    private static final String NAME = "Bob";

    private HelloWorld classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new HelloWorld(NAME);
    }

    @Test
    public void testCorrectNameResponded() {
        assertEquals("Hello "+NAME, classUnderTest.sayHello());
    }
}
