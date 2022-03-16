package org.demoselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Keyboard {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a=new Actions(driver);
	
		
		Robot r=new Robot();
		
		driver.get("https://www.facebook.com/");
		WebElement idemail = driver.findElement(By.id("email"));
		idemail.sendKeys("9750765850");
		
		/*a.doubleClick(idemail).perform();
		a.contextClick(idemail).perform();
		
		for(int i=0;i<=1;i++){
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement idpass = driver.findElement(By.id("pass"));
		a.contextClick(idpass).perform();
		
		for(int i=0;i<=1;i++){
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		*/
		
	
	}

}