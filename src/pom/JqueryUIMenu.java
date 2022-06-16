package pom;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;


public class JqueryUIMenu extends BaseClass{
	
	private WebDriver driver;
	
	public JqueryUIMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	private By menuPath = By.id("menu");
	private By MenuItems = By.xpath("//li[@class='ui-menu-item'][following::a]");
	
	
	
	public void getList() {
		WebElement menu = driver.findElement(menuPath);
		List<WebElement> list = menu.findElements(MenuItems).stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
		
		list.forEach(l->print(l.getText()));
	}
	
	public EnabledMenu selectfromMenu(String text) {
		WebElement menu = driver.findElement(menuPath);
		List<WebElement> list = menu.findElements(MenuItems).stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
		list.forEach(l->print(l.getText()));
		Actions act = new Actions(driver);
		for(WebElement ele: list) {
			if (ele.getText().equals(text)) {
				act.moveToElement(ele).perform();
				break;
			}
		}
		WebElement enabledMenu = driver.findElement(By.xpath("(//li[@class='ui-menu-item'][a[text()='Enabled']]//ul)[1]"));
		return (new EnabledMenu(enabledMenu));
	}
	
	public class EnabledMenu{
		private WebElement enabledMenu;
		private By enabledItems = By.xpath("//li[@class='ui-menu-item']//a[text()='Enabled']//following-sibling::ul//li");
		public EnabledMenu(WebElement element) {
			this.enabledMenu = element;
		}
		
		public DownloadMenu selectFromEnabled(String text) {
			List<WebElement> list = enabledMenu.findElements(MenuItems).stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
			Actions act = new Actions(driver);
			list.forEach(l->print(l.getText()));
			for(WebElement ele: list) {
				if (ele.getText().equals(text)) {
					act.moveToElement(ele).perform();
					break;
				}
			}
			
			WebElement downloadMenu = driver.findElement(By.xpath("(//li[@class='ui-menu-item'][a[text()='Enabled']]//ul)[2]"));
			return (new DownloadMenu(downloadMenu));
		}
		
		
		public class DownloadMenu{
			private WebElement downloadMenu;
			private By downloadItems = By.xpath("//li[@class='ui-menu-item']//a[text()='Downloads']//following-sibling::ul//li");
			public DownloadMenu(WebElement element) {
				this.downloadMenu = element;
			}
			
			public void selectFromDownload(String text) {
				List<WebElement> list = downloadMenu.findElements(MenuItems).stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
				Actions act = new Actions(driver);
				list.forEach(l->print(l.getText()));
				for(WebElement ele: list) {
					if (ele.getText().equals(text)) {
						
						act.moveToElement(ele).perform();
						break;
					}
				}
			} 
		}
	}
	

}
