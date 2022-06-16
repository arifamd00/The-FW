package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class DragAndDrop extends BaseClass{
	/*WebElement frame1  = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	{
		driver.switchTo().frame(frame1);
		//can be inside th block
	}
	By sourceEle = By.xpath("//div[@id='draggable']");
	By destinationEle = By.xpath("//div[@id='droppable']");
	WebElement source = driver.findElement(sourceEle);
	WebElement destination = driver.findElement(destinationEle);*/
	By angular = By.xpath("//img[@src='logo.png']//parent::div");
	By mongo = By.xpath("//div[@id='dragarea']//img[@id = 'mongo']");
	By node = By.xpath("//div[@id='dragarea']//img[@id = 'node']");
	By dropArea = By.xpath("//div[@id = 'droparea']");
	WebElement source = driver.findElement(angular);
	WebElement destination = driver.findElement(dropArea);
	public void dragDrop() {
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, destination).perform();
		//Building a drag and drop action
		/*Action dragAndDrop = builder.clickAndHold(source).pause(100)
		.moveToElement(destination).pause(100)
		.release(destination).pause(100)
		.build();
		
		dragAndDrop.perform();*/
		//print("from Text: "+from.getText()+", from TagName: "+from.getTagName()+", from css: "+from.getCssValue("id"));
		//builder.dragAndDrop(source, destination).build().perform();
		String textTo = driver.findElement(dropArea).getText();
		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: File is dropped to target as expected");
		}else {
			System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
	}

}
