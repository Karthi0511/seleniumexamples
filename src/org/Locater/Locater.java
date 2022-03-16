package org.Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.facebook.com/" );
		
		WebElement txtname = driver.findElement(By.id("email"));
		txtname.sendKeys("karthi051194@gmail.com");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("4568759");
		WebElement clickbutn = driver.findElement(By.name("login"));
		clickbutn.click();
		
		
	}

}
