package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class HomePage extends BaseClass{
	static By firstName = By.xpath("//input[@placeholder='First Name']");
	static By lastName = By.xpath("//input[@placeholder='Last Name']");
	static By address = By.xpath("//textarea[@ng-model='Adress']");
	static By email = By.xpath("//input[@ng-model='EmailAdress']");
	static By phone = By.xpath("//input[@type='tel']");
	static By genderIsMale = By.xpath("//input[@value='Male']");
	static By genderIsFemale = By.xpath("//input[@value='FeMale']");
	static By cricket = By.xpath("//input[@value='Cricket']");
	static By movies = By.xpath("//input[@value='Movies']");
	static By hockey = By.xpath("//input[@value='Hockey']");
	static Select skill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
	//static Select skill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
	static By openCountry = By.xpath("//span[@role='combobox']");
	static By searchCountry = By.xpath("//input[@class='select2-search__field']");
	static By countryList = By.xpath("//ul[@id='select2-country-results']");
	static Select year = new Select(driver.findElement(By.id("yearbox")));
	static Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
	static Select day = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
	static By password = By.xpath("//input[@id='firstpassword']");
	//By.xpath("//input[@id='firstpassword']");
	static By confirmPassword = By.xpath("//input[@id='secondpassword']");
	static By submitBtn = By.id("submitbtn");
	static By chooseFile = By.id("imagesrc");
	static WebElement navbar = driver.findElement(By.cssSelector("ul.nav.navbar-nav"));
	static By switchEle = By.linkText("SwitchTo");
	static By menuList = By.cssSelector("a[aria-expanded='true'] ~ul");
	public static By switchTo = By.xpath("//li//a[text()='SwitchTo']");
	public static By Alerts = By.xpath("//li//a[text()='SwitchTo']//parent::li//ul[@class='dropdown-menu']//a[@href='Alerts.html']");
	
	public static void verifyNav() {
		
		List<WebElement> a = navbar.findElements(By.tagName("a"));
		System.out.print(a.size());
		navbar = driver.findElement(By.cssSelector("ul.nav.navbar-nav"));
		a = navbar.findElements(By.tagName("a"));
		for(WebElement ele:a) {
		System.out.println(ele.getText());
				
		}
	}
			//System.out.println(a.get(i).getText());
			
			//a.get(i).click();
			/*
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			if(frames.isEmpty()) {
				continue;
			}else {
				driver.navigate().refresh();
			}
			*?
			/*try {
				WebElement ad = driver.findElement(By.cssSelector("div[aira-label='Close ad']"));
				if (ad.isDisplayed()) {
					ad.click();
				}
			}catch(NoSuchElementException ne) {
				System.out.println("no Such Element: "+ne.getMessage());
			}*/
		//}
		/*
		driver.findElement(switchEle).click();
		driver.findElement(By.cssSelector("a[href ^= 'Alert']")).click();
		*/
		/*List<WebElement> c=  driver.findElements(By.cssSelector("li.dropdown.open"));
		for(WebElement ele:c) {
			ele.click();
			System.out.println(ele.getText());
		}
		*/
		
		
	//}
	
	public static void enterFirstName(String value) {
		driver.findElement(firstName).sendKeys(value);
	}
	
	public static void enterLastName(String value) {
		driver.findElement(lastName).sendKeys(value);
	}
	
	public static void enterAddress(String value) {
		driver.findElement(address).sendKeys(value);
	}
	
	public static void enterEmail(String value) {
		driver.findElement(email).sendKeys(value);
	}
	
	public static void enterPhone(String value) {
		driver.findElement(phone).sendKeys(value);
	}
	
	public static void selectMale() {
		driver.findElement(genderIsMale).click();
	}
	
	public static void selectFemale() {
		driver.findElement(genderIsFemale).click();
	}
	
	public static void checkCricket() {
		driver.findElement(cricket).click();
	}
	
	public static void checkMovies() {
		driver.findElement(movies).click();
	}
	
	public static void checkHockey() {
		driver.findElement(hockey).click();
	}
	
	public static void selectSkill(String value) {
		skill.selectByVisibleText(value);
	}
	
	public static void selectCountry(String value) {
		driver.findElement(openCountry).click();
		driver.findElement(searchCountry).sendKeys(value);
		List<WebElement> options = driver.findElements(countryList);
		for(WebElement ele:options) {
			if(ele.getText().contains(value)) {
				ele.click();
				break;
			}
		}
	}
	
	public static void selectDOB(String yyyy, String mm, String dd) {
		year.selectByVisibleText(yyyy);
		month.selectByVisibleText(mm);
		day.selectByVisibleText(dd);
	}
	
	public static void enterPassword(String value) {
		driver.findElement(password).sendKeys(value);
	}
	
	public static void confirmPassword(String value) {
		driver.findElement(confirmPassword).sendKeys(value);
	}
	
	public static void pressSubmit() {
		driver.findElement(submitBtn).click();
	}
	
	public static void uploadPhoto(String value) {
		driver.findElement(chooseFile).sendKeys(value);
	}

}
