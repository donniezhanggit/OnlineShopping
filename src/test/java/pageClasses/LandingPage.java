package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

	@FindBy(className = "login")
	private WebElement login;
	
	
	public LandingPage(WebDriver driver){
		super(driver);
	}
	
	public SignInPage goToSignInPage(){
		login.click();
		return new SignInPage(driver);
	}
	
	
	
}
