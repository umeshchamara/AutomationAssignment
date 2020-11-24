package pages_obj;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GarageDashboard {
  
	WebDriver driver;
	
	@FindBy(how = How.XPATH,using="/html/body/div[1]/div/div[3]/h3")
	WebElement titleText;
	
	@FindBy(how = How.XPATH,using="/html/body/div[1]/div/div[2]/div/nav/ul/li[1]/a")
	WebElement dropDown;
	
	@FindBy(how = How.XPATH,using="/html/body/div[1]/div/div[2]/div/nav/ul/li[1]/ul/li[2]/a")
	WebElement logOutBtn;
	
	//Constructor
	public GarageDashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public String getTitleText() {
		//Wait until dashboard page to load before retrieving title text
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(titleText));
		return titleText.getText();
	}
	
	public void logout() {
		try {
			dropDown.click();
			WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.elementToBeClickable(logOutBtn));
			logOutBtn.click();
		}
		catch(NoSuchElementException e) {
			//Uncomment below line if you want to get full stacktrace on execution time (debugging purpose)
			//e.printStackTrace();
			System.out.println("Login failed skipping logout process");
		}
	}
}
