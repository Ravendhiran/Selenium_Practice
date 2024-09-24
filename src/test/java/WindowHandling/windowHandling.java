package WindowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandling {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
						
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://demo.automationtesting.in/Windows.html");
			
			String mainWindow = driver.getWindowHandle();
			
			WebElement mulWindows = driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
			mulWindows.click();
			WebElement mulWindowsButton = driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]"));
			mulWindowsButton.click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			for (String handle : windowHandles) {
				if(!handle.equals(mainWindow)) {
					driver.switchTo().window(handle);
					driver.close();
				}
			}
	}

}
