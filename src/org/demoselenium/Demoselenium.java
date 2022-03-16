package org.demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Demoselenium {
	public static void main(String[] args) {

		Demoselenium web = new Demoselenium();

		web.openBrowserByType("http://www.greenstechnologys.com/", "chrome");
		web.openBrowserByType("http://gmail.com/", "chrome");
		web.openBrowserByType("http://www.flipkart.com/", "chrome");
		web.openBrowserByType("http://greenstech.in/selenium-course-content.html", "chrome");

		web.openBrowserByType("http://www.greenstechnologys.com/", "edge");
		web.openBrowserByType("http://gmail.com/", "edge");
		web.openBrowserByType("http://www.flipkart.com/", "edge");
		web.openBrowserByType("http://greenstech.in/selenium-course-content.html", "edge");

		web.openBrowserByType("http://www.greenstechnologys.com/", "opera");
		web.openBrowserByType("http://gmail.com/", "opera");
		web.openBrowserByType("http://www.flipkart.com/", "opera");
		web.openBrowserByType("http://greenstech.in/selenium-course-content.html", "opera");

	}

	private void openBrowserByType(String url, String type) {
		WebDriver webDriver = null;

		if (type.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\karthikeyan\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");

			webDriver = new ChromeDriver();
			webDriver.get(url);

		} else if (type.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\karthikeyan\\Downloads\\New folder\\edgedriver_win64\\msedgedriver.exe");
			webDriver = new EdgeDriver();
			webDriver.get(url);
		} else if (type.equals("opera")) {
			System.setProperty("webdriver.opera.driver",
					"C:\\Users\\karthikeyan\\Downloads\\New folder\\operadriver_win64\\operadriver_win64\\operadriver.exe");

			webDriver = new OperaDriver();

		}
		if (webDriver != null)
			webDriver.get(url);

	}

}
