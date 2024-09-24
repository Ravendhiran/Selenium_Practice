package Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openNewTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");

	}

}
