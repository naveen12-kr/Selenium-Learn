package dss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.lowagie.text.Row;

public class ReadExcel {

	public static void main(String[] args) throws Throwable {

		String path = System.getProperty("user.dir");

		File scr = new File(path + "/excel/Test1.xlsx");

		try {
			FileInputStream input = new FileInputStream(scr);

			XSSFWorkbook wb = new XSSFWorkbook(input);

			XSSFSheet sh = wb.getSheet("Sheet1");

			int rowNum = sh.getLastRowNum();

			int colNum = sh.getPhysicalNumberOfRows();

			System.out.println("The size of:" + rowNum);
			System.out.println("The size of>>>:" + colNum);

			for (int i = 0; i <= rowNum; i++) {

				String str = sh.getRow(i).getCell(0).getStringCellValue();

//				for (int j = 0; j <colNum ; j++) {
//					
//					String str1 = sh.getRow(j).getCell(1).getStringCellValue();

				System.out.println(">>>>" + str);

//				}

			}

			XSSFCell data = sh.getRow(2).getCell(0);

			System.out.println(">?>?" + data);

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());

			e.printStackTrace();
		}

	}

}
