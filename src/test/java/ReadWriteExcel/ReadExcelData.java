package ReadWriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\Naveen_Automation\\Selenium\\src\\test\\java\\ReadWriteExcel\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook xf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xf.getSheet("Sheet1");

		int rownum = sheet.getLastRowNum();
		int colnum = sheet.getRow(0).getLastCellNum();

		System.out.println("Total number of row num is :" + rownum);
		System.out.println("Total number of row num is :" + colnum);

		for (int r = 1; r <= rownum; r++) {
			XSSFRow rown = sheet.getRow(r);
			for (int cl = 0; cl < colnum; cl++) {
				XSSFCell cell = rown.getCell(cl);
				switch (cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;

				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;

				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				}
			}

			System.out.println();
		}
	}
}
