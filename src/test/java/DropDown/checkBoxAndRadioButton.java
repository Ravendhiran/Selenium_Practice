package DropDown;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxAndRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Radiobutton
		WebElement male = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		male.click();
		
		//CheckBoxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		//Select all the checkboxes
		for(int i=0;i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
		
		//Unselect all the checkboxes
		for (WebElement chkbox : checkBoxes) {
			chkbox.click();
		}
		
		//Select specific checkboxes index 1,3 & 5
		for(int i=0;i<checkBoxes.size();i++) {
			if(i==1||i==3||i==5) {
			checkBoxes.get(i).click();
		}
		}
		
		//checking other checkboxes
		for(int i=0;i<checkBoxes.size();i++) {
			if(!checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
			}
		}
	}

}
