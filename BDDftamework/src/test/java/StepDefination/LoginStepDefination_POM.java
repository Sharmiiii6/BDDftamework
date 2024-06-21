package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PagesPOM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination_POM {
	
	static WebDriver driver;
	LoginPage login;
	

	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "‪‪‪C:\\Users\\91824\\OneDrive - Technology Risk Limited\\Desktop\\BDDftamework\\chromedriver.exe");
        driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.netflix.com/login");
	    
	}
	
	

	//@When("user enter valid user name and password")
	//public void user_enter_valid_user_name_and_password() {
	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password) {
		
		login= new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		

	}

	@And("click on login button")
	public void click_on_login_button() {
	   login.clicklLogin();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.findElements(By.xpath("//span[text()='Sharmi']")).size()>0,"nevigate to homepage");
	}

	@And("close the browser")
	public void close_the_brouser() {
	  driver.close();
	}
}
