package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	private static Object driver;

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fs=new FileInputStream(".\\src\\test\\resources\\test case 1.xlsx");
		Workbook wb= WorkbookFactory.create(fs);
		org.apache.poi.ss.usermodel.Sheet sh= wb.getSheet("Sheet1");
		Row r= sh.getRow(2);
		Cell c=r.getCell(1);
		String value=c.getStringCellValue();
		System.out.println(value);

		

	}

}
