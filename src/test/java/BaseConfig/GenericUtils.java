package BaseConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	
	public static WebDriver driver;
	public static Properties properties;
	static WebDriverWait wd;
	static Actions action;

	public static String getProperty(String key) throws IOException {

		properties = new Properties();
		FileInputStream fis = new FileInputStream("./src/test/java/TestData.properties");
		properties.load(fis);

		return properties.getProperty(key);
	}
	
	public static WebDriver setBrowser() throws IOException {
		if (GenericUtils.getProperty("browserName").equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "./src/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Inside Firefox");

		} else if (GenericUtils.getProperty("browserName").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("INside Chrome");

		} else if (GenericUtils.getProperty("browserName").equals("Internet Explorer")) {
			System.setProperty("webdriver.internetexplorer.driver", "");
			driver = new InternetExplorerDriver();

		}
		
		driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public static void explicitWait(WebElement ele,long timeOutInSeconds) {
		wd = new WebDriverWait(driver,timeOutInSeconds);
		wd.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void hoverToElement(WebElement ele) {
		action=new Actions(driver);
		
		action.moveToElement(ele).build().perform();
	}
	
	public static void closeUnExpectedPopup() {
		String mainWinHandle = driver.getWindowHandle(); // Get your main window
		String subWinHandle = null;

		Set<String> allHandle = driver.getWindowHandles(); // Fetch all handles
		Iterator<String> iterator = allHandle.iterator();
		
		if(allHandle.size()>1) {
			System.out.println("I am here");
			while (iterator.hasNext()){
				subWinHandle = iterator.next();
				if(!subWinHandle.equals(mainWinHandle)) {
					driver.switchTo().window(subWinHandle); // switch to popup
					driver.close();
				}
				 
				
			}
			driver.switchTo().window(mainWinHandle);
		}
		
		
	                                      

		
		
	}


}
