package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	
	public static WebDriver driver;
	
	public static void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					".\\lib\\chromedriver.exe");
			 driver = new ChromeDriver();
			 System.out.println(browserName + "broswer is up and running");
			
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 System.out.println(browserName + "broswer is up and running");
			
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",".\\lib\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println(browserName + "broswer is up and running");
			
		}
		else {
			System.out.println("Unable to launch" + browserName + "browser" + "Invalid input!");
		}
		
	}
	@SuppressWarnings("deprecation")
	public static void openURL() {
		try {
			driver.get("https://seleniumautomationpractice.blogspot.com/");
			System.out.println("Application is up and running");
			
		} catch (Exception e) {
			System.out.println("Unable to open URL" + e.getMessage());
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void shutDown() {
		driver.quit();
		System.out.println("shutting down the driver");
	}
	
	public static void click (By locValue) {
		try {
			driver.findElement(locValue).click();
			System.out.println("Clicked on the element having locvaluetor-: ");
		
			
		} catch (Exception e) {
			System.out.println("Unable to click on the element having locvaluetor-:");
			
		}
	}
	
	public static void enterTxt(By locValue, String Data) {
		try {
			//driver.findElement(locValue).clear();
			driver.findElement(locValue).sendKeys(Data);
			System.out.println("Entered the -" + Data + "into the textbox");
		} catch (Exception e) {
			System.out.println("Unable to enter the value into the textbox");
		}
		
	}
	
	public static void select(By locName, String data) {
		try {
			new Select(driver.findElement(locName)).selectByVisibleText(data);
		} catch (Exception e) {
			System.out.println("unable to select the" + data + "using:-" + locName);
		}
	}
	public static void select(By locName, int no) {
		try {
			new Select(driver.findElement(locName)).selectByIndex(no);
		} catch (Exception e) {
			System.out.println("unable to select the option having index position" + no + "using:-" + locName);
		}
	}
	 public static void alertAction(String action) {
		 try {
			if(action.equalsIgnoreCase("ok")) {
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			}
			else if (action.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("Error in performing action on alert box:" + e.getMessage());
		}
	 }
	
	
}
	


