package org.demoselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtext4day {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//task 01
		
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement greentxt = driver.findElement(By.xpath("//u[contains(text(),'Greens Technologys Software Tra')]"));
		String text = greentxt.getText();
		System.out.println(text);
		*/
		//task 02 ok
		
		/*driver.get("http://greenstech.in/selenium-course-content.html");	
		WebElement clli = driver.findElement(By.id("home-tab"));
		clli.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan has a passion for ')]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = para.getText();
	
		System.out.println(text);*/
		
		
		
	//task 03 ok
		
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement allbrand = driver.findElement(By.xpath("//p[contains(@class,'mail-info')]"));
		String text = allbrand.getText();
		System.out.println(text);*/
		
		
		//task 04
		
		driver.get("http://www.greenstechnologys.com/");
		WebElement allbrand = driver.findElement(By.xpath("//div[@class='trainer-info'][2]"));
		String text = allbrand.getText();
		System.out.println(text);
		
		
		//task 05 ok
		
		/*driver.get("http://www.greenstechnologys.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),' is a leading Training and Placements company in Chennai')]"));
		String text = para.getText();
		System.out.println(text);*/
		
	
		//task 06 ok
		/*
		driver.get("https://www.facebook.com/");
		WebElement fbid = driver.findElement(By.id("email"));
		fbid.sendKeys("karthi");
		String atuser = fbid.getAttribute("value");
		System.out.println(atuser);
		WebElement fbpass = driver.findElement(By.id("pass"));
		fbpass.sendKeys("4561");
		String atpass = fbpass.getAttribute("value");
		System.out.println(atpass);*/
	
		//task07 notok
		
		/*driver.get("https://www.google.com/");
		WebElement sear = driver.findElement(By.name("q"));
		sear.sendKeys("greens velmurugan");*/
		//driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);

		//task 08 ok
		/*
		driver.get("http://adactinhotelapp.com/");
		WebElement idname = driver.findElement(By.id("username"));
		idname.sendKeys("karthikeyan");
		String idval = idname.getAttribute("value");
		System.out.println(idval);
		WebElement idpass = driver.findElement(By.id("password"));
		idpass.sendKeys("4569");
		String idpasval = idpass.getAttribute("value");
		System.out.println(idpasval);*/
		
		
		
		
		//task 09  
		
		/*driver.get("https://www.snapdeal.com/");
		WebElement proname = driver.findElement(By.name("keyword"));
		proname.sendKeys("mobile");
		WebElement click = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		click.click();*/
		//WebElement search = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		//search.click();
		
		
		
		// task 10
		
		/*driver.get("https://www.flipkart.com/");
		WebElement inputva = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		inputva.sendKeys("mobile");
		*/
		
		//question 11
		
		/*driver.get("https://www.flipkart.com/");
		WebElement clicklogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		clicklogin.click();
		WebElement idname = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		idname.sendKeys("karthi051@");
		String idprit = idname.getAttribute("value");
		System.out.println(idprit);
		WebElement pass = driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN'])[2]"));
		pass.sendKeys("45612@");
		String prtpass = pass.getAttribute("value");
		System.out.println(prtpass);*/
		
	//question 12
		
		/*driver.get("https://www.shopclues.com/wholesale.html");
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.sendKeys("mobile");
		WebElement button = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		button.click();
		*/
	}

}
