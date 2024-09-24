package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_getTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		String mainWindow = driver.getWindowHandle();
		
		WebElement mulTab = driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']"));
		mulTab.click();
		
		WebElement multiWindow = driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]"));
		multiWindow.click();
		
		Set<String> windowHandles = driver.getWindowHandles();

		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			if(title.equals("Index")||title.equals("Selenium")) {
				
				System.out.println("Closed Title: "+title+ ", URL: "+driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		WebElement sepWindow = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
		sepWindow.click();
		/*// Example: 2
		
		for (String handle : windowHandles) {
			if(!(handle.equals(mainWindow))) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}*/
		
	}

}
