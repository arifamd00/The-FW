package testcases;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.DIalog;
public class DialogTest extends BaseClass{
	
	@Test
	public void dialogTest1() {
		DIalog.getDialogText();
	}

}
