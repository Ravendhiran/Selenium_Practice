package Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement chooseButton = driver.findElement(By.xpath("//span[contains(@class, 'ui-fileupload-simple ui-widget')]"));
		chooseButton.click();
		
		String file = "C:\\Users\\raven\\OneDrive\\Desktop\\Priya_Resume.docx";
		Thread.sleep(2000);
		StringSelection selection = new StringSelection(file);
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
