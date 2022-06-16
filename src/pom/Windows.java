package pom;

import org.openqa.selenium.By;

import base.BaseClass;

public class Windows extends BaseClass {
	static By tabbedWindow = By.xpath("//li//a[@href='#Tabbed']");
	static By tabbedWindowBtn = By.xpath("//div[@id = 'Tabbed']//button");
	static By seperateWindow = By.xpath("//li//a[@href='#Seperate']");
	static By seperateWindowBtn = By.xpath("//div[@id = 'Seperate']//button");
	static By multipleWindow = By.xpath("//li//a[@href='#Multiple']");
	static By multipleWindowBtn = By.xpath("//div[@id = 'Multiple']//button");
	
	public static void clickOntabbedWindow() {
		driver.findElement(tabbedWindow).click();
	}
	public static void clickOnSeperateWindow() {
		driver.findElement(seperateWindow).click();
	}
	public static void clickOnMultipleWindow() {
		driver.findElement(multipleWindow).click();
	}
	public static void openTabbedWindow() {
		driver.findElement(tabbedWindowBtn).click();
	}
	public static void openSeperateWindow() {
		driver.findElement(seperateWindowBtn).click();
	}
	public static void openMultipleWindow() {
		driver.findElement(multipleWindowBtn).click();
	}
	
	

}
