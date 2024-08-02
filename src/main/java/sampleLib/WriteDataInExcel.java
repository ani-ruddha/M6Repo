package sampleLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import genricLibOrUtility.IconstantUtility;

public class WriteDataInExcel {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(9).createCell(1).setCellValue("WELCOME");

		FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
		System.out.println("pass");

	}
}
