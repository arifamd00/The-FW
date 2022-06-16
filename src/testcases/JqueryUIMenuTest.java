package testcases;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.JqueryUIMenu;

public class JqueryUIMenuTest extends BaseClass{

	@Test
	public void UiMenutest1() {
		JqueryUIMenu menu = new JqueryUIMenu(driver);
		menu.selectfromMenu("Enabled").selectFromEnabled("Downloads").selectFromDownload("PDF");
	}
}
