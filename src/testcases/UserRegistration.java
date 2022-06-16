package testcases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.HomePage;

public class UserRegistration extends BaseClass {
	
	@BeforeSuite
	public void start() {
		initializeProp();
		launchApp();
	}
	/*
	@Test
	public void registrationTest() throws IOException {
		
		HomePage.enterFirstName("Arif");
		HomePage.enterLastName("Ahmed");
		HomePage.enterAddress("La La Land");
		HomePage.enterEmail("123@test.com");
		HomePage.selectMale();
		HomePage.checkMovies();
		HomePage.enterPhone("9012628422");
		HomePage.selectSkill("Java");
		takeSnapshot("userRegistration");
		HomePage.selectCountry("Australia");
		HomePage.selectDOB("1998", "July", "15");
		HomePage.enterPassword("test@123");
		HomePage.confirmPassword("test@123");
		HomePage.pressSubmit();
		HomePage.uploadPhoto(BaseClass.readProperty("photo"));
		takeSnapshot("userRegistration");
		
	}
	*/
	@AfterSuite
	public void close() {
		closeApp();
	}
	

}
