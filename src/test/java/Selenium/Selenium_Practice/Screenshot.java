package Selenium.Selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
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
		
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Automation\\Selenium_Practice\\Screenshot\\amazon.png");
		FileUtils.copyFile(screenshotAs, destination);
		
		driver.close();
				

	}

}
