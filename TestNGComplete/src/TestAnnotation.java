import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotation {
@Test
public void tc_01() {
	System.out.println("This is my first test case");
	//throw new ArithmeticException();
	/**
	 * it throws the exception(Error).throws keyword can be written in inside the method
	 */
    Assert.assertEquals("Hello", "Hi");
    /**
     * Assert that two valus are equals
     * assertEquals(Object actual,Object Expected,String message)
     * actual value,Expected value,message are Assertion Error Message
     */
}

}