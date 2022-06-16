package testcases;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.NestedOptions;

public class NestedOptionsTest extends BaseClass{
	@Test
	public void nestedOptionsTest1() {
		NestedOptions.selectFromMenu("Music");
		NestedOptions.selectFromMusicMenu("Rock");
		//NestedOptions.selectFromRockMenu("Classic");
	}
	

}
