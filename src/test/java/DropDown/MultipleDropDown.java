package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement selCourse = driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
		Select s = new Select(selCourse);
		s.selectByVisibleText("Selenium");//selCourse.sendKeys("Selenium");
		
		System.out.println(s.isMultiple());
		
		WebElement multCourse = driver.findElement(By.xpath("(//li[@class=\"ui-autocomplete-input-token\"]//ancestor::div//button)[1]"));
		multCourse.click();
		
		WebElement chooseCourse = driver.findElement(By.xpath("//li[@data-item-value=\"Selenium WebDriver\" and @role=\"option\"]"));
		
		WebElement sendCourseName = driver.findElement(By.xpath("//input[@id=\"j_idt87:auto-complete_input\" and @placeholder=\"Choose Course\"]"));
		sendCourseName.sendKeys("Selenium");
		
		chooseCourse.click();
		
		
		
	}

}
