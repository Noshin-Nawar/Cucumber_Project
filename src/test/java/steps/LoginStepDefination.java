package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	//DatabasePage databasepage;
	LoginPage loginPageObj;

/*	@Before
	public void beforeRun() {
		initDriver();
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
		databasepage = new DatabasePage();
	
	
	}
	
	*/

	@Given("^User is on the techfios login page$")
	public void user_is_on_the_echfios_login_page() {
		initDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	} 
	

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws InterruptedException {
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
		loginPageObj.enterUserName(username);
	}
	
	
	@When ("User enters \"([^\\\"]*)\"$")
	public void user_enters(String data) {
		
		if(data.equalsIgnoreCase("username")) {
			try {
				loginPageObj.enterUserName("demo@techfios.com");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}else if (data.equalsIgnoreCase("password")) {
			try {
				loginPageObj.enterUserName("abc123");
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			
		}else {
			System.out.println("invalid data");
		}
		
		switch(data) {
		case "username":
			try {
				loginPageObj.enterUserName("demo@techfios.com");
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
			break;
		case "password":	
			try {
				loginPageObj.enterUserName("abc123");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			break;
			
			default:
				System.out.println("invalid data");
			
			
		}

	}
	
	

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {

		loginPageObj.enterPassword(password);
	}

	@When("^User clicks sign in button$")
	public void user_clicks_sign_in_button() {

		loginPageObj.clickSignInButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {

		Assert.assertEquals("Dashboard- iBilling", loginPageObj.getPageTitle());
		
		takeScreenshot(driver);
		
	}

	
/*	@When("^User enters \"([^\"]*)\" from Techfios database$")
	public void user_enters_from_Techfios_database(String data) throws InterruptedException {
	    
		
		
		switch(data) {
		case "username":
			System.out.println("Username from DB:" + databasepage.getDataFromDb("username"));
		        
		
				loginPageObj.enterUserName(databasepage.getDataFromDb("username"));
			

			break;
			
	       case "password":
			System.out.println("Password from DB:" + databasepage.getDataFromDb("password"));
			
				loginPageObj.enterPassword(databasepage.getDataFromDb("password"));
			
			break;
			
			default:
				System.out.println("invalid data");
			
			
		}
	}
	*/
	
	@After
	public void tearDown() {

		driver.close();
		driver.quit();
	}

}
