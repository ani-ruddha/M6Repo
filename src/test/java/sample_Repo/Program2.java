package sample_Repo;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
/*
 *1.We can pass multiple attributes inside @Test parameters
 *@Test(priority = 1 , invocationCount = 5)
 *2.If we want to execute a test case multiple times we have to
 *  use "invocationCount = value"
 *3.Default invocation count is "1".

 *Ignoring test case from execution : -
 *1.Keep invocationCount = 0; e.g:- @Test(invocationCount = 0)
 *2.use an attribute and value.e,g:- @Test(enabled = false)
 *3.use "@Ignore" annotation.
 *
 */
public class Program2 {
	@Ignore
	@Test(priority = 1, invocationCount = 5)
	public void createUseR() {
		System.out.println("cu");
	}
	@Test(priority = 2, invocationCount = 0)
	public void modifyUser() {
		System.out.println("mu");
	}
	@Test(priority = 3)
	public void deleteUser() {
		System.out.println("du");
	}
}
