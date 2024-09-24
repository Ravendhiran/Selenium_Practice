package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);*/

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Test");
		searchBox.sendKeys(Keys.ENTER);
	
		/*
		Actions ac = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("(//span[text()='Merriam-Webster'])[1]"));
		WebElement target = driver.findElement(By.xpath("(//span[text()='Speedtest by Ookla'])[1]"));
		
		ac.dragAndDrop(source, target);
	*/
	}

}
