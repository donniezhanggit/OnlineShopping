package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage {

	public AddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "processAddress")
	private WebElement proceedToCheckout;
	
//	public ShippingPage goToShippingPage(){
//		proceedToCheckout.click();
//		return new ShippingPage(driver);
//	}
}
