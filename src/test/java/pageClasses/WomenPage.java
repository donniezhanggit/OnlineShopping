package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage {

//	WebDriver driver;
	
	@FindBy(id = "layered_category_8")
	private WebElement dressCheckbox;
	
	public WomenPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}

	
}
