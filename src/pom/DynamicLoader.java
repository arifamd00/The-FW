package pom;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class DynamicLoader extends BaseClass{
	//http://the-internet.herokuapp.com/dynamic_loading/2
	private WebDriver driver;
	public DynamicLoader(WebDriver driver) {
		this.driver = driver;
	}
	
	private By startBtnPath = By.cssSelector("div#start >button");
	private By loaderPath = By.cssSelector("div#loading");
	private By resultPath = By.cssSelector("div#finish > h4");
	
	public void clickOnStart() {
		driver.findElement(startBtnPath).click();
		
	}
	
	public boolean isLoaderDisplayed() {
		//boolean g = false;
		
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		boolean h;
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(loaderPath)).getText();
		h = wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderPath));
		print(text);
		return (! h);
		
	
	
	}
	
	public String getResult() {
		String res;
		if(isLoaderDisplayed() == false) {
			res =  driver.findElement(resultPath).getText();
		}else {
			res = "text did not captured";
		}
		return res;
	}
	
	public String getResult2() {
		// Another approach to do this apply expected condition in text hello world to be visible
		
		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(1000)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(resultPath));
		
		String res = driver.findElement(resultPath).getText();
		return res;
	
	}

}
