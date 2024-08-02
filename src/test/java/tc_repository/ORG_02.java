package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import genricLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;

public class ORG_02 extends BaseClass{
	@Test(groups = {"regression"})
	public void org_02() throws Exception {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 5, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization", 5, 2);
		String EMP = EUTIL.readDataFromExcel("Organization", 5, 3);
		String PHN = EUTIL.readDataFromExcel("Organization", 5, 4);
		String OTHPHN = EUTIL.readDataFromExcel("Organization", 5, 5);
		String EMAIL = EUTIL.readDataFromExcel("Organization", 5, 6);	
		HomePage HP = new HomePage(driver);
		HP.clickOnorg();
		OrgranizationPage OP = new OrgranizationPage(driver);
		OP.clickOnCreateOrgButton();
		CreateOrganizationPage COP = new CreateOrganizationPage(driver);
		COP.createOrg(ORGNAME+num, WEBSITE, EMP,PHN, OTHPHN, EMAIL);
		Thread.sleep(4000);
	}

}
