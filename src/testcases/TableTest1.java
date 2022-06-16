package testcases;
import java.util.List;

import org.testng.annotations.Test;

import base.BaseClass;
import pom.Table1;

public class TableTest1 extends BaseClass{
	
	@Test
	public void TableTest1() {
		
		Table1 table = new Table1(driver);
		List<String>tab = table.getHeader();
		print("----------Header------------");
		tab.forEach(d->print(d));
		print("----------End------------");
		
		var record = table.getRecord(1);
		List<String> data = record.getData();
		print("----------Data------------");
		data.forEach(d->print(d));
		print("----------End------------");
		
		record.deleteRecord();
		
		print(driver.getCurrentUrl());
		
		var record2 = table.getRecord(0);
		record2.editRecord();
		List<String> data2 = record2.getData();
		print("----------Data------------");
		data2.forEach(d->print(d));
		print("----------End------------");
		print(driver.getCurrentUrl());
		
	}

}
