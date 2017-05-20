package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	WebDriver driver;
	
	@FindBy(className = "page-heading")
	public WebElement pageHeading;
	
	@FindBy(xpath = ".//*[@id='center_column']/ul/li/a/span")
	public WebElement homeButton;
	
	
	public MyAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAccountPage(){
		System.out.println(pageHeading.getText());
	}
	
	public HomePage goToHomePage(){
		homeButton.click();
		return new HomePage(driver);
	}

}
