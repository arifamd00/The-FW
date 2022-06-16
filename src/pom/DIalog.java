package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
public class DIalog extends BaseClass{
	//https://jqueryui.com/dialog/#animated
	
	static By modelText = By.xpath("//div//span[@id='ui-id-1']");
	static By framePath = By.xpath("//iframe[@class='demo-frame']");
	static By openBtnPath = By.xpath("//button[@id='opener']");
	static By dialogTextPath = By.xpath("//div[@id='dialog']//p");
	public static void getDialogText() {
		driver.switchTo().frame(driver.findElement(framePath));
		driver.findElement(openBtnPath).click();
		List<WebElement> dialog = driver.findElements(dialogTextPath);
		if(!dialog.isEmpty()) {
			String text = dialog.get(0).getText();
			print(text);
			// If dialog appear perform the action here
		}
	}

}
