package testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
/*
//import base.BaseClass;
import pom.HomePage;
public class infosysStatus {
	public static void main(String args[]) throws InterruptedException, IOException {
		initializeProp();
		launchApp();
		click("signin");
		driver.findElement(By.xpath(readProperty("username"))).sendKeys("mohaarif0123@gmail.com");
		driver.findElement(By.xpath(readProperty("password"))).sendKeys("arifAMD@001");
		click("loginBtn");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(readProperty("status"))));
		WebElement currentStatus = driver.findElement(By.xpath(readProperty("currentStatus"))); 
		takeSnapshot("status");
		String message = "Review in progress";
		String actualMessage = currentStatus.getText();
		//System.out.println("actual message: "+actualMessage+",");
		if(message.equals(actualMessage)) {
			Assert.assertFalse(true);
			closeApp();
		}else {
			System.out.print("Hey there! Status has changed, Current status is: "+actualMessage );
			//closeApp();
		}
		//closeApp();
	}
	

}

ApplicationURL2=https://career.infosys.com/
signin=//*[@id="headerComponentContainer"]/div/div/div[2]/header[1]/nav/div[1]/div[2]/ul/li[1]/a
username=//input[@name='username']
password=//input[@id='password']
loginBtn=//button[@id='btnSubmit']
status=/html/body/app-root/div[2]/div/app-jobs/div/div[1]/div[2]/app-poststatus/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/div/div[1]/div/div
currentStatus=/html/body/app-root/div[2]/div/app-jobs/div/div[1]/div[2]/app-poststatus/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/div/div[1]/div/div
*/