package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage {

	
	@FindBy(id = "layered_category_8")
	private WebElement categoryCheckboxDresses;
	
	@FindBy(id = "layered_id_attribute_group_1")
	private WebElement sizeCheckboxSmall;
	
	@FindBy(id = "layered_id_feature_5")
	private WebElement compositionCheckboxCotton;
	
	@FindBy(xpath = ".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	private WebElement proceedToCheckoutButton;
	
	public WomenPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectShoppingCriteria() throws InterruptedException
	{
		Thread.sleep(3000);
		if(!categoryCheckboxDresses.isSelected()) {
			categoryCheckboxDresses.click();
		}
		else{
			System.out.println("categoryCheckboxDresses ALREADY selected");
		}
		Thread.sleep(3000);
		if(!sizeCheckboxSmall.isSelected()) {
			sizeCheckboxSmall.click();
		}
		Thread.sleep(3000);
		if(!compositionCheckboxCotton.isSelected()) {
			compositionCheckboxCotton.click();
		}
		Thread.sleep(3000);
	}
	
	public CartSummaryPage AddToCart() throws InterruptedException
	{
		
		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"))).moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"))).click().build().perform();
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"))).click().build().perform();
		Thread.sleep(3000);
		proceedToCheckoutButton.click();
		return new CartSummaryPage(driver);
	}

	
}
