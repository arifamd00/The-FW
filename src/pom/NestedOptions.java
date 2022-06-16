package pom;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
public class NestedOptions extends BaseClass{
	//https://jqueryui.com/menu/
	static By framePath = By.xpath("//iframe[@class='demo-frame']");
	static By menuItemsPath = By.xpath("//ul[@id='menu']//li[@class='ui-menu-item']//div[@role='menuitem']");
	static By electronicsMenuPath = By.xpath("//div[text()='Electronics']//following-sibling::ul[@role='menu']//li");
	static By musicMenuPath = By.xpath("//div[@id = 'ui-id-9']//following-sibling::ul//li//div");
	static By rockMenuPath = By.xpath("//div[@id = 'ui-id-10']//following-sibling::ul//li//div");
	static By jazzMenuPath = By.xpath("//div[text()='Music']//following-sibling::ul[@role='menu']//li//div[text()='Jazz']//following-sibling::ul//li");
	
	public static void selectFromMenu(String ele) {
		print("selectFromMenu invoked");
		driver.switchTo().frame(driver.findElement(framePath));
		List<WebElement> menu = driver.findElements(menuItemsPath).stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
		for(WebElement l:menu) {
			print(l.getText());
			if(ele.equals(l.getText())) {
				//print(l.getText());
				l.click();
			}
		}
		
		//driver.switchTo().parentFrame();
		
	}
	
	public static void selectFromElectronicsMenu(String ele) {
		driver.switchTo().frame(driver.findElement(framePath));
		print("selectFromElectronics invoked");
		List<WebElement> electronics = driver.findElements(musicMenuPath).stream().filter(lis->lis.isDisplayed()).collect(Collectors.toList());
		//WebElement::isDisplayed also can be used in filter as a args
		for(WebElement l:electronics) {
			if(ele.equals(l.getText())) {
				l.click();
			}
		}
		driver.switchTo().parentFrame();
		
	}
	
	public static void selectFromMusicMenu(String ele2) {
		print("Selectfrom music menu invoked");
		//driver.switchTo().frame(driver.findElement(framePath));
		List<WebElement> music = driver.findElements(menuItemsPath).stream().filter(lis->lis.isDisplayed()).collect(Collectors.toList());
		//WebElement::isDisplayed also can be used in filter as a args
		print("Music Menu: "+String.valueOf(music.size()));
		for(WebElement l:music) {
			print(l.getText());
			
			if(l.getText().equals(ele2)) {
				print(l.getText());
				l.click();
				
				
			}
			
		}
		//driver.switchTo().parentFrame();
		
	}
	public static void selectFromRockMenu(String ele) {
		//driver.switchTo().frame(driver.findElement(framePath));
		List<WebElement> rock = driver.findElements(menuItemsPath).stream().filter(lis->lis.isDisplayed()).collect(Collectors.toList());
		//print("Rock Menu: "+String.valueOf(list.size()));
		//WebElement::isDisplayed also can be used in filter as a args
		System.out.println("Rock Menu");
		for(WebElement l:rock) {
			print(l.getText());
			if(l.getText().equals(ele)) {
				print(l.getText());
				l.click();
			}
		}
		//driver.switchTo().parentFrame();
		
	}
	
	public static void selectFromJazzMenu(String ele) {
		driver.switchTo().frame(driver.findElement(framePath));
		List<WebElement> list = driver.findElements(menuItemsPath).stream().filter(lis->lis.isDisplayed()).collect(Collectors.toList());
		//WebElement::isDisplayed also can be used in filter as a args
		for(WebElement l:list) {
			if(ele.equals(l.getText())) {
				print(l.getText());
				l.click();
			}
		}
		driver.switchTo().parentFrame();
		
	}

}
