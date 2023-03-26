package com.utilsLayer;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.baseLayer.baseLayerTestNG;

public class excelReader extends baseLayerTestNG {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public excelReader(String path) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
	}

	public String getData(String sheetName, int rowIndex, int colIndex) throws Exception {

		try {
			return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		} catch (Exception e) {
			double d = workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
			long l = (long) d;
			return Long.toString(l);
			// return Long.toString((long)l);
		}
	}

	public int countTotalRows(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum();
	}

	public int countTotalCols(int sheetIndex, int rowIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(rowIndex).getLastCellNum();
	}

}
