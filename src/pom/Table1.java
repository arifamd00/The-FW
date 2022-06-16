package pom;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;


public class Table1 extends BaseClass{
	
	//http://the-internet.herokuapp.com/tables#delete
	private WebDriver driver;
	
	public Table1(WebDriver driver) {
		this.driver = driver;
	}
	
	private By tablePath = By.id("table1");
	private By tableHeadPath = By.cssSelector("table#table1 > thead > tr >th");
	private By tableDataPath = By.cssSelector("table#table1 > tbody > tr");
	
	public List<String> getHeader() {
		List<String> thead = driver.findElements(tableHeadPath).stream().filter(WebElement::isDisplayed).map(e->e.getText()).collect(Collectors.toList());
		return thead;
	}
	
	public Record getRecord(int index){
		WebElement record = driver.findElements(tableDataPath).stream().filter(WebElement::isDisplayed).collect(Collectors.toList()).get(index);
		return new Record(record);
	}
	
	public class Record {
		private WebElement record;
		public Record(WebElement record) {
			this.record =record;
		}
		
		public List<String> getData(){
			List<String> data = record.findElements(By.tagName("td")).stream().map(e->e.getText()).collect(Collectors.toList());
			return data;
			
		}
		
		public void editRecord() {
			record.findElement(By.xpath("//table[@id='table1']/tbody/tr/td/a[text()='edit']")).click();
		}
		
		public void deleteRecord() {
			record.findElement(By.xpath("//table[@id='table1']/tbody/tr/td/a[text()='delete']")).click();
		}
	}
	

}
