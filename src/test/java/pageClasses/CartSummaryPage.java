package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CartSummaryPage extends BasePage {

	public CartSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span")
	public WebElement proceedToCheckoutButton;
	
	@FindBy(xpath = ".//*[@id='contact-link']/a")
	public  WebElement contactUsButton;
	
	public AddressPage goToAddressPage() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println(proceedToCheckoutButton.getLocation());
		Actions actions = new Actions(driver);
		actions.moveByOffset(1090, 1189);
		actions.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span"))).keyUp(Keys.CONTROL).build().perform();
//		actions.keyDown(Keys.CONTROL).click(proceedToCheckoutButton).keyUp(Keys.CONTROL).build().perform();
//		proceedToCheckoutButton.click();
		return new AddressPage(driver);
	}
	
	public ContactUsPage goToContactUsPage(){
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(contactUsButton).keyUp(Keys.CONTROL).build().perform();
		return new ContactUsPage(driver);
	}
	
}
