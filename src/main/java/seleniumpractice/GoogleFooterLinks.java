package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[contains(@class,'KxwPGc')]/a"));
		//List<WebElement> footerLinks = driver.findElements(By.className("pHiOh"));
		
		
		for (WebElement e: footerLinks) {
			System.out.println(e.getText());
		}
		
		
		
		

	}

}
