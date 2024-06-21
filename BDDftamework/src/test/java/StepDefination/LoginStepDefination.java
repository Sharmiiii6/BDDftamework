/*package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	static WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
        driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.netflix.com/login");
	    
	}

	//@When("user enter valid user name and password")
	//public void user_enter_valid_user_name_and_password() {
	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name=\"userLoginId\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);

	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
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
}*/
