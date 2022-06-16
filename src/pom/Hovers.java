package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.BaseClass;

//http://the-internet.herokuapp.com/hovers

public class Hovers extends BaseClass {
	
	private WebDriver driver;
	
	private By figurePath = By.cssSelector("div.figure");
	private By figCaptionPath = By.cssSelector("div.figcaption"); 
	
	public Hovers(WebDriver driver) {
		this.driver = driver;
	}
	
	public FigDetails hoverOverFig(int index) {
		Actions  act = new Actions(driver);
		WebElement fig = driver.findElements(figurePath).get(index);
		act.moveToElement(fig).perform();
		return (new FigDetails(fig.findElement(figCaptionPath))); 
	}
	
	public class FigDetails{
		private WebElement caption;
		private By namePath = By.tagName("h5");
		private By linkPath = By.tagName("a");
		
		
		public FigDetails(WebElement caption) {
			this.caption = caption;
		}
		
		public String getName() {
			return caption.findElement(namePath).getText();
		}
		
		public String getLink() {
			return caption.findElement(linkPath).getAttribute("href");
		}
		
		public boolean isCaptionDisplayed() {
			return caption.isDisplayed();
		}
		
	}
	
	
	

}
