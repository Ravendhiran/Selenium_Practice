package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebElement success = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
		
		if(success.getText().equals("Congratulations! You must have the proper credentials.")) {
			System.out.println("Successful");
		}

	}

}
