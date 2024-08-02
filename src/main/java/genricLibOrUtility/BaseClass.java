package genricLibOrUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepository.HomePage;
import objectRepository.LoginPage;

/**
 * this is base class to keep all the common features of an application
 */
public class BaseClass {
	public static WebDriver driver = null;
	public PropertiesUtilOrLib PUTIL = null;
	public SeleniumUtility SUTIL = new SeleniumUtility();

	@BeforeSuite(alwaysRun = true)
	public void createDbConnection() {
		System.out.println("db connection successfull!!");
	}

	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception {
		PUTIL = new PropertiesUtilOrLib();
		String URL = PUTIL.getDataFromProperties("url");
	//	if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("chrome started");
//		} else if (browser.equals("Firefox")) {
//			driver = new FirefoxDriver();
//			System.out.println("firefox started");
//		}
	
		SUTIL.implicitWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		// System.out.println("lAUNCHING SUCCESSFULL!!");
	}

	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception {
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		LoginPage LP = new LoginPage(driver);
		LP.loginOperation(USERNAME, PASSWORD);
		System.out.println("lOGIN SUCCESSFULL!!");
	}

	@AfterMethod(alwaysRun = true)
	public void logoutOperation() {

		HomePage hp = new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("Logout Successfull!!");
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {

		driver.close();
		System.out.println("Browser closed successfully!!");
	}

	@AfterSuite(alwaysRun = true)
	public void closeDbConnection() {
		System.out.println("db connection closed!!");
	}
}
