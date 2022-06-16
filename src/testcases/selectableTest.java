package testcases;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.Selectable;

public class selectableTest extends BaseClass{
	
	@Test
	public void selectabletest1() {
		Selectable.selectItems("Item 1,Item 5,Item 3");
	}

}
