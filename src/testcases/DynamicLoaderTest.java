package testcases;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.DynamicLoader;

public class DynamicLoaderTest extends BaseClass{
	
	@Test
	public void DyanmicLoaderTest1() {
		var loaderTest = new DynamicLoader(driver);
		loaderTest.clickOnStart();
		String text = loaderTest.getResult2();
		print(text);
	}
	
	

}
