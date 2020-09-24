package dss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaders {

	private static final String Row = null;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static FileInputStream fis;

	public static String path = System.getProperty("user.dir");

	public static void main(String[] args) throws Exception {

		readFile(1,0);
		readFile(1,1);

	}

	public static String readFile(int row , int col) throws Exception {

		fis = new FileInputStream(path + "/excel/DataTests.xlsx");

		wb = new XSSFWorkbook(fis);

		sheet = wb.getSheet("Sheet1");

		int rowNum = sheet.getLastRowNum();

		System.out.println("The Row Number as :" + rowNum);

		//for (int i = 0; i < rowNum; i++) {

			String str = sheet.getRow(row).getCell(col).getStringCellValue();

			// System.out.println("The data in Row" + str);

			Row row1 = sheet.getRow(row);

			int colNum = row1.getLastCellNum();

			System.out.println("The Colomn Number as :" + colNum);

			//for (int j = 0; j < colNum; j++) {

				System.out.println("The data of col: " + row1.getCell(col).toString());

			//}

		//}
				return row1.getCell(col).toString();

	}

}
