import org.testng.annotations.Test;

public class SignInTestDataProvider {
	@Test
	public void tc_01(int i, String name, float salary){
		System.out.println("Roll No"+i+"\tName"+name+"\tSalary"+salary);
	}
	
}
