package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskselenium {
	public static void main(String[] args) {
		
		//question 1 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement amzid = driver.findElement(By.id("twotabsearchtextbox"));
		amzid.sendKeys("iphone");
		WebElement amzsear = driver.findElement(By.id("nav-search-submit-button"));
		amzsear.click();
		
	}

}
