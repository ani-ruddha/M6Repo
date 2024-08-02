package sample_Repo;

/*
 *1.@Test is mandatory for all the test cases , without @Test test cases will not 
 * participate in execution.
 *2.We can provide @Test in class level but it is not a recommended choice because
 * in a class some generic functions also will be present and in this those functions
 * also will be executed like test cases.
 *3.We should always provide @Test in method level.
 *--->priority attribute<----
 *1.If we want to execute test cases in customize order we have to use
 * "priority" attribute(e.g:- @Test(priority = 1))
 *2.If we don't provide priority test cases will execute alphabetically or AASCII value.
 *3.Default priority is '0'.
 *4.First priority will goes to lowest number.
 *5.We can provide negative priority also.(e.g:-@Test(priority = -3))
 *6.If multiple test cases having same priority then for those test cases it will 
 *  execute based on alphabets.
 */
import org.testng.annotations.Test;

//@Test
public class Program1 {
	@Test(priority = 1)
	public void createUseR() {
		System.out.println("cu");
	}

	@Test(priority = 2)
	public void modifyUser() {
		System.out.println("mu");
	}

	@Test(priority = 3)
	public void deleteUser() {
		System.out.println("du");
	}
}
