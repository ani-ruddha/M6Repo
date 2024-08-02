package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import genricLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;

public class ORG_03 extends BaseClass {

	@Test(groups = {"smoke"})
	public void org_03() throws Exception {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 8, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization", 8, 2);
		String BILLADD = EUTIL.readDataFromExcel("Organization", 8, 3);
		String BILLCITY = EUTIL.readDataFromExcel("Organization", 8, 4);
		String STATE = EUTIL.readDataFromExcel("Organization", 8, 5);

		HomePage HP = new HomePage(driver);
		HP.clickOnorg();
		OrgranizationPage OP = new OrgranizationPage(driver);
		OP.clickOnCreateOrgButton();
		CreateOrganizationPage COP = new CreateOrganizationPage(driver);
		COP.createOrg(ORGNAME + num, WEBSITE, BILLADD , BILLCITY,STATE);
		Thread.sleep(4000);
	}
}
