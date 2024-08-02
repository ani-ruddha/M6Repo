package tc_repository;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtilityOrLib;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;
public class LE_04 extends BaseClass{
	@Test(groups = {"smoke" , "sanity"})
	public void le04Tc() throws Exception
	{
		ExcelUtilityOrLib EUTIL = new ExcelUtilityOrLib();
		String FNAME = EUTIL.readDataFromExcel("Leads", 11, 1);
		String LNAME = EUTIL.readDataFromExcel("Leads", 11, 2);
		String CNAME = EUTIL.readDataFromExcel("Leads", 11, 3);
		String ST = EUTIL.readDataFromExcel("Leads", 11, 4);
		String POBOX = EUTIL.readDataFromExcel("Leads",11, 5);
		String PCODE = EUTIL.readDataFromExcel("Leads",11,6);
		String CITY = EUTIL.readDataFromExcel("Leads", 11,7);
		String COUNTRY = EUTIL.readDataFromExcel("Leads",11,8);
		String STATE = EUTIL.readDataFromExcel("Leads", 11,9);		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp = new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		CreatingNewLeadPage CNL = new CreatingNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME ,ST,POBOX,PCODE,CITY,COUNTRY,STATE);
		System.out.println("LE04 EXECUTION SUCCESSFULL!!");
		Thread.sleep(3000);
	}
}
