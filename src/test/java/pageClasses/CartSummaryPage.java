package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartSummaryPage extends BasePage {

	public CartSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//*[@id='center_column']/p[2]/a[1]/span")
	private WebElement proceedToCheckout;
	
	public AddressPage goToAddressPage(){
		proceedToCheckout.click();
		return new AddressPage(driver);
	}
	
	
}
