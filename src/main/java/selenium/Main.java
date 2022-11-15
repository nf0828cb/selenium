package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.jp/");

//		演習１
//		WebElement element = driver.findElement(By.cssSelector("div.a4bIc > input"));
//		element.sendKeys("selenium");
//		element.sendKeys(Keys.ENTER);
//		WebElement element2 = driver.findElement(By.className("TbwUpd"));
//		driver.get("https://www.selenium.dev/ja/documentation/");
//		System.out.println(driver.getTitle());
		
//		演習２
		driver.get("https://rakuplus.jp/");
		WebElement element3 = driver.findElement(By.name("log"));
		element3.sendKeys("");
		WebElement element4 = driver.findElement(By.name("pwd"));
		element4.sendKeys("");
		
		element4.sendKeys(Keys.ENTER);
		
		driver.get("https://rakuplus.jp/archives/11203");
		
////		名前（漢字）
//		System.out.println("---漢字---");
//		List<WebElement> elementsName1 = driver.findElements(By.className("big"));
//		for(int i = 0;i < 12;i++) {
//			WebElement name = elementsName1.get(i);
//			System.out.println(name.getText());
//		}
//		System.out.println();
//		名前（ひらがな）
//		System.out.println("---ひらがな---");
//		List<WebElement> elementsName2 = driver.findElements(By.cssSelector("p.has-text-align-center.has-text-color"));
//		for(int i = 0;i < 13;i++) {
//			WebElement name2 = elementsName2.get(i);
//			System.out.println(name2.getText());
//		}
//		
//		写真のURL
//		List<WebElement> photoUrl = driver.findElements(By.className("wp-block-image"));
//		for(int i = 0;i < 13;i++) {
//			WebElement photourl = photoUrl.get(i);
//			System.out.println(photourl.);
//	}
		
		List<WebElement> divElemList = driver.findElements(By.cssSelector("section.entry-content > div"));
		int count = 0;
		for(WebElement elem : divElemList) {
			
			if(count > 0) {
			
			WebElement kName = elem.findElement(By.className("big"));
			System.out.println(kName.getText());
			
			WebElement hName = elem.findElement(By.className("has-text-color"));
			System.out.println(hName.getText());
			
			WebElement imgElem = elem.findElement(By.tagName("img"));
			String url = imgElem.getAttribute("src");
			System.out.println(url);
		}
			count ++;
		}
		}
}



