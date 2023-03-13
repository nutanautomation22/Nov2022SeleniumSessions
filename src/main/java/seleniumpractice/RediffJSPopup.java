package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffJSPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//
//		WebElement signinbtn = driver.findElement(By.xpath("//input[@class='signinbtn']"));
//		signinbtn.click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//
//		String text = alert.getText();
//		System.out.println(text);
//		alert.dismiss();
//		
//		WebElement login = driver.findElement(By.cssSelector("input#login1"));
//		login.sendKeys("admin");
//		signinbtn.click();
//		Thread.sleep(3000);
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Nutan\\Pictures\\Screenshots\\Screenshot_20230109_094745.png");
		
		//<tag type="file"> this is a mandatory attribute

	}

}
