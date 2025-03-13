import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void testSum() {
        int a = 5;
        int b = 10;
        int expected = 15;
        Assert.assertEquals(expected, a + b);
    }

    @Test
    public void testStringNotEmpty() {
        String str = "Hello, JUnit!";
        Assert.assertFalse(str.isEmpty());
    }
}