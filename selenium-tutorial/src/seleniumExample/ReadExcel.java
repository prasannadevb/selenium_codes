package seleniumExample;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream(new File("excelfile.xlsx"));
		Workbook workbook = new XSSFWorkbook(file);

	}

}
