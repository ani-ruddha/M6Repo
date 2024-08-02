package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import genricLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;

public class ORG_04 extends BaseClass {
	@Test(groups = {"sanity"})
	public void org_04() throws Exception {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 11, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization",11, 2);
		String EMP = EUTIL.readDataFromExcel("Organization", 11, 3);
		String PHN = EUTIL.readDataFromExcel("Organization", 11, 4);
		String OTHPHN = EUTIL.readDataFromExcel("Organization",11, 5);
		String EMAIL = EUTIL.readDataFromExcel("Organization", 11, 6);
		String BILLADD = EUTIL.readDataFromExcel("Organization", 11, 7);
		String BILLCITY = EUTIL.readDataFromExcel("Organization", 11, 8);
		String STATE = EUTIL.readDataFromExcel("Organization", 11, 9);

		HomePage HP = new HomePage(driver);
		HP.clickOnorg();
		OrgranizationPage OP = new OrgranizationPage(driver);
		OP.clickOnCreateOrgButton();
		CreateOrganizationPage COP = new CreateOrganizationPage(driver);
		COP.createOrg(ORGNAME + num, 
				WEBSITE, EMP, PHN, OTHPHN, EMAIL, BILLADD, BILLCITY, STATE);
		Thread.sleep(4000);
	}
}
