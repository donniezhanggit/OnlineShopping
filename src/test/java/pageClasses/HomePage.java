package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

//	WebDriver driver;
	
	@FindBy(className = "sf-with-ul")
	private WebElement womenTab;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}
	
	public WomenPage goToWomenPage(){
		womenTab.click();
		return new WomenPage(driver);
	}

}
