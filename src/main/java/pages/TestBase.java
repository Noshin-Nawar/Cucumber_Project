package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public static void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	public void takeScreenshot(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//ts.getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+"/screenshot/"+ System.currentTimeMillis()+".png"));
			
			File sourceFile =ts.getScreenshotAs(OutputType.FILE);
			String currentDirectory = System.getProperty("user.dir");
			
			SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
			Date date = new Date();
			String label = formatter.format(date);
			
			
			FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label + ".png"));
		
		} catch (WebDriverException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
	}
}
