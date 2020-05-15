package facebook.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import facebook.pageelement.FacebookLoginElement;

public class FacebookLoginPageActions {
	// String userEmail;
	// String userPassword;
	// make reference variable of FacebookLoginElement
	FacebookLoginElement loginPageElement;

	// make constructor of FacebookLoginPageActions, pass driver
	public FacebookLoginPageActions(WebDriver driver) {
		this.loginPageElement = new FacebookLoginElement();
		// class= PageFactory/initElements()method= pass driver and FacebookLoginElement
		PageFactory.initElements(driver, loginPageElement);

	}

	// userEmail and values
	public void inputUserEmail() {
		loginPageElement.userEmail.sendKeys("iqbal@yahoo.com");
	}

	// userPassword and value
	public void inputUserPassword() {
		loginPageElement.userPassword.sendKeys("123test");
	}

	// login and click
	public void clickLoginBtn() {

		loginPageElement.userLogin.click();
	}

	// login error message
//	public String errorMessage() {
//	return loginPageElement.loginErrorMessage.getText() ;
//	
//	}

//	public boolean loginErrormsg() {
//		boolean str = loginPageElement.loginErrorMessage.isDisplayed();
//		return str;
//	}

}
