package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
//import base.BaseClass;
import org.apache.commons.io.IOUtils; 


public class ExcelUtils{
	public static File file1;
	public static FileInputStream fip1;
	public static Workbook workbook;
	public static Sheet sheet;
	public static Row row;
	public static Cell cell;
	public static int rowCount=0;
	public static int cellCount=0;
	public static String filePath = System.getProperty("user.dir")+ "/reports/demoExcel.xlsx";
	public static String fileName = "demoExcel.xlsx";
	public static String sheetname = "Sheet 1";
	
	public static Object[][] sheetdata;
	public static Object[][] readFromExcel() {
		try {
			file1 = new File(filePath);
			fip1 = new FileInputStream(file1);
			if(fileName.contains(".xlsx")) {
				workbook = new XSSFWorkbook(fip1);
				sheet = workbook.getSheetAt(0);
			}
			else if(fileName.contains(".xls")) {
				workbook = new HSSFWorkbook(fip1);
				sheet = workbook.getSheetAt(0);
			}

			else {
				System.out.println("Wrong file format");
				Assert.assertFalse(true);
			}


			
			rowCount = sheet.getPhysicalNumberOfRows();
			row = sheet.getRow(0);
			cellCount=row.getLastCellNum();
			sheetdata = new Object[rowCount][cellCount];
			for(int i=0; i<rowCount; i++) {
				row =sheet.getRow(i);
				for(int j=0;j<cellCount; j++) {
					cell = row.getCell(j);
					
					if(cell.getCellType() == cell.CELL_TYPE_STRING) {
						sheetdata[i][j] = cell.getStringCellValue();
					}
					else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
						sheetdata[i][j] = cell.getNumericCellValue();
					}
					else if(cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
						sheetdata[i][j] = cell.getBooleanCellValue();
					}

				}


			}
		}
		catch(FileNotFoundException e) {
			System.out.print("FileNotFoundException error occurs: "+ e.getMessage());
		}
		catch(Exception el) {
			System.out.println("Exception occurs: "+el.getMessage());
		}
		
		return sheetdata;
	
	}



}
