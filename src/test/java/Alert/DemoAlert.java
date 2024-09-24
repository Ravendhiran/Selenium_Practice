package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement simpAlert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simpAlert.click();
		
		Alert alertSimp = driver.switchTo().alert();
		alertSimp.accept();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirmAlert.click();
		
		Alert alertConfirm = driver.switchTo().alert();
		alertConfirm.dismiss();
		
		WebElement promptOption = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		promptOption.click();
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promptAlert.click();
		
		Alert alertPrompt = driver.switchTo().alert();
		alertPrompt.sendKeys("Test");
		alertPrompt.accept();
			
	}

}
