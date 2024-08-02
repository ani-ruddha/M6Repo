package sample_Repo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
/*
 *If we want create dependency in between multiple test cases we have to use an
 *attribute called as "dependsOnMethods"
 *@Test(dependsOnMethods = {"createUseR"})
 */
public class Program3 {

	@Ignore
	@Test(priority = 1)
	public void createUseR() {
		System.out.println("cu");
	}
	@Test(priority = 2 , dependsOnMethods = {"createUseR"})
	public void modifyUser() {
		System.out.println("mu");
	}
	
	
	

	
	
	@Test(priority = 3)
	public void deleteUser() {
		System.out.println("du");
	}
}
