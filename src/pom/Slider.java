package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class Slider extends BaseClass{
	
	//http://the-internet.herokuapp.com/horizontal_slider
	private WebDriver driver;
	
	public Slider(WebDriver driver) {
		this.driver = driver;
	}
	private By setRangePath = By.cssSelector("input[type='range']");
	private By currentRangePath = By.id("range");
	
	
	public void setRange(String number) {
		while(!(getCurrentRange().equals(number))) {
			driver.findElement(setRangePath).sendKeys(Keys.ARROW_RIGHT);
		}
	}
	
	public String getCurrentRange() {
		return driver.findElement(currentRangePath).getText();
	}

}
