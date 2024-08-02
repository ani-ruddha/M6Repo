package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_03 extends BaseClass {

	@Test(groups = {"smoke" , "regression"})
	public void le03Tc() throws Exception {
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String FNAME = EUTIL.readDataFromExcel("Leads", 8, 1);
		String LNAME = EUTIL.readDataFromExcel("Leads", 8, 2);
		String CNAME = EUTIL.readDataFromExcel("Leads", 8, 3);
		String TITLE = EUTIL.readDataFromExcel("Leads", 8, 4);
		String PHONE = EUTIL.readDataFromExcel("Leads", 8, 5);
		String MOBILE = EUTIL.readDataFromExcel("Leads", 8, 6);
		String EMAIL = EUTIL.readDataFromExcel("Leads", 8, 7);
		String NOE = EUTIL.readDataFromExcel("Leads", 8, 8);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp = new LeadPage(driver);
		lp.clickOnCreateLeadButton();

		CreatingNewLeadPage CNL = new CreatingNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME , TITLE, PHONE,MOBILE, EMAIL, NOE);
		System.out.println("LE03 EXECUTION SUCCESSFULL!!");
		Thread.sleep(3000);
	}
}
