package Selenium.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement nav_signin = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		nav_signin.click();
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("919944258763");
		WebElement continue_button = driver.findElement(By.id("continue"));
		continue_button.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("9944258763");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		
	
	
	
	}

}
