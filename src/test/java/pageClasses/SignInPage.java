package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

//	WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement email_id;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement submitButton;
	
	
	public SignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}

	public MyAccountPage login(String emailid,String pswd){
		System.out.println("################# login ###################");
		email_id.sendKeys(emailid);
		password.sendKeys(pswd);
		submitButton.click();
		return new MyAccountPage(driver);
	}
}
