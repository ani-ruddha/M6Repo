package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_02 extends BaseClass{

	@Test(groups = {"regression"})
	public void le02Tc() throws Exception
	{
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String FNAME = EUTIL.readDataFromExcel("Leads", 5, 1);
		String LNAME = EUTIL.readDataFromExcel("Leads", 5, 2);
		String CNAME = EUTIL.readDataFromExcel("Leads", 5, 3);
		String TITLE = EUTIL.readDataFromExcel("Leads", 5, 4);
		String PHONE = EUTIL.readDataFromExcel("Leads", 5, 5);
		String MOBILE = EUTIL.readDataFromExcel("Leads", 5, 6);
		String EMAIL = EUTIL.readDataFromExcel("Leads", 5, 7);
		String NOE = EUTIL.readDataFromExcel("Leads", 5, 8);
		String ST = EUTIL.readDataFromExcel("Leads", 5, 9);
		String POBOX = EUTIL.readDataFromExcel("Leads", 5, 10);
		String PCODE = EUTIL.readDataFromExcel("Leads", 5, 11);
		String CITY = EUTIL.readDataFromExcel("Leads", 5, 12);
		String COUNTRY = EUTIL.readDataFromExcel("Leads", 5, 13);
		String STATE = EUTIL.readDataFromExcel("Leads", 5, 14);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp = new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreatingNewLeadPage CNL = new CreatingNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME ,TITLE ,PHONE,MOBILE,
				EMAIL,NOE,ST,POBOX,PCODE,CITY,COUNTRY,STATE);
		System.out.println("LE02 EXECUTION SUCCESSFULL!!");
		Thread.sleep(3000);
	}
}
