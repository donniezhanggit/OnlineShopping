package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;
	
	@FindBy(id = "email")
	public WebElement id;
	
	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy(id = "SubmitLogin")
	public WebElement submitButton;
	
	
	public SignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public MyAccountPage login(String emailid,String pswd){
		id.sendKeys(emailid);
		password.sendKeys(pswd);
		submitButton.click();
		return new MyAccountPage(driver);
	}
}
