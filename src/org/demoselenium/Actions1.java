package org.demoselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		//driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//question 01
		
		/*WebElement move5000 = driver.findElement(By.id("credit2"));
		WebElement movtar = driver.findElement(By.id("bank"));
		
		a.dragAndDrop(move5000, movtar).perform();
		
		WebElement debit = driver.findElement(By.id("fourth"));
		WebElement debitamou = driver.findElement(By.id("amt7"));
		
		a.dragAndDrop(debit, debitamou).perform();
		
        WebElement sale = driver.findElement(By.id("credit1"));
		WebElement saleaccount = driver.findElement(By.id("loan"));
		
		a.dragAndDrop(sale, saleaccount).perform();
		
		WebElement debit1 = driver.findElement(By.id("fourth"));
		WebElement cridt = driver.findElement(By.id("amt8"));
		
		a.dragAndDrop(debit1, cridt).perform();
		*/
		
		//question 02
		
	/*	driver.get("https://www.amazon.in/");
		WebElement prime = driver.findElement(By.id("nav-link-prime"));
		a.moveToElement(prime).perform();
		WebElement image = driver.findElement(By.id("multiasins-img-link"));
		image.click();*/
		
		
		//question 03 50%ok
		
		/*driver.get("https://www.flipkart.com/");
		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         WebElement home = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
		a.moveToElement(home).perform();
		WebElement fur = driver.findElement(By.xpath("//div[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(fur).perform();
		WebElement bath = driver.findElement(By.xpath("//a[text()='Bath linen']"));
	a.moveToElement(bath).perform();*/
		
		
		//question 04
		
		
		
		
		
	//question 05
		/*driver.get("https://www.shopclues.com/wholesale.html");
		WebElement sport = driver.findElement(By.id("nav_45"));
		a.moveToElement(sport).perform();
		WebElement weight = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/weight-gainers.html?sort_by=bestsellers&sort_order=desc']"));
		weight.click();*/
		
		
		//question 06 ok
		
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement coures = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(coures).perform();
		WebElement soft = driver.findElement(By.xpath("//div[@title='Software Testing']"));
		a.moveToElement(soft).perform();
		WebElement traning = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		traning.click();*/
		
		
		
		
		
		
		
	//question 07	
		
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement coures = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(coures).perform();
		WebElement oracle = driver.findElement(By.xpath("//div[@title='Oracle']"));
		a.moveToElement(oracle).perform();
		WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		sql.click();
*/		
	//question 08	
		
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement coures = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(coures).perform();
		WebElement data = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(data).perform();
		WebElement infor = driver.findElement(By.xpath("//span[text()='Informatica Certification Training']"));
		infor.click();*/		
		
	//question 09	
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement coures = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(coures).perform();
		WebElement rpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		a.moveToElement(rpa).perform();
		WebElement blue = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		blue.click();*/
		
	//question 10 repeat question
		
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement coures1 = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(coures1).perform();
		WebElement data1 = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(data1).perform();
		*/
	//question 11 
		/*
		driver.get("https://www.homedepot.com/");
		WebElement depart = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout']"));
		a.moveToElement(depart).perform();
		WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		a.moveToElement(heat).perform();
		WebElement air = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		a.moveToElement(air).perform();
		WebElement Portable = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		Portable.click();*/
		
	//qustion 12
		/*driver.get("https://www.homedepot.com/");
		WebElement depart1 = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout']"));
		a.moveToElement(depart1).perform();
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		WebElement internal = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(internal).perform();
		WebElement celling = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		celling.click();*/
		
	//question 13	
		/*driver.get("https://www.snapdeal.com/");
		WebElement mobile = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		a.moveToElement(mobile).perform();
		WebElement flip = driver.findElement(By.xpath("//span[text()='Flip Covers']"));
		flip.click();*/
		
		
	//question 14
		
		/*driver.get("https://www.snapdeal.com/");
		WebElement fashion = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(fashion).perform();
		WebElement foodwear = driver.findElement(By.xpath("//span[text()='Heels']"));
		foodwear.click();*/
		
	//question 15	
		/*
		driver.get("https://www.amazon.in/");;
		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(sign).perform();
		WebElement start = driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
		start.click();
		WebElement id = driver.findElement(By.id("ap_customer_name"));
		id.sendKeys("karthi");
		WebElement phone = driver.findElement(By.id("ap_phone_number"));
		phone.sendKeys("9750765850");
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("karthi0511");
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("kar05@1");*/
		
		//question 16
		
		//question 17
		/*
		driver.get("https://www.flipkart.com/");
		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click.click();
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='_1mkliO'])[4]"));
		a.moveToElement(fashion).perform();
		WebElement woman = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(woman).perform();	//a[text()='Toys & School Supplies']
		*/
		
		
		//question 18 50%ok
		/*driver.get("https://www.flipkart.com/");
		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click.click();
		WebElement toys = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[9]"));
		a.moveToElement(toys).perform();
		WebElement toys1 = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(toys1).perform();*/
	
		
		//question 19
		
		//question 20 ok
		
		/*driver.get("https://www.flipkart.com/");
		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click.click();
		WebElement electric = driver.findElement(By.xpath("(//div[@class='_1mkliO'])[7]"));
		a.moveToElement(electric).perform();
		WebElement television = driver.findElement(By.xpath("//a[text()='Televisions']"));
		television.click();
		WebElement mi = driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW'][1]"));
		mi.click();*/
		
		
		
		
		
		
		
		
	}

}
