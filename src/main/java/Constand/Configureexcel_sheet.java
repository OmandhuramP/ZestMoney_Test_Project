package Constand;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Configureexcel_sheet {
	//declare globally 
		 XSSFWorkbook wrk;
		 XSSFSheet sheet;

		 public  Configureexcel_sheet(String pathofexcel) throws IOException
		 {
				 try {
					File src=new File(pathofexcel);
					// pass the excel sheet variable name
					 FileInputStream fis=new FileInputStream(src);
					 wrk=new XSSFWorkbook(fis);
					 
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
		 }
		 // declare the sheetname,row and column name
	 public String getdata(int sheetnumber,int row,int column)
			 {
				 
				 sheet=wrk.getSheetAt(sheetnumber);
				 String data01=sheet.getRow(row).getCell(column).getStringCellValue();
				 return data01;
			 }
		 }
	

