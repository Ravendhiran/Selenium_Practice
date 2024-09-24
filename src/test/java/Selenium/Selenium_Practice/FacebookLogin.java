package Selenium.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("ravendhiran04@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Ravi@5391");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}

}
