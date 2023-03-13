package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =  new ChromeDriver();
		//driver.get("https://www.aqi.in/dashboard/canada");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Thread.sleep(2000);
		
//		WebElement base = driver.findElement(By.linkText("London, Canada"));
//		
//		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(base)).getText();
//		
//		System.out.println(rightIndex);
//		
		
		WebElement base = driver.findElement(By.id("input-email"));
				
		String nearEle = driver.findElement(with(By.tagName("h2")).near(base)).getText();

		System.out.println(nearEle);
	}

}
