package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement input = driver.findElement(By.id("inputText1"));
		input.sendKeys("Welcome");
		
		//Ctrl + A
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+C
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//Tab
		ac.sendKeys(Keys.TAB).perform();
		
		//Ctrl + V
		ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		

	}

}
