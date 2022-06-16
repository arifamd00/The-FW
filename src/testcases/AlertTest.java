package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseClass;
import pom.HomePage;
import pom.Alerts;
public class AlertTest extends BaseClass{
	
	@Test
	public void verifyAlertWithOK() {
		click(Alerts.alertWithOK);
		click(Alerts.alertOkBtn);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(wait.until(ExpectedConditions.alertIsPresent()) == null)
		{
			print("Alert is not present");
		}else {
			driver.switchTo().alert().accept();
		}
		
	
	}
	
	@Test
	public void verifyAlertWithOKAndCancel() {
		click(Alerts.confirmationAlert);
		click(Alerts.confirmationBtn);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(wait.until(ExpectedConditions.alertIsPresent()) == null)
		{
			print("Alert is not present");
		}else {
			driver.switchTo().alert().dismiss();
		}
		
	
	}
	
	@Test
	public void verifyTextBoxAlert() {
		click(Alerts.alertWithText);
		click(Alerts.alertTextBtn);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(wait.until(ExpectedConditions.alertIsPresent()) == null)
		{
			print("Alert is not present");
		}else {
			driver.switchTo().alert().sendKeys("My Name is Aarif");
			driver.switchTo().alert().accept();
		}
	}

}
