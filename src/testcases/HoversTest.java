package testcases;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.Hovers;

public class HoversTest extends BaseClass{
	
	@Test
	public void HoverTest1() {
		Hovers hover = new Hovers(driver);
		var caption = hover.hoverOverFig(2);
		assertEquals(caption.isCaptionDisplayed(), true);
		print(caption.getName());
		print(caption.getLink());
		
		
	}
	

}
