package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement createNewAccount = driver.findElement(By.partialLinkText("Create new account"));
		createNewAccount.click();
		
		WebElement day = driver.findElement(By.id("day"));
		day.click();
	
		Select s = new Select(day);
		s.selectByVisibleText("11");
		
		System.out.println(s.isMultiple());
		
		WebElement month = driver.findElement(By.id("month"));
		month.click();
	
		Select s2 = new Select(month);
		s2.selectByIndex(7);
		
		WebElement year = driver.findElement(By.id("year"));
		year.click();
	
		Select s3 = new Select(year);
		s3.selectByVisibleText("2020");
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.click();
		
		
	}

}
