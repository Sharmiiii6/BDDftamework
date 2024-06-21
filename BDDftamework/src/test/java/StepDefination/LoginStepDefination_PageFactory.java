/*package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class LoginStepDefination_PageFactory {
	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory home;
	
	
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
        driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.netflix.com/login");
	    
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		
		login=new LoginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		login.clickonLoging();
	
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		home=new HomePageFactory(driver);
		home.isdisplay();
		
	}

	@And("close the browser")
	public void close_the_brouser() {
	  driver.close();
	}
}*/
