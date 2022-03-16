package org.demoselenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	WebElement firsttname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firsttname.sendKeys("karthi");
	WebElement lasttname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lasttname.sendKeys("keyan");
	WebElement addres = driver.findElement(By.xpath("//textarea[@rows='3']"));
	addres.sendKeys("79 bharathipuram"
			+ "pauparapatti"
			+ "pennagram");
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("karthi051194mail.com");
	WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("456123789");
	WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
	gender.click();
	WebElement hobbies = driver.findElement(By.id("checkbox1"));
	hobbies.click();
	
		WebElement e = driver.findElement(By.id("Skills"));
		Select s = new Select(e);
		s.selectByValue("Android");
		
		WebElement c = driver.findElement(By.id("country"));
		Select s1 = new Select(c);
		s1.selectByValue("India");
		
	WebElement year = driver.findElement(By.id("yearbox"));
		Select s2=new Select(year);
		s2.selectByValue("1995");
		
		//WebElement month = driver.findElement(By.);
		//Select s3=new Select(month);
		//s3.selectByValue("November");
		
		WebElement date = driver.findElement(By.id("daybox"));
		Select s4 =new Select(date);
		s4.selectByValue("5");
		
		WebElement pass = driver.findElement(By.id("firstpassword"));
		pass.sendKeys("456454");
		WebElement secpass = driver.findElement(By.id("secondpassword"));
		secpass.sendKeys("456454");
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();
		
		
		
		
		
	}

}
