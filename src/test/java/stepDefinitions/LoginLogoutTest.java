package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pageClasses.LandingPage;
import pageClasses.MyAccountPage;
import pageClasses.SignInPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutTest {

	public WebDriver driver;
	LandingPage landingpage;
	SignInPage signinpage;
	MyAccountPage myaccountpage;
	
	@Before
	public void beforetest(){
		System.setProperty("webdriver.gecko.driver", "C:\\Roshu_selenium\\geckodriver-v0.13.0-win64\\geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Roshu_selenium\\geckodriver.16\\geckodriver.exe");
		System.out.println("New FirefoxDriver");

		driver = new FirefoxDriver();
//		System.out.println("New FirefoxDriver");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
		
	}
	
	@After
	public void aftertest(){
		System.out.println("########### aftertest ###################");
		driver.close();
	}
	
	
	@Given("^I go to signin page$")
	public void i_go_to_signin_page() {
		landingpage = PageFactory.initElements(driver, LandingPage.class);
		signinpage = landingpage.goToSignInPage();
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" and click submit$")
	public void i_enter_and_and_click_submit(String arg1, String arg2) {
		myaccountpage = signinpage.login("Roshani@123.com", "test@123");
		
	}

	@Then("^I go to Account page$")
	public void i_go_to_Account_page() throws Throwable {
		System.out.println("I go to Account page");
		//myaccountpage.
	}
}
