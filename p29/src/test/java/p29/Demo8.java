package p29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo8 {

	public static String getData(String path,String sheet,int r,String colName )  
	{

		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		try 
		{
		  Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		  int cc=wb.getSheet(sheet).getRow(0).getLastCellNum();
		  for(int i=0;i<cc;i++) {
			  String k=wb.getSheet(sheet).getRow(0).getCell(i).toString();
			  String v=wb.getSheet(sheet).getRow(r).getCell(i).toString();
			  map.put(k, v);  
		  }

		  wb.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		  
		return map.get(colName);
	}

}
