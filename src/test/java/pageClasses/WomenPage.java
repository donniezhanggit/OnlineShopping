package pageClasses;

import java.util.concurrent.TimeUnit;

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
	
	@FindBy(xpath = ".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")
	private WebElement addToCartButton;
	
	@FindBy(xpath = ".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement productImageDress;
	
	@FindBy(xpath = ".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	private WebElement proceedToCheckoutButton;
	
	public WomenPage(WebDriver driver) {
		super(driver);
	}
	
	public void SelectCheckBoxes()
	{
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(!categoryCheckboxDresses.isSelected()) {
			System.out.println("################################### categoryCheckboxDresses NOT selected. Selecting");
			categoryCheckboxDresses.click();
			System.out.println("################################### categoryCheckboxDresses selected by CODE");
		}
		else{
			System.out.println("################################### categoryCheckboxDresses ALREADY selected");
		}

		if(!sizeCheckboxSmall.isSelected()) {
			sizeCheckboxSmall.click();
		}
		
		if(!compositionCheckboxCotton.isSelected()) {
			compositionCheckboxCotton.click();
		}
		
	}
	
	public void AddToCart()
	{
//		System.out.println("###################################add to cart");
//		System.out.println(categoryCheckboxDresses.isSelected());
		System.out.println("###################################add to cart");
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Actions action = new Actions(driver);
		System.out.println("###################################add to cart");

		action.moveToElement(productImageDress).click();
		System.out.println("###################################add to cart");

//		action.moveToElement(productImageDress).moveToElement(addToCartButton).click().build().perform();
//		proceedToCheckoutButton.click();
//		return new CartSummaryPage(driver)
	}

	
}
