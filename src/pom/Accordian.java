package pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class Accordian extends BaseClass{
	static By acc = By.xpath("//div[@class='panel-group']");
	static WebElement accList = driver.findElement(acc);
	static int start =0;
	static List<WebElement> content = driver.findElements(By.cssSelector("div[id^='colla']"));
	public static void getAccordianList() {
		List<WebElement> ele = accList.findElements(By.tagName("a"));
		int limit = ele.size();

		for(int i=0; i<limit; i++) {
			if (start==0) {
				String heading = ele.get(i).getText();
				String body = content.get(i).getText();
				
				print("Heading: "+heading+"\n"+"Body: "+ body);
				//el.click();
				
				start +=1;
				
			}else {
				ele.get(i).click();
				String heading = ele.get(i).getText();
				String body = content.get(i).getText();
				print("Heading: "+heading+"\n"+"Body: "+ body);
				
			}
		}
		
	}
	

}
