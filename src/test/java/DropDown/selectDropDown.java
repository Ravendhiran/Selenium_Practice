package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement regButton = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		regButton.click();
		
		//Select
		WebElement dayOptions = driver.findElement(By.id("day"));
		
		Select selectDay = new Select(dayOptions);
		selectDay.selectByValue("30");
		
		Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
		selectMonth.selectByVisibleText("Mar");
		
		WebElement yearOptions = driver.findElement(By.name("birthday_year"));
		Select selectYear = new Select(yearOptions);
		selectYear.selectByVisibleText("1991");
		
		List<WebElement> monthsList = selectMonth.getOptions();
		System.out.println("Number of options in dropdown: "+monthsList.size());
		
		System.out.println("Month options in dropdown using for loop: ");
		for (int i=0; i<monthsList.size();i++) {
			System.out.println(monthsList.get(i).getText());
		}
		System.out.println("Month options in dropdown using for-each loop: ");
		for (WebElement months : monthsList) {
			System.out.println(months.getText());
		}
		

	}

}
