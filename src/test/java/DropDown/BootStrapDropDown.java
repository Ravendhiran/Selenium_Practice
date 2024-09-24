package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

		WebElement dropDown = driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));
		dropDown.click();
		
		WebElement javaOption = driver.findElement(By.xpath("//input[@value='Java']"));
		javaOption.click();

		List<WebElement> options = driver
				.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//input[@type='checkbox']"));

		System.out.println("Size: " + options.size());

		for (int i = 0; i < options.size(); i++) {
			options.get(i).click();
			System.out.println(options.get(i).getText());
		}
		
		
		for (WebElement op : options) {
			System.out.println(op.getAttribute("value"));
		}
		

	}

}
