package org.demoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskselenium2day {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// question 01
		/*
		  driver.get("https://www.facebook.com/");
		 WebElement fbid = driver.findElement(By.id("email"));
		 fbid.sendKeys("karthi");
		 WebElement fbpass = driver.findElement(By.id("pass"));
		 fbpass.sendKeys("4561");
		*/
		
		
		// question 2 ok

		/*
		  WebDriver driver=new ChromeDriver(); driver.get("https://www.redbus.in/");
		  WebElement from = driver.findElement(By.id("src")); from.sendKeys("chennai");
		  WebElement To = driver.findElement(By.id("dest"));
		  To.sendKeys("dharumapuri"); WebElement button =
		  driver.findElement(By.id("search_btn")); button.click();
		 
*/
		// question 3 ok

		/*
		  WebDriver driver=new ChromeDriver(); driver.get("https://www.google.com/");
		  WebElement txtser = driver.findElement(By.name("q"));
		  txtser.sendKeys("GreensTechnology.");
		 */
		// question 4 notok

		/*WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement idname = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		idname.sendKeys("karthikeyan");
		WebElement icicpass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		icicpass.sendKeys("4567897");
*/
		// question 5 notok

		
		 /* WebDriver driver1=new ChromeDriver();
		  driver1.get("https://netbanking.hdfcbank.com/netbanking/");
		  WebElement hdfcid = driver1.findElement(By.name("fldLoginUserId"));
		  hdfcid.sendKeys("karthi");*/
	
		 
		// question 6 notok

		/*
		  WebDriver driver1=new ChromeDriver(); driver1.get("https://www.swiggy.com/");
		  WebElement idname = driver1.findElement(By.id("location"));
		  idname.sendKeys("palavakam");
		  */
		 
		// question 7 ok
/*
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.snapdeal.com/login");
		WebElement entno = driver2.findElement(By.id("userName"));
		entno.sendKeys("9750765850");
		WebElement click = driver2.findElement(By.id("checkUser"));
		click.click();*/

		//question 8 notok
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement istname = driver.findElement(By.name("username"));
		istname.sendKeys("9750765850");
		WebElement istpass = driver.findElement(By.name("password"));
		istpass.sendKeys("45612");
		
*/
		//question 9
	/*	
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
		
	}*/

		//question 10
		
		/* WebDriver driver = new ChromeDriver();
		 driver.get("http://adactinhotelapp.com/");
		 WebElement idname = driver.findElement(By.id("username"));
		 idname.sendKeys("kartih");
		 WebElement pass = driver.findElement(By.id("password"));
		 pass.sendKeys("45612");
		 */
		 
		 
		 
	}
	}

	
