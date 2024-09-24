package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		js.executeScript("arguments[0].value='Ravi';", search);
		
		search.sendKeys(Keys.ENTER);
		
		WebElement images = driver.findElement(By.xpath("//div[text()='Images']"));
		js.executeScript("arguments[0].click();", images);
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		

	}

}
