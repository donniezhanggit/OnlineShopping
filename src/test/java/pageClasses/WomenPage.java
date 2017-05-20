package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage {

	
	@FindBy(id = "layered_category_8")
	private WebElement dressCheckbox;
	
	public WomenPage(WebDriver driver) {
		super(driver);
	}

	
}
