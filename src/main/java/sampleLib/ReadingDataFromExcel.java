package sampleLib;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream
				("C:\\SeleniumFolder\\M6TestCaseData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sample");
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(sh.getRow(4).getCell(1));
		System.out.println(value);
	}
}
