package ExcelBooks;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelSplitter {

	public static void main(String[] args) {
		String inputFile = "./src/test/java/ExcelBooks/output.xlsx"; // Input Excel file

		int rowsPerWorkbook = 3; // Number of rows per new workbook

		try {
			FileInputStream inputStream = new FileInputStream(new File(inputFile));
			Workbook workbook = new XSSFWorkbook(inputStream);

			// Get the header row (1st row)
			Sheet sheet = workbook.getSheetAt(0); // Assuming you want the first sheet
			Row headerRow = sheet.getRow(0);

			// Iterate through the data rows and split into separate workbooks
			Iterator<Row> rowIterator = sheet.iterator();
			int rowCount = 0;
			int workbookCount = 1;
			List<Row> currentRows = new ArrayList<>();

			while (rowIterator.hasNext()) {
				Row currentRow = rowIterator.next();

				if (rowCount == 0) {
					// Skip the header row
					rowCount++;
					continue;
				}

				currentRows.add(currentRow);
				rowCount++;

				if (rowCount > rowsPerWorkbook || !rowIterator.hasNext()) {
					// Create a new workbook and add the header row
					Workbook newWorkbook = new XSSFWorkbook();
					Sheet newSheet = newWorkbook.createSheet("Sheet1");
					Row newHeaderRow = newSheet.createRow(0);
					copyHeaderRow(headerRow, newHeaderRow);

					// Add rows to the new sheet
					int rowIndex = 1;
					for (Row row : currentRows) {
						Row newRow = newSheet.createRow(rowIndex++);
						copyRow(row, newRow);
					}

					// Save the new workbook
					String outputFileName = "D:\\Selenium_Project\\AD-PFL\\src\\test\\java\\ExcelBooks\\outputexcels\\output"
							+ workbookCount + ".xlsx";
					try (FileOutputStream outputStream = new FileOutputStream(outputFileName)) {
						newWorkbook.write(outputStream);
					}

					currentRows.clear();
					rowCount = 0;
					workbookCount++;
				}
			}

			inputStream.close();
			System.out.println("Excel split into " + (workbookCount - 1) + " workbooks.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void copyHeaderRow(Row sourceRow, Row targetRow) {
		for (Cell sourceCell : sourceRow) {
			Cell targetCell = targetRow.createCell(sourceCell.getColumnIndex());
			targetCell.setCellValue(sourceCell.getStringCellValue());
		}
	}

	private static void copyRow(Row sourceRow, Row targetRow) {
		for (Cell sourceCell : sourceRow) {
			Cell targetCell = targetRow.createCell(sourceCell.getColumnIndex(), sourceCell.getCellType());
			targetCell.setCellValue(sourceCell.getStringCellValue());
		}
	}
}
