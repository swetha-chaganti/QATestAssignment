package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestBase.Baseclass;

public class RegistrationTest extends Baseclass {
	
	@Test
	public void validFormdetails() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("user1");
		driver.findElement(By.id("lastName")).sendKeys("testuser2");
		driver.findElement(By.id("userEmail")).sendKeys("testemail@domain.com");
		WebElement radio2=driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label"));
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");	
		driver.findElement(By.id("userNumber")).sendKeys("9123689399");
		WebElement option1=driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label"));
		option1.click();
		Thread.sleep(2000);
		System.out.println("check box option 1 is Selected");
		WebElement chooseFile=driver.findElement(By.id("uploadPicture"));
		chooseFile.sendKeys("C:\\Users\\User\\Documents\\Screenshots\\picture.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("currentAddress")).sendKeys("27 Clifton");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("submit")).click();
		String expText="Thanks for submitting the form";
	String text=driver.findElement(By.xpath("//*[@id='example-modal-sizes-title-lg']")).getText();
	if(expText.equalsIgnoreCase(text)) 
		System.out.println("The expected text is same as actual text --- "+text);
	else
		System.out.println("The expected text is not actual text --- "+text);
	driver.findElement(By.id("closeLargeModal")).click();
	
	
				//*[@id="example-modal-sizes-title-lg"]
		
	}
	

}
//*[@id="hobbiesWrapper"]/div[2]/div[1]/label