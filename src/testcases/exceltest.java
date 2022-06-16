package testcases;

import base.BaseClass;
import utilities.ExcelUtils;
public class exceltest extends ExcelUtils{
	public static void main(String args[]) {
		Object[][] a;
		//initializeProp();
		a= ExcelUtils.readFromExcel();
		int rowCount = a.length;
		int cellCount = a[0].length;
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				System.out.println(a[i][j].getClass().getSimpleName());
			}
			
		}
		
	}

}
