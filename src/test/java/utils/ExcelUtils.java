package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {

		getRowCount();
//		getCellDataString(0,0);
//		getCellDataNumber(1,1);
	}

	public static void getRowCount() {

		try {

			path = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(path + "/excel/data.xlsx");

			sheet = workbook.getSheet("Sheet1");

			int rowCount = sheet.getPhysicalNumberOfRows();

			System.out.println(">>>>>>" + rowCount);

			for (int i = 0; i < rowCount; i++) {

				System.out.println(">>????" + sheet.getRow(i).getCell(1).getStringCellValue());

				if (sheet.getRow(i).getCell(0).getStringCellValue().equals("Username")) {

					System.out.println("The condition is true");

				} else {

					System.out.println("The condition is false");

				}

				// System.out.println(">>" +i);

			}

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

	public static void getCellDataString(int rowNum, int colNum) {

		try {

			path = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(path + "/excel/data.xlsx");

			sheet = workbook.getSheet("Sheet1");

			String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

			System.out.println(">>>>>" + celldata);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

	public static void getCellDataNumber(int rowNum, int colNum) {

		try {

			path = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(path + "/excel/data.xlsx");

			sheet = workbook.getSheet("Sheet1");

			double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println(">>>>>" + celldata);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

}
