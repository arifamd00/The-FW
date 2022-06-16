package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import base.BaseClass;

public class Alerts extends BaseClass{
	public static By alertsOption = By.xpath("//div[@class='tabpane pullleft']/ul");
	public static By alertOkBtn = By.xpath("//div[@id='OKTab']/button");
	public static By alertWithOK = By.xpath("//li//a[text()='Alert with OK ']");
	public static By confirmationAlert = By.xpath("//li//a[text()='Alert with OK & Cancel ']");
	public static By confirmationBtn = By.xpath("//div[@id='CancelTab']/button");
	public static By alertWithText = By.xpath("//li//a[text()='Alert with Textbox ']");
	public static By alertTextBtn = By.xpath("//div[@id='Textbox']/button");
	//below funtion to get the list of alerts
	public static void alert() {
		List<WebElement> a = driver.findElements(alertsOption);
		for(WebElement ele: a) {
			print(ele.getText());
		}
	}

}
