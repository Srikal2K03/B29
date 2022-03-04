package p29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*How to read data from excel file?
 * 1. required dependency--> poi & poi-ooxml
 * 2. poi- poor obfuscation implementation
 * 3. open the excel file
 * 4. goto sheet
 * 5. goto cell  and get the value
 * 6. close the workbook/excel file.
 */
public class Demo3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//open the excel file
		Workbook wb = WorkbookFactory.create(new FileInputStream("./Data/Book1.xlsx"));
		//goto sheet1
		Sheet s = wb.getSheet("sheet1");
		//goto 1st row 1st col, get the value
		String v=s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(v);
		String v1=s.getRow(1).getCell(0).getStringCellValue();
		System.out.println(v1);
		String v2=s.getRow(2).getCell(0).getStringCellValue();
		System.out.println(v2);
		String v3=s.getRow(1).getCell(1).getStringCellValue();
		System.out.println(v3);
		
		//close the xl file
		wb.close();
		
	}
}
