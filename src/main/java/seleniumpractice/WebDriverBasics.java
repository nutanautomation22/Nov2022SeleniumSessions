
package seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		FirefoxDriver driver = new FirefoxDriver();
				
		driver.get("https://www.amazon.com");
		//driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		System.out.println("page title: " + actTitle);
	
		if(actTitle.equals("Amazon.com. Spend less. Smile more.")){
		//if(actTitle.equals("Google")){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//driver.quit();
		
		
	}

}
