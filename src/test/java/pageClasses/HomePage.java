package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	@FindBy(className = "sf-with-ul")
	private WebElement womenTab;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	public WomenPage goToWomenPage(){
		womenTab.click();
		return new WomenPage(driver);
	}

}
