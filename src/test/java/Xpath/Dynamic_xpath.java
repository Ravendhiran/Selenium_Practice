package Xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts");
		driver.manage().window().maximize();
		
		//XPATH (commented to try with dynamic XPATH)
		//List<WebElement> disprice = driver.findElements(By.xpath("//span[@class=\"product-discountedPrice\"]"));
		
		//Dynamic XPATH
		List<WebElement> disprice = driver.findElements(By.xpath("//span[@class=\"product-strike\"]//preceding-sibling::span"));
		List<Integer> price_list=new ArrayList<Integer>();
		
		for(WebElement price:disprice) {
			String text = price.getText().replace("Rs. ", "");
			int priceValues = Integer.parseInt(text);
			price_list.add(priceValues);
		}

		System.out.println(price_list);
		
		int size=price_list.size();
		
		System.out.println("Size: "+size);
		
		Integer max = Collections.max(price_list);
		System.out.println("Max price: "+max);
		
		System.out.println("Min Price: "+Collections.min(price_list));
		
		driver.close();
	}

}
