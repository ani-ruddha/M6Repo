package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgName;

	@FindBy(xpath = "//input[@name='website']")
	private WebElement webSite;

	@FindBy(xpath = "//input[@name='employees']")
	private WebElement empNo;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phnNo;

	@FindBy(xpath = "//input[@name='otherphone']")
	private WebElement otherPhnNo;

	@FindBy(xpath = "//input[@name='email1']")
	private WebElement emailId;

	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddress;

	@FindBy(xpath = "//input[@name='bill_city']")
	private WebElement billingCity;

	@FindBy(xpath = "//input[@name='bill_state']")
	private WebElement billingState;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmpNo() {
		return empNo;
	}

	public WebElement getPhnNo() {
		return phnNo;
	}

	public WebElement getOtherPhnNo() {
		return otherPhnNo;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 * this is business library to create org with manadatory fields
	 * 
	 * @param organizationName
	 * @param web
	 * @param eNum
	 */
	public void createOrg(String organizationName, String web, String eNum) {
		orgName.sendKeys(organizationName);
		webSite.sendKeys(web);
		empNo.sendKeys(eNum);
		saveBtn.click();

	}

	/**
	 * this is business library to create org with manadatory fields with e address
	 * 
	 * @param organizationName
	 * @param web
	 * @param eNum
	 * @param phNumber
	 * @param othPhNum
	 * @param email
	 */
	public void createOrg(String organizationName, String web, String eNum, String phNumber, String othPhNum,
			String email) {
		orgName.sendKeys(organizationName);
		webSite.sendKeys(web);
		empNo.sendKeys(eNum);
		phnNo.sendKeys(phNumber);
		otherPhnNo.sendKeys(othPhNum);
		emailId.sendKeys(email);
		saveBtn.click();

	}

	/**
	 * this is business library to create org with manadatory fields with email
	 * address
	 * 
	 * @param organizationName
	 * @param web
	 * @param billAdd
	 * @param billCity
	 * @param bState
	 */
	public void createOrg(String organizationName, String web, String billAdd, 
			String billCity, String bState) {
		orgName.sendKeys(organizationName);
		webSite.sendKeys(web);
		billingAddress.sendKeys(billAdd);
		billingCity.sendKeys(billCity);
		billingState.sendKeys(bState);
		saveBtn.click();
	}

	/**
	 * this is business library to create org with manadatory fields with all creds
	 * 
	 * @param organizationName
	 * @param web
	 * @param eNum
	 * @param phNumber
	 * @param othPhNum
	 * @param email
	 * @param billAdd
	 * @param billCity
	 * @param bState
	 */
	public void createOrg(String organizationName, String web, String eNum, String phNumber, String othPhNum,
			String email, String billAdd, String billCity, String bState) {
		orgName.sendKeys(organizationName);
		webSite.sendKeys(web);
		empNo.sendKeys(eNum);
		phnNo.sendKeys(phNumber);
		otherPhnNo.sendKeys(othPhNum);
		emailId.sendKeys(email);
		billingAddress.sendKeys(billAdd);
		billingCity.sendKeys(billCity);
		billingState.sendKeys(bState);
		saveBtn.click();
	}

}
