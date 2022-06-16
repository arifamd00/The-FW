package testcases;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.Frames;

public class FrameTest extends BaseClass {
	
	@Test(priority = 1)
	public void singleFrameTest1() {
		Frames.switchToSingleFrame();
		Frames.enterTextInSingleFrame("Aarif");
	}
	@Test(priority = 2)
	public void multipleFrameTest1() {
		Frames.moveToParentFrame();
		Frames.switchToMultipleFrame();
		Frames.enterTextInMultipleFrame("Aarif Ahmed");
	}

}
