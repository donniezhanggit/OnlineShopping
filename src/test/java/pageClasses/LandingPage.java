package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

//	WebDriver driver;
	
//	@FindBy(className = "login")
	@FindBy(className="login")
	private WebElement login;
	
	
	public LandingPage(WebDriver driver){
		super(driver);
//		this.driver = driver;
//		System.out.println(driver.getCurrentUrl());
//		PageFactory.initElements(driver, this);
	}
	
	public SignInPage goToSignInPage(){
//		System.out.println(driver.getCurrentUrl());
		System.out.println("################# goToSignInPage ###################");
		login.click();
		return new SignInPage(driver);
	}
	
	
	
}
