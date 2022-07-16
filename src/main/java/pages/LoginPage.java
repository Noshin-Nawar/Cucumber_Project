package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	// creating a constructor to connect two drives (driver of LoginTest with driver
	// of LoginPage)

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element list
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BANK_CASH_ELEMENT;

	// Methods to interacts with the Elements
	public void enterUserName(String username) throws InterruptedException {

		USER_NAME_ELEMENT.sendKeys(username);
       Thread.sleep(3000);
		
	}

	
	public void enterPassword(String password) {

		PASSWORD_ELEMENT.sendKeys(password);

		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
	public void clickSignInButton() {

		SIGNIN_ELEMENT.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.getStackTrace();
		}
	}

	
	public void clickBankCashButton() {

		BANK_CASH_ELEMENT.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.getStackTrace();
		}
	}

	
	public String getPageTitle() {
		
		return driver.getTitle();
	}
}
