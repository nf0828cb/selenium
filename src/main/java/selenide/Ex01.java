package selenide;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Ex01 {
	public static void main(String[] args) {
		Selenide.open("https://www.google.com/");
		
		SelenideElement element = Selenide.$(By.name("q"));
		element.val("selenium").pressEnter();
		ElementsCollection results = Selenide.$$(By.cssSelector("#ires .g"));
		
		results.get(0).shouldHave(Condition.text("Selenide: concise UI tests in Java"));
		Configuration.holdBrowserOpen = true;
		
		private SelenideElement link = $(byClassName("div.Z26q7c.UK95Uc.jGGQ5e > div > a > h3"));
				
				}

}
