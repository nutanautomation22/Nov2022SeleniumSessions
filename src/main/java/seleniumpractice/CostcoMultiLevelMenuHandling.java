package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CostcoMultiLevelMenuHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(3000);
		
		WebElement shopParentEle = driver.findElement(By.cssSelector("a.nav-item"));
		
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		//Thread.sleep(2000);
		
	    WebElement L2Ele = driver.findElement(By.linkText("Baby"));
	    act.moveToElement(L2Ele).build().perform();
	    //Thread.sleep(2000);
	    
	    WebElement L3Ele = driver.findElement(By.linkText("Baby Care & Safety"));
	    act.moveToElement(L3Ele).build().perform();
	    //Thread.sleep(2000);
	    
	    WebElement L4Ele = driver.findElement(By.linkText("Baby Monitors"));
	    L4Ele.click();
	    

	}

}
