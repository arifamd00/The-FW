package pom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class DatePicker extends BaseClass{
	private By calendarBtn = By.xpath("//img[@class='imgdp']");
	private By nextBtn = By.xpath("//a[@title='Next']");
	private By prevBtn = By.xpath("//a[@title='Prev']");
	private By cMonth  = By.xpath("//span[@class='ui-datepicker-month']");
	private By cYear  = By.xpath("//span[@class='ui-datepicker-year']");
	private String[] Months = {"January", "Fenruary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	private ArrayList<String> monthsList = new ArrayList<>();
	private int[] monthOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private ArrayList<Integer> monthOrderList = new ArrayList<>();
	{
		
		for (String m: Months) {
			monthsList.add(m);
		}
		for (int i: monthOrder) {
			monthOrderList.add(i);
		}
	}
	


	public void selectDate(String ddmmyyyy){
		print("DatePicker method invoked");
		String eDay = ddmmyyyy.split("-")[0];
		String eMonth = ddmmyyyy.split("-")[1];
		String eYear = ddmmyyyy.split("-")[2];
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(calendarBtn)).click();
		String month = driver.findElement(cMonth).getText();
		String year = driver.findElement(cYear).getText();
		while(true) {
			if(Integer.valueOf(eYear).equals(Integer.valueOf(year))) {
				if(monthsList.indexOf(eMonth) == monthsList.indexOf(month.trim())){
					print("eMonth: "+eMonth+", cmonth: "+month+"is Equal: "+"monthsList.indexOf(eMonth): "+String.valueOf((monthsList.indexOf(eMonth))+ "monthsList.indexOf(month.trim()): "+ String.valueOf(monthsList.indexOf(month.trim()))));
					WebElement calendarDays = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody"));
					List<WebElement> calendarDaysList = calendarDays.findElements(By.tagName("a"));
					for(WebElement day: calendarDaysList) {
						calendarDaysList = calendarDays.findElements(By.tagName("a"));
						if(day.getText().equals(eDay)) {
							day.click();
							break;
						}
					}
					break;
					

				}else if(monthsList.indexOf(eMonth) < monthsList.indexOf(month.trim())) {
					//prev
					driver.findElement(prevBtn).click();
					month = driver.findElement(cMonth).getText();
					year = driver.findElement(cYear).getText();
				}else if(monthsList.indexOf(eMonth) > monthsList.indexOf(month)){
					//next
					driver.findElement(nextBtn).click();
					month = driver.findElement(cMonth).getText();
					year = driver.findElement(cYear).getText();
				}
			}
			else if (Integer.valueOf(eYear)>Integer.valueOf(year)) {
				driver.findElement(nextBtn).click();
			}else if (Integer.valueOf(eYear)<Integer.valueOf(year)) {
				driver.findElement(prevBtn).click();
			}
			
			month = driver.findElement(cMonth).getText();
			year = driver.findElement(cYear).getText();

		}

	}

}
