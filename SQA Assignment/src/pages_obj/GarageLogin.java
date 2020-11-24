package pages_obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class GarageLogin {
  
	//webdriver (Class Context)
	WebDriver driver;
	
	//Initializing elements
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"btn_login\"]")
	WebElement button;
	
	//Constructor (Factory)
	public GarageLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void login(String strUsername, String strPassword) {
		//Clear existing data from the fields
		username.clear();
		password.clear();
		
		//Send user credentials to the fields
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		
		//Click login button
		button.click();
		
	}
	
}
