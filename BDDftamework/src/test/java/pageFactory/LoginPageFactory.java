package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name=\"userLoginId\"]")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement btn_login;
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
		
	}
	public void clickonLoging() {
		btn_login.click();
		
	}
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	

}
