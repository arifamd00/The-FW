package testcases;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.Windows;

public class WindowsTest extends BaseClass{
	enum GAME {A, B, C}
	
	/*
	@Test(priority = 1)
	public void verifyTabbedWindow() {
		Windows.clickOntabbedWindow();
		Windows.openTabbedWindow();
		String parentWindow = driver.getWindowHandle();
		ArrayList<String> wids = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wids.get(1));
		String title = driver.getTitle();
		print(title+": tabbed");
		driver.close();
		driver.switchTo().window(parentWindow);
		
	}
	@Test(priority = 2)
	public void verifySeperateWindow() {
		String parentWindow = driver.getWindowHandle();
		Windows.clickOnSeperateWindow();
		Windows.openSeperateWindow();
		ArrayList<String> wids2 = new ArrayList<String>(driver.getWindowHandles());
		print(String.valueOf(wids2.size()));
		driver.switchTo().window(wids2.get(1));
		String title = driver.getTitle();
		print(title+": Seperate");
		driver.close();
		driver.switchTo().window(parentWindow);
		
	}
	@Test(priority = 3)
	public void verifyMultipleWindow() {
		String parentWindow = driver.getWindowHandle();
		Windows.clickOnMultipleWindow();
		Windows.openMultipleWindow();
		ArrayList<String> wids2 = new ArrayList<String>(driver.getWindowHandles());
		print(String.valueOf(wids2.size()));
		
		Iterator<String> iterate = wids2.iterator();
		while(iterate.hasNext()) {
			String childWindow = iterate.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.getTitle();
				print(": Multiple");
				driver.close();
			}
			
		}
		driver.switchTo().window(parentWindow);
		
	}
	
	
	public static void main(String args[]) {
		
		EnumSet<GAME> games = EnumSet.allOf(GAME.class);
		System.out.print(games.toArray()[0]);
	}
	
*/
}
