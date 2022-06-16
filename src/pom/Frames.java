package pom;

import org.openqa.selenium.By;

import base.BaseClass;

public class Frames extends BaseClass{
	
	static By singleFrameBtn = By.xpath("//ul[@class='nav nav-tabs ']//a[contains(text(),'Single Iframe')]");
	static By nestedFrameBtn = By.xpath("//ul[@class='nav nav-tabs ']//a[contains(text(),'Iframe with in an Iframe')]");
	
	
	public static void switchToSingleFrame() {
		driver.findElement(singleFrameBtn).click();
		driver.switchTo().frame("SingleFrame");	
	}
	
	public static void enterTextInSingleFrame(String str) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(str);
	}
	
	public static void switchToMultipleFrame() {
		driver.findElement(nestedFrameBtn).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
	}
	
	public static void enterTextInMultipleFrame(String str) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(str);
	}
	
	public static void moveToParentFrame() {
		driver.switchTo().parentFrame();
	}
			

}
