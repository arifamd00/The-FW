package testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.Accordian;

public class AccordianTest extends BaseClass {
	
	@Test
	public static void AccordianTest1() {
		Accordian.getAccordianList();
	}
	
	
}
