package Selenium.Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		
	}

}
