package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import genricLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;

public class ORG_01 extends BaseClass {
	@Test(groups = {"sanity" , "regression"})
	public void org_01() throws Exception {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 2, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization", 2, 2);
		String EMP = EUTIL.readDataFromExcel("Organization", 2, 3);

		HomePage HP = new HomePage(driver);
		HP.clickOnorg();

		OrgranizationPage OP = new OrgranizationPage(driver);
		OP.clickOnCreateOrgButton();

		CreateOrganizationPage COP = new CreateOrganizationPage(driver);
		COP.createOrg(ORGNAME+num, WEBSITE, EMP);
		System.out.println("org_01 passed!!");
		Thread.sleep(4000);

	}
}
