package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name = "TC_001")

	public String[][] getexceldata() throws IOException {
		String[][] data = new String[1][2];
		String excelpath = "C:\\Users\\thamodharan.p\\Downloads\\TC_001.xlsx";
		FileInputStream input1 = new FileInputStream(excelpath);
		XSSFWorkbook workbook = new XSSFWorkbook(input1);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			data[i][0] = String.valueOf(sheet.getRow(i).getCell(0).getRawValue());
			System.out.println(data[i][0]);
			data[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data[i][1]);
		}
		return data;
	}

	@DataProvider(name = "TC_002")

	public String[][] getexceldata1() throws IOException {
		String[][] data = new String[1][2];
		String excelpath = "C:\\Users\\thamodharan.p\\Downloads\\TC_001.xlsx";
		FileInputStream input1 = new FileInputStream(excelpath);
		XSSFWorkbook workbook = new XSSFWorkbook(input1);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			data[i][0] = String.valueOf(sheet.getRow(i).getCell(0).getRawValue());
			System.out.println(data[i][0]);
		}
		return data;
	}
}