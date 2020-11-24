package test_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_obj.GarageDashboard;
import pages_obj.GarageLogin;

public class TestGarageLogin {

	//Initialize variables
	String driverPath = "C:\\Users\\Nvision PC\\eclipse-workspace\\SQA Assignment\\LibraryFiles\\ChromeDriver\\chromedriver_V87.exe";
	String baseURL = "https://www.trademartlk.com/operation/dashboard/garage-login-deshan";
	
	//Initialize objects
	GarageLogin objGarageLogin;
	GarageDashboard objGarageDashboard;
	
	//Initialize webdriver
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	@Test (priority=0, description = "Login to the system using correct user credentials")
	public void login_with_correct_credentials() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAG2", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=1,description = "Login to the system using correct username but with incorrect password")
	public void login_with_incorrect_passoword() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAG2", "1234567");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=2,description = "Login to the system using correct passowrd but with incorrect username")
	public void login_with_incorrect_username() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAGP2", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=3,description = "Login to the system using incorrect username and password")
	public void login_with_incorrect_username_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAGP2", "1234567");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=4,description = "Login to the system without providing username")
	public void login_without_username() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=5,description = "Login to the system with space as the username")
	public void login_space_as_username() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login(" ", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=6,description = "Login to the system without providing password")
	public void login_without_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAG2", "");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=7,description = "Login to the system with space as the password")
	public void login_space_as_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAG2", " ");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=8,description = "Login to the system with 'NULL' as the username")
	public void login_NULL_as_username() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("NULL", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=9,description = "Login to the system with 'NULL' as the password")
	public void login_NULL_as_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAG2", "NULL");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=10,description = "Login to the system with uppercase username")
	public void login_uppercase_username() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SQAG2", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=11,description = "Login to the system with lowercase username")
	public void login_lowercase_username() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("sqag2", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=12,description = "Login to the system with username which has uppercase and lowercase characters")
	public void login_uppercase_n_lowercase_username() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("SqAg2", "123456");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=13,description = "Login to the system with lowercase password")
	public void login__lowercase_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("umesh", "test123");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=14,description = "Login to the system with uppercase password")
	public void login_uppercase_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("umesh", "TEST123");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=15,description = "Login to the system with password which has uppercase and lowercase characters")
	public void login_uppercase_n_lowercase_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("umesh", "tEsT123");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@Test(priority=16,description = "Login to the system with password which has alphanumeric characters")
	public void login_alphanumeric_password() {
		//Initialize objects
		objGarageLogin = new GarageLogin(driver);
		objGarageDashboard = new GarageDashboard(driver);
		
		//Call login function in GarageLogin class
		objGarageLogin.login("umesh_alpha", "Test@#123");
		
		//Check if login is success
		Assert.assertEquals(objGarageDashboard.getTitleText(), "Garage Dashboard");
	}
	
	@AfterMethod
	public void signout() {
		//Logout from the system after each test case if test case is success
		objGarageDashboard = new GarageDashboard(driver);
		objGarageDashboard.logout();
	}

	@AfterTest 
	public void exitProcedure(){
		//Release driver & close browser
		driver.close(); 
	}
}
