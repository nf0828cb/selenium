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
		element3.sendKeys("natsumi.fujimoto@rakus-partners.co.jp");
		WebElement element4 = driver.findElement(By.name("pwd"));
		element4.sendKeys("natsumi.fujimoto@rakus-partners.co.jp");
		
		element4.sendKeys(Keys.ENTER);
		driver.get("https://rakuplus.jp/archives/11203");
		
//		名前（漢字）
		System.out.println("---漢字---");
		List<WebElement> elementsName1 = driver.findElements(By.className("big"));
		for(int i = 0;i < 12;i++) {
			WebElement name = elementsName1.get(i);
			System.out.println(name.getText());
		}
		System.out.println();
//		名前（ひらがな）
		System.out.println("---ひらがな---");
		List<WebElement> elementsName2 = driver.findElements(By.className("has-text-color"));
		for(int i = 0;i < 13;i++) {
			WebElement name2 = elementsName2.get(i);
			System.out.println(name2.getText());
		}
		
//		写真のURL
		
		for(int i = 0;i < 13;i++) {
			driver.get("https://rakuplus.jp/archives/11203#group=nogroup&photo=[i]");
			System.out.println(driver.getCurrentUrl());
	
	}
}
}


