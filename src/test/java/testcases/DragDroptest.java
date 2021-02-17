package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TestBase.Baseclass;

public class DragDroptest extends Baseclass {
	
	@Test
	public void validateDragDrop() throws InterruptedException {
		driver.get("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		
		
	

}
}