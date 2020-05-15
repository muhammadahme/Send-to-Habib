package facebook.pageelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginElement {
	
	//email
	@FindBy(xpath="//input[@id='email']")
	public WebElement userEmail;
	
	//password
	@FindBy(xpath="//input[@id='pass']")
	public WebElement userPassword;
	
	//log in 
	@FindBy(xpath="//input[@id='u_0_b']")
	public WebElement userLogin;
	
	//log in error message
	
//	@FindBy(xpath="//div[@class='_4rbf _53ij']")
//	public WebElement loginErrorMessage;
//	

}
