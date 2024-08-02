package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(xpath = "//img[@title='Create Contact..']")
	private WebElement createContactButton;

	public WebElement getCreateNewContactButton() {
		return createContactButton;
	}

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * business lib to click on create new Contact
	 */
	public void clickOnCreateContactButton() {
		createContactButton.click();
	}
}
