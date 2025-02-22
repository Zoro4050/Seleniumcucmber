package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static FileInputStream fileInputStream;
	private static FileOutputStream fileOutputStream;
	private static Workbook workbook;

	public static Workbook initializeWorkbook(String filePath) {
		try {
			fileInputStream = new FileInputStream(filePath);
			return new XSSFWorkbook(fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static int getRowCount(String filePath, String sheetName) {
		workbook = initializeWorkbook(filePath);
		return workbook.getSheet(sheetName).getLastRowNum();
	}

	public static int getCellCountOnTheRow(String filePath, String sheetName, int rowNum) {
		workbook = initializeWorkbook(filePath);
		return workbook.getSheet(sheetName).getRow(rowNum).getLastCellNum();
	}

	public static String getCellValue(String filePath, String sheetName, int rowNum, int cellNum) {
		workbook = initializeWorkbook(filePath);
		Cell cell = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();
		case Cell.CELL_TYPE_NUMERIC:
			return "" + (int) cell.getNumericCellValue();
		case Cell.CELL_TYPE_BLANK:
			return "";
		default:
			throw new RuntimeException("There is no support for this type of cell");
		}
	}

	public static void updateCellValue(String filePath, String sheetName, int rowNum, int cellNum, String input) {
		workbook = initializeWorkbook(filePath);
		workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(input);
		try {
			fileOutputStream = new FileOutputStream(filePath);
			workbook.write(fileOutputStream);
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
