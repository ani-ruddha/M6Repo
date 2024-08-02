package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is a pom class to click on create org button
 */
public class OrgranizationPage {
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createNewOrgButton;
	
	public WebElement getCreateNewOrgButton() {
		return createNewOrgButton;
	}
	public OrgranizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * business lib to click on create new organization
	 */
	public void clickOnCreateOrgButton() {
		createNewOrgButton.click();
	}
}
