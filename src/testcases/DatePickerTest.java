package testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.DatePicker;
import base.BaseClass;

public class DatePickerTest extends BaseClass{
	
	@Test(priority = 1)
	public void test1() {
		DatePicker dp = new DatePicker();
		dp.selectDate("15-July-1998");
	}
	/*
	@Test(priority = 2)
	public void test2() {
		DatePicker dp = new DatePicker();
		dp.selectDate("15-July-2018");
	}
	*/

}