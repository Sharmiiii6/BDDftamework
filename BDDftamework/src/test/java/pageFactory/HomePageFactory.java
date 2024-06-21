package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	@FindBy(xpath="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[2]/div/div/h1")
	WebElement lbl_homepage; 
	
	public void isdisplay() {
		lbl_homepage.isDisplayed();
		
	}
	public HomePageFactory(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		}
	
	

}
