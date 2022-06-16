package testcases;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.BrokenImages;

public class BrokenImagesTest extends BaseClass{
	/*
	 * below test verify images using naturalWidth attribute
	@Test
	public void BrokenImageTest1() {
		var bI = new BrokenImages(driver);
		
		int broken = bI.getBrokenImage();
		
		System.out.print(broken);;
		
	}
	*/
	
	// below methoid verify broken image using http client request
	@Test
	public void BrokenImageTest2() {
		var bI = new BrokenImages(driver);
		
		int broken = bI.getBrokenImage2();
		
		System.out.print(broken);;
		
	}

}
