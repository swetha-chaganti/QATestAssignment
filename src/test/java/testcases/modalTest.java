package testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestBase.Baseclass;

public class modalTest extends Baseclass {
	
	@Test
	public void validateDragDrop() throws InterruptedException {
		driver.get("https://demoqa.com/modal-dialogs");
		driver.findElement(By.id("showSmallModal")).click();
		driver.findElement(By.id("closeSmallModal")).click();
		
		
	

}
}