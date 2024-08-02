package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import genricLibOrUtility.JavaLibrary;
import objectRepository.ContactPage;
import objectRepository.CreateNewContact;
import objectRepository.HomePage;

public class CON_01 extends BaseClass {
	@Test(retryAnalyzer = genricLibOrUtility.RetryAnalyzerImplementationClass.class)
	public void con_01() throws Exception {
		JavaLibrary JLIB = new JavaLibrary();
		int num = JLIB.generateRandomNumber(1000);
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String FNAME = EUTIL.readDataFromExcel("Contact", 2, 1);
		String LNAME = EUTIL.readDataFromExcel("Contact", 2, 2);
		String TITLE = EUTIL.readDataFromExcel("Contact", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnContacts();
		ContactPage CP = new ContactPage(driver);
		CP.clickOnCreateContactButton();
		CreateNewContact CNC  =new CreateNewContact(driver);
		CNC.createContact(FNAME+num, LNAME, TITLE);
		Thread.sleep(3000);
		

	}
}
