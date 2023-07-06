package paramerisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumCodes\\Credentialfile\\Excel.xlsx";

		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");

//		String datavalue = sh1.getRow(5).getCell(1).getStringCellValue();

		DataFormatter df = new DataFormatter();

		String datavalue = df.formatCellValue(sh1.getRow(7).getCell(0));

		System.out.println(datavalue);

		int lastindexposition = sh1.getLastRowNum();// returns the last index position from excel sheet containing data

		int rowcount = lastindexposition + 1;

		System.out.println(rowcount);

		int columncount = sh1.getRow(0).getLastCellNum();// returns the actual column count from the excel sheet

		System.out.println(columncount);

	}
}
