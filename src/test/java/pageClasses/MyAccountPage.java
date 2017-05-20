package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	@FindBy(xpath = ".//*[@id='center_column']/ul/li/a/span")
	private WebElement homeButton;
	
	@FindBy(className = "info-account")
	private WebElement pageHeading;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyAccountPage(){
			System.out.println(pageHeading.getText());
			}
	
	public HomePage goToHomePage(){
		homeButton.click();
		return new HomePage(driver);
	}

}
