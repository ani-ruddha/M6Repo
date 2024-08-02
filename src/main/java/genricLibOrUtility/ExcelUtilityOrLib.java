package genricLibOrUtility;

/**
 * this class is based on All Excel realated operations
 * @author Aniruddha Das
 * @version 7.1.24
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityOrLib {
	/**
	 * this method is use to read single data from excel
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception
	 */
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	}

	/**
	 * this method is read to multiple data from excel
	 * 
	 * @param sheetName
	 * @param firstRowNum
	 * @param firstCellNum
	 * @throws Exception
	 */
	public void readMultipleDataFromExcel(String sheetName, int firstRowNum, int firstCellNum) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter format = new DataFormatter();

		for (int i = firstRowNum; i <= sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			for (int j = firstCellNum; j <= r.getLastCellNum() - 1; j++) {
				String values = format.formatCellValue(r.getCell(j));
				System.out.println(values);
			}
		}
	}
/**
 * this is a generic method to write data in Excel
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @param value
 * @throws Exception
 */
	public void writeDataInExcel
	(String sheetName, int rowNum, int cellNum, String value) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
	}
}
