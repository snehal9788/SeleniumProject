import org.testng.Assert;
import org.testng.annotations.Test;
//check which test case run first and assert method

@Test
public class CheckTestcase {
public void tc_02() {
	System.out.println("This is my Second Test case");
	Assert.assertEquals("Hi", "Hello");
}

public void tc_01() {
	System.out.println("This is my First Test case");
	Assert.assertEquals("Yash","Yash");	
}

public void tc_00() {
	System.out.println("This is my starting Test case");
	Assert.assertEquals("Yash","Dhiraj","Correct input");	
}
}