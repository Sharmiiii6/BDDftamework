package PagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By txt_username = By.xpath("//input[@name=\"userLoginId\"]");
	By txt_password = By.xpath("//input[@name=\"password\"]");
	By btn_login = By.xpath("//button[@type=\"submit\"]");
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clicklLogin() {
		driver.findElement(btn_login).click();
		
	}
	
	//public void loginValidUser(String username,String password) {
		//driver.findElement(txt_username).sendKeys(username);
		//driver.findElement(txt_password).sendKeys(password);
		//driver.findElement(btn_login).click();
	
	
	//}

}


