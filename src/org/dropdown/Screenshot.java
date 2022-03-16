package org.dropdown;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//TakesScreenshot tk= (TakesScreenshot)driver;
		/*driver.get("https://www.facebook.com/");
		File scr = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(scr);
		
		File save=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, save);
		System.out.println("ok");*/
		
		
		//question 01 
		
		
		/*driver.get("http://www.greenstechnologys.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File save=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, save);
		*/
		
		//question 07
		
		/*driver.get("https://greenstech.in/selenium-course-content.html");
		WebElement interview = driver.findElement(By.id("heading20"));
		interview.click();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File save=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, save);
		*/
		
		//question 08
		/*
		driver.get("https://greenstech.in/selenium-course-content.html");
		WebElement scr = driver.findElement(By.id("heading302"));
		scr.click();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File save = tk.getScreenshotAs(OutputType.FILE);
		File take=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(save, take);*/
		
		//question 09
		/*
		driver.get("https://www.flipkart.com/");
		WebElement clic = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clic.click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		WebElement butt = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		butt.click();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File save=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, save);*/
		
		//question 10
		
		/*driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("motorolo");
		
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File save=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, save);*/
		
		//question 11
		
		/*driver.get("https://www.flipkart.com/");
		WebElement clic = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clic.click();
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		fashion.click();
		Actions a=new Actions(driver);
		WebElement woman = driver.findElement(By.xpath("//span[text()='Women']"));
		a.moveToElement(woman).perform();
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, f);
		*/
		
		
		//question 12
		
		/*driver.get("https://www.flipkart.com/");
		WebElement clic = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clic.click();
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		fashion.click();
		Actions a=new Actions(driver);
		WebElement woman = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		a.moveToElement(woman).perform();
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, f);
		*/
		
		//question 13
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		search.sendKeys("hp laptop");
		
		WebElement click = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		click.click();
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File save=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\screenshort\\pic.png");
		FileUtils.copyFile(scr, save);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
