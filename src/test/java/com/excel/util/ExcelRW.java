package com.excel.util;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRW {

	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static FileInputStream fis;
	public static FileOutputStream fos;

	public static String path;

	public static void main(String[] args) throws Throwable {

		path = System.getProperty("user.dir");

		fis = new FileInputStream(path + "/excel/Testdata.xlsx");

		wb = new XSSFWorkbook(fis);

		sh = wb.getSheet("Sheet1");

		// int rowNum=sh.getPhysicalNumberOfRows();

		int rowNum = sh.getLastRowNum() + 1;

		System.out.println(">>>>>>" + rowNum);

		for (int i = 0; i < rowNum; i++) {

			//System.out.println(">>>>" + sh.getRow(i).getCell(0).getStringCellValue());
			//System.out.println(">>>>R" + sh.getRow(i).getCell(0));

			Row row = sh.getRow(i);

			int colNum = row.getLastCellNum();

			//System.out.println(">>Col number:" + colNum);

			for (int j = 0; j < colNum; j++) {

				System.out.println(">>" + row.getCell(j));

			}

		}

		wb.close();

	}

}
