package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//Single frame
		driver.switchTo().frame("singleframe");  // used ID attribute
		WebElement singleFrame = driver.findElement(By.xpath("(//input[@type='text'])"));
		singleFrame.sendKeys("Single Frame Testing");
		driver.switchTo().defaultContent();
		
		// nested frames
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html' and contains(@style,'height: 250px')]"));
		driver.switchTo().frame(innerFrame);
		WebElement innerFrameInput = driver.findElement(By.xpath("(//input[@type='text'])")); //inside the frame listed only one element
		innerFrameInput.sendKeys("Nested Frame Testing");
		
		
		
	}

}
