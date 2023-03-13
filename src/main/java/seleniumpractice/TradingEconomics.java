package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TradingEconomics {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tradingeconomics.com/united-states/stock-market");
		List<WebElement> commoditiesList = driver.findElements(By.xpath("(//table[@class='table table-condensed'])[3]//tr//a"));
		
		for (WebElement e: commoditiesList) {
			System.out.println(e.getText());
		}
		
		

	}

}
