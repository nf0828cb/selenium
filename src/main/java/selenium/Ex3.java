package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.e-procurement.metro.tokyo.lg.jp/index.jsp");
		WebElement ok = driver.findElement(By.tagName("button"));
		ok.sendKeys(Keys.ENTER);

		WebElement select = driver.findElement(By.id("menu_1"));
		select.click();

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String window1 = it.next();
		String window2 = it.next();

		driver.switchTo().window(window2);

		WebElement select2 = driver.findElement(By.id("topMenuBtn03"));
		select2.click();

		WebElement year1 = driver.findElement(By.name("StartDateYY"));
		year1.sendKeys("4");
		WebElement month1 = driver.findElement(By.name("StartDateMM"));
		month1.sendKeys("11");
		WebElement day1 = driver.findElement(By.name("StartDateDD"));
		day1.sendKeys("15");

		WebElement year2 = driver.findElement(By.name("EndDateYY"));
		year2.sendKeys("4");
		WebElement month2 = driver.findElement(By.name("EndDateMM"));
		month2.sendKeys("12");
		WebElement day2 = driver.findElement(By.name("EndDateDD"));
		day2.sendKeys("15");

		WebElement button = driver.findElement(By.cssSelector("table:nth-child(2) > tbody > tr > td > a"));
		button.click();
		
		WebElement tableElement = driver.findElement(By.cssSelector("table.list-data"));
		List<WebElement> trElements = tableElement.findElements(By.tagName("tr"));
		for (WebElement trelement : trElements) {
				List<WebElement> tdElements = trelement.findElements(By.tagName("td"));
				int count = 0;
				for (WebElement tdelement : tdElements) {
					if(count < 3) {
					System.out.print(tdelement.getText() + "\t");
				}
				count++;
			}
				System.out.println();
//		List<WebElement> hacchuList = driver.findElements(By.cssSelector("div.align-center > tr"));
//		int count = 0;
//		for (WebElement hacchu : hacchuList) {
//			if (count > 0) {
//				List<WebElement> tdList = hacchu.findElements(By.cssSelector("table.list-data > td"));
//				for (WebElement data : tdList) {
//					if (count > 0) {
//						WebElement day = data.findElement(By.className("light-green"));
//						System.out.println(day.getTagName());
//					}
//					count++;
//				}
//				count++;
//			}
//		}
	}
	}
}
