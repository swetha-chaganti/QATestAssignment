package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TestBase.Baseclass;

public class DateTest extends Baseclass{
	@Test
	public void validateDatepicker() throws InterruptedException {
	driver.get("https://demoqa.com/date-picker");
	driver.findElement(By.id("datePickerMonthYearInput")).click();
	driver.findElement(By.xpath("//*[@id='datePickerMonthYear']//select")).click();
	WebElement selectMonth = (wait.until(ExpectedConditions.presenceOfElementLocated(By.className("react-datepicker__month-select"))));
	Select select = new Select(selectMonth);
	select.selectByValue("2");
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("select.react-datepicker__year-select")).click();
	WebElement selectYear = (wait.until(ExpectedConditions.presenceOfElementLocated(By.className("react-datepicker__year-select"))));
	Select year=new Select(selectYear);
	year.selectByValue("1991");
	Thread.sleep(3000);
	List<WebElement> dates=driver.findElements(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[2]"));
	int count=driver.findElements(By.cssSelector("div.react-datepicker__month")).size();
	for(int i=0;i<count;i++) {
		String text=driver.findElements(By.cssSelector("div.react-datepicker__month")).get(i).getText();
		if(text.equalsIgnoreCase("17")) {
			driver.findElements(By.cssSelector("div.react-datepicker__month")).get(i).click();
			break;
		}
	}
	
	}}//*[@id="datePickerMonthYear"]/div[2]/div[2]/div/div/div[2]/div[2]