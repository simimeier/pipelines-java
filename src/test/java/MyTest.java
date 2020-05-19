import com.microsoft.demo.Demo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
    }

    @Test
    public void test_method_3() {
        assertTrue(false);
    }

    @Test
    public void test_method_4() {
        assertTrue(true);
    }
}