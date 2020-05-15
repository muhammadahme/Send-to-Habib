package facebook.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebook.driversetup.FacebookDriverSetup;
import facebook.pageactions.FacebookLoginPageActions;

public class FacebookLoginTest extends FacebookDriverSetup {

	WebDriver driver = getChromeDriver();
	FacebookLoginPageActions loginAction = new FacebookLoginPageActions(this.driver);
	final String URL = "https://www.facebook.com/";

	@BeforeMethod
	public void beforeMethod() throws Exception  {
		driver.get(URL);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@Test
	public void loginErrorMessage() {
		loginAction.inputUserEmail();
		loginAction.inputUserPassword();
		loginAction.clickLoginBtn();
		// loginAction.errorMessage();
	}

//	@AfterMethod
//	public void afterMethod() {
//
//		System.out.println("finished");
//
	}
//}
