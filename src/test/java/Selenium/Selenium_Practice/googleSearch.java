package Selenium.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("CTS");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		

	}
}
