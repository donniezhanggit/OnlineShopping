package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

//	WebDriver driver;
	
	@FindBy(className = "page-heading")
	private WebElement pageHeading;
	
	@FindBy(xpath = ".//*[@id='center_column']/ul/li/a/span")
	private WebElement homeButton;
	
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}
	
	public void verifyAccountPage(){
		System.out.println(pageHeading.getText());
	}
	
	public HomePage goToHomePage(){
		homeButton.click();
		return new HomePage(driver);
	}

}
