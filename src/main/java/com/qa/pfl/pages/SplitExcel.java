package com.qa.pfl.pages; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SplitExcel {
	private static final String TEST_DATA_SHEET_PATH = "./src/test/resources/testdata/dummy1.xlsx";
	private static Workbook book;
	private static Sheet sheet;
	public static void main(String[] args) {
	 getTestData("Sheet1");
	}

	public static String[][] getTestData(String sheetName) {
		
		System.out.println("reading the data from sheet: " + sheetName);
		
		String data[][] = null;
		
		try {
			FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
			
			book = WorkbookFactory.create(ip);
			sheet = book.getSheet(sheetName);
			

			
			data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
					System.out.println(sheet.getRow(i + 1).getCell(j).toString());
					
				}
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}return data;
		
	} 
}

