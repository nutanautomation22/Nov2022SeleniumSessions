package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(3000);
		
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		twEle.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String windowId = it.next();
		driver.switchTo().window(windowId);
		Thread.sleep(1500);
		System.out.println(driver.getCurrentUrl());
        
        
        if(!windowId.equals(parentWindowId)) {
        	driver.close();
        }
        
        driver.switchTo().window(parentWindowId);
		
//		while(it.hasNext()) {
//			String windowId = it.next();
//			if(!windowId.equals(parentWindowId)) {
//				driver.switchTo().window(windowId);
//				System.out.println(driver.getCurrentUrl());
//				Thread.sleep(1500);
//				driver.close();
//			}
//			
//		}
//		driver.switchTo().window(parentWindowId);
		
	}

}
