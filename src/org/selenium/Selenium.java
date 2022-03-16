package org.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Selenium {
	public static void main(String[] args) {
		Scanner drivers = new Scanner(System.in);

		System.out.println("Enter your browser name");
		String next = drivers.next();
		System.out.println(next);
		System.out.println((next.equals("chrome")));
		Selenium drive = new Selenium();
		if (next.equals("chrome")) {
			drive.openChrome();
		}
		
		if (next.equals("Opera")) {
			drive.openOpera();
		}
        if(next.equals("edge")) {
        	
			drive.openedge();	
        }
		
		
	}

	private void openChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	private void openOpera() {
		System.setProperty("webdriver.opera.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\operadriver_win64\\operadriver_win64\\operadriver.exe");

		WebDriver driver = new OperaDriver();
		driver.get("https://www.facebook.com/");
	}

	private void openedge() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\karthikeyan\\Downloads\\New folder\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
}
