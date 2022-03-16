package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//question 03
		
		/*driver.get("https://www.facebook.com/");
	    WebElement crtbtn = driver.findElement(By.xpath("//div[@class='_6ltg'][2]"));
		crtbtn.click();
		
		
		WebElement state = driver.findElement(By.id("year"));
		
		Select s=new Select(state);
	
		List<WebElement> alloption = s.getOptions();
 
        
        for(int i=0;i<alloption.size();i++) {
        	WebElement ops = alloption.get(i);	
        	String text = ops.getText();
        	System.out.println(text);
        }*/
	
		// enhanced for loop
		/*
		for(WebElement x:alloption) {
			System.out.println(x.getText());
		}*/
		
		//question 04
		/*
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement> options = s.getOptions();
		
		for(WebElement x:options) {
			System.out.println(x.getText());
		}
		*/
		
		//question 05
		
		/*WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<=31;i=i+2) {
			System.out.println(i);
		}*/
		
		//question 06
		
	/*driver.get("https://demo.guru99.com/test/newtours/register.php");
	
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(country);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement coun = options.get(i);
			String text = coun.getText();
			System.out.println(text);
		}*/
		
		
		//question 07
	/*
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(country);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement coun = options.get(i);
			String attribute = coun.getAttribute("value");
			System.out.println(attribute);
		}*/
		
		//question 13 
		
		/*driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s=new Select(fruit);	
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	
		for(int i=0;i<allSelectedOptions.size();i++) {
			WebElement all = allSelectedOptions.get(i);
			String text = all.getText();
			System.out.println(text);
		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String txt = firstSelectedOption.getText();
		System.out.println(txt);*/

		
		//question 12
		

		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s=new Select(fruit);	
		
		
		s.selectByIndex(1);
		
		s.selectByIndex(2);
		
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for(int t=0;t<allSelectedOptions.size();t++) {
	
	int a= s.getOptions().size()-allSelectedOptions.size();
	System.out.println(a);		
	

	
	
	
	
	
		
	}

}}
