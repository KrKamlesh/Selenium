package ReadWriteExcel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args) throws IOException {

		// Created a new workbook
		XSSFWorkbook workboook = new XSSFWorkbook();
		XSSFSheet sheet = workboook.createSheet("employee info");

		Object empdata[][] = { { "Emp id", "Name", "Job" }, { "102", "Kamlesh", "QA" }, { "102", "Ananad", "MGR" },
				{ "103", "Sanjay", "DEV" } };

		// Using for loop

		// print the number of rows in empdata array
		int rows = empdata.length;
		int cols = empdata[0].length;

		System.out.println("The number of rows in empdata is " + rows);
		System.out.println("The number of cols in empdata is " + cols);

		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.createRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c];
				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);

			}
		}
		
		String filepath=".\\Datafolder\\Employee.xlsx";
		FileOutputStream fout=new FileOutputStream(filepath);
		workboook.write(fout);
		
		fout.close();
		
		System.out.println("Emplyee is get added to the excel  file successfully------Hurry congratulations");
		
	}

}
