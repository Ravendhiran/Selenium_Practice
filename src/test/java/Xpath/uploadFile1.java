package Xpath;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		driver.get("https://www.leafground.com/file.xhtml");
		
		File uploadFile = new File("C:\\Users\\raven\\OneDrive\\Desktop\\Priya_Resume.docx");
		
		WebElement chooseButton = driver.findElement(By.xpath("//span[contains(@class, 'ui-fileupload-simple ui-widget')]"));
		chooseButton.sendKeys(uploadFile.getAbsolutePath());
		*/
		
		driver.get("https://the-internet.herokuapp.com/upload");
	    File uploadFile = new File("C:\\Users\\raven\\OneDrive\\Desktop\\Priya_Resume.docx");

	    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
	    fileInput.sendKeys(uploadFile.getAbsolutePath());
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("file-submit")).click();

	    

	}

}
