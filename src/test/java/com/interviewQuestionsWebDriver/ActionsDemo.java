package com.interviewQuestionsWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {

	@Test
	public void testcase1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		WebElement e1 = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		
		Actions action = new Actions(driver);
		action.contextClick(e1).build().perform();
		action.doubleClick(e1).build().perform();
	
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
		action.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
