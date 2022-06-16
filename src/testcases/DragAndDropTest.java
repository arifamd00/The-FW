package testcases;

import org.testng.annotations.Test;
import pom.DragAndDrop;
import base.BaseClass;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest extends BaseClass{
	@Test
	public void DragAndDrop1() {
		DragAndDrop dp=  new DragAndDrop();
		dp.dragDrop();
	}

}
