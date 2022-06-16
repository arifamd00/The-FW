package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import pom.HomePage;
public class TestScript1 extends BaseClass{
	public static void main(String args[]) {
		initializeProp();
		launchApp();
		HomePage.enterFirstName("Arif");
		HomePage.enterLastName("Ahmed");
		HomePage.enterAddress("La La Land");
		HomePage.enterEmail("123@test.com");
		HomePage.selectMale();
		HomePage.checkMovies();
		HomePage.enterPhone("9012628422");
		HomePage.selectSkill("Java");
		HomePage.selectCountry("Australia");
		HomePage.selectDOB("1998", "July", "15");
		HomePage.enterPassword("test@123");
		HomePage.confirmPassword("test@123");
		HomePage.pressSubmit();
		HomePage.uploadPhoto(BaseClass.readProperty("photo"));
		
		closeApp();
	}

}


