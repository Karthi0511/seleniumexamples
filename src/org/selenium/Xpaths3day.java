package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths3day {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver_win32\\chromedriver.exe");
	
		//question 01 
	
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement enter = driver.findElement(By.id("twotabsearchtextbox"));
		enter.sendKeys("iphone");
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();*/
		
	
//using xpath
	//question 2
	/*
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("karthi05194@gmail");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("45612");
		
		WebElement click = driver.findElement(By.xpath("//button[@value='1']"));
		click.click();
		*/
		
						
//ok question 5&8
	/*
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement find = driver.findElement(By.xpath("//div[@class='card-header1 d-flex align-items-center justify-content-between']"));
		find.click();
		
		WebElement resum = driver.findElement(By.xpath("//div[@class='card-header11 d-flex align-items-center justify-content-between']"));
		resum.click();
		
		
		WebElement resum1 = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
		resum1.click();
		*/
		
		
		
		
		
	//ok	question 7
	/*
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	
	WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
	from.sendKeys("chennai");	
		
	WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
	to.sendKeys("dharmapuri");	
	
	WebElement click = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
	click.click();	
		*/
	//question 9 notok	
	
	/*WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement loginclick = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	loginclick.click();
	WebElement filpname = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	filpname.sendKeys("karthi");*/
	
	//question 10 
	
	/*WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement moblieclck = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
	moblieclck.click();*/
	
	//question 11 ok

	/*WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	WebElement name = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
	name.sendKeys("karthi");
	WebElement latname = driver.findElement(By.xpath("//input[@id='lastName']"));
	latname.sendKeys("keyan");
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("karthi02158@");
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("555555");
	WebElement confpass = driver.findElement(By.xpath("//input[@aria-label='Confirm']"));
	confpass.sendKeys("555555");
	*/
	
	//question 12 notwork
	
	/*WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement signin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	signin.click();
	WebElement login = driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
	login.click();
	WebElement moibl = driver.findElement(By.id("userName"));
	moibl.sendKeys("97507658500");
	WebElement clickcon = driver.findElement(By.xpath("//button[@id='checkUser']"));
	clickcon.click();*/
	
	//question 13
	
	/*WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement mobileno = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	mobileno.sendKeys("9562343210");
	WebElement button = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	button.click();
	*/
	//question 14
	
	/*WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	WebElement signin = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	signin.click();
	WebElement phoneno = driver.findElement(By.xpath("//input[@type='tel']"));
	phoneno.sendKeys("78945461230");
	WebElement name = driver.findElement(By.xpath("//input[@tabindex='2']"));
	name.sendKeys("karthi");
	WebElement email = driver.findElement(By.xpath("//input[@tabindex='3']"));
	email.sendKeys("karthi897654@");
	WebElement pass = driver.findElement(By.xpath("//input[@tabindex='4']"));
	pass.sendKeys("karthi897654@");*/
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement sign = driver.findElement(By.id("signin-block"));
	sign.click();
	
	WebElement sign2 = driver.findElement(By.id("signInLink"));
	sign2.click();
	WebElement mobile = driver.findElement(By.xpath("//div[@class='mobileInput clearfix']"));
	mobile.sendKeys("975076585");
	
	
	
	
	
	
	
	
	
	}
	
	}
