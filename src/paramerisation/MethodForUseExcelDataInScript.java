package paramerisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MethodForUseExcelDataInScript {
	public String readData(int row, int column) throws IOException {
		String path = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumCodes\\Credentialfile\\Excel.xlsx";

		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");

//		String datavalue = sh1.getRow(5).getCell(1).getStringCellValue();

		DataFormatter df = new DataFormatter();

		String datavalue = df.formatCellValue(sh1.getRow(row).getCell(column));

		System.out.println(datavalue);

		return datavalue;
	}

}
