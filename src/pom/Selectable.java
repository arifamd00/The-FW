package pom;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;
public class Selectable extends BaseClass{
	//https://jqueryui.com/selectable/
	static By selectableListPath = By.xpath("//ol[@id='selectable']//li");
	static List<WebElement> selectableList = driver.findElements(selectableListPath);
	
	public static void selectItems(String items) {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		By selectableListPath = By.xpath("//ol[@id='selectable']//li");
		List<WebElement> selectableList = driver.findElements(selectableListPath);
		String[] itemsList = items.split(",");
		for(int i=0; i<itemsList.length; i++) {
			//print(itemsList[i]+"size of selectable list: "+ String.valueOf(selectableList.size()));
			for(int j=0; j<selectableList.size(); j++) {
				//print(selectableList.get(j).getText());
				if(itemsList[i].equals(selectableList.get(j).getText())) {
					Actions act = new Actions(driver);
					act.keyDown(Keys.CONTROL).click(selectableList.get(j)).keyUp(Keys.CONTROL).build().perform();
					break;
				}
			}
			
			
		}
	}

}
