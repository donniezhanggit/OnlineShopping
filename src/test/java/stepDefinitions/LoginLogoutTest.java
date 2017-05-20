package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pageClasses.LandingPage;
import pageClasses.SignInPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutTest {

	public static WebDriver driver;
	
	@Before
	public void beforetest(){
		System.setProperty("webdriver.gecko.driver", "C:\\Roshu_selenium\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
	}
	
	@After
	public void aftertest(){
		driver.quit();
	}
	
	LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);
	SignInPage signinpage = PageFactory.initElements(driver, SignInPage.class);
	
	@Given("^I go to signin page$")
	public void i_go_to_signin_page() {
		landingpage.goToSignInPage();
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" and click submit$")
	public void i_enter_and_and_click_submit(String arg1, String arg2) {
	}

	@Then("^I go to Account page$")
	public void i_go_to_Account_page() throws Throwable {

	}
}
