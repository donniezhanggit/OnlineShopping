package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	WebDriver driver;
	
	@FindBy(className = "login")
	public WebElement login;
	
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
	}
	
	public SignInPage goToSignInPage(){
		
		login.click();
		return new SignInPage(driver);
	}
	
	
	
}
