package org.demoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icic {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");

    //quwstion 10 ok

	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement idname = driver.findElement(By.id("username"));
	idname.sendKeys("karthi");
	WebElement idpass = driver.findElement(By.id("password"));
	idpass.sendKeys("5484");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	

	
	
	
}
}
