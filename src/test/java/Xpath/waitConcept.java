package Xpath;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String mainWindow = driver.getWindowHandle();
		
		/*WebElement mulWindows = driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		mulWindows.click();
		WebElement mulWindowsButton = driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]"));
		mulWindowsButton.click();
		*/
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement mulWindows = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"#Multiple\"]")));
		mulWindows.click();
		
		WebElement mulWindowsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"multiwindow()\"]")));
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
