package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContact {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='title']")
	private WebElement title;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 * this method is to create contact
	 * 
	 * @param fName
	 * @param lName
	 * @param ttl
	 */
	public void createContact(String fName, String lName, String ttl) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		title.sendKeys(ttl);
		saveBtn.click();
	}

}
