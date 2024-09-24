package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);*/

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		ac.moveToElement(fashion).build().perform();
		
		WebElement womenEthnic = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		ac.moveToElement(womenEthnic).perform();
		
		WebElement sarees = driver.findElement(By.xpath("//a[text()='Women Sarees']"));
		sarees.click();

	}

}
