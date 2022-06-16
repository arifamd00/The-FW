package testcases;
import pom.Slider;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseClass;

public class SliderTest extends BaseClass{
	
	
	@Test
	public void moveSliderTest1() {
		Slider slider = new Slider(driver);
		slider.setRange("3");
		
		assertEquals(slider.getCurrentRange(), "3");
		
		
	}

}
