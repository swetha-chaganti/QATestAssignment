package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TestBase.Baseclass;

public class toolTipsTest extends Baseclass {
	
	@Test
	public void validateHoverbutton() throws InterruptedException {
		driver.get("https://demoqa.com/tool-tips");
		WebElement ele=driver.findElement(By.id("toolTipButton"));
		WebElement hoverfield=driver.findElement(By.id("toolTipTextField"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		act.moveToElement(hoverfield).perform();
		Thread.sleep(2000);
		
	}

}
