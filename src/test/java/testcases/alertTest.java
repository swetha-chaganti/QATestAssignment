package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import TestBase.Baseclass;

public class alertTest extends Baseclass{
	@Test
	public void validateAlert() {
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("timerAlertButton")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	 Alert alert = driver.switchTo().alert();
	 System.out.println("Alert box text " + alert.getText());
     alert.accept();
		
	}

}
