package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public static WebDriver driver;
	public static Properties config=new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	
	
	@BeforeSuite
	public void setup() throws IOException {
		if(driver==null) {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
			config.load(fis);
		if(config.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(config.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,10);//explicit wait is used here for handling alerts
	}
}
		
	
	@AfterSuite
public void teardown() {
		if(driver!=null) {
			driver.close();
		}
		
	
}}




