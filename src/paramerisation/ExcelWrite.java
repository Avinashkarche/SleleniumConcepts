package paramerisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumCodes\\Credentialfile\\Excel.xlsx";

		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");

		File fout = new File(path);

		FileOutputStream fos = new FileOutputStream(fout);

		sh1.getRow(2).getCell(0).setCellValue("Rada");

		wb.write(fos);

	}

}
