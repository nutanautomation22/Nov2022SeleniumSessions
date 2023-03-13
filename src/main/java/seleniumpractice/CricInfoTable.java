package seleniumpractice;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-women-s-under-19-t20-world-cup-2022-23-1336137/india-women-under-19s-vs-england-women-under-19s-final-1336195/full-scorecard");
		
		String wicketTakerName = getWicketTakerName("Liberty Heap");
		System.out.println("Wicket taker Name is:" + wicketTakerName);
		
		List<String> scoreList   = getScoreCardList("Grace Scrivens");
		System.out.println(scoreList);

	}
	
	public static String getWicketTakerName(String batsmanName) {
		
		return driver.findElement(By.xpath("//a[@title='"+batsmanName+"']/ancestor::td/following-sibling::td")).getText();
	}
	
	public static List<String> getScoreCardList(String batsmanName) {
		List<String> playerScoreList = new ArrayList<String>();
		List<WebElement> scoreCardList = driver.findElements(By.xpath("//a[@title='"+batsmanName+"']/ancestor::td/following-sibling::td"));
		for (WebElement e: scoreCardList) {
			playerScoreList.add(e.getText());
		}
	return playerScoreList;
	}

}
