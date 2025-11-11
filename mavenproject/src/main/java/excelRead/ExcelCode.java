package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode { 
	  
	 	static FileInputStream f; 
	 	static XSSFWorkbook w; 
	 	static XSSFSheet sh; 
	  
	 	public static String readStringData(int row, int col) throws IOException { 
	 		f = new FileInputStream("C:\\Users\\jkann\\git\\javarepo\\mavenproject\\src\\main\\resources\\Data.xlsx"); //read excel file
	 		w = new XSSFWorkbook(f);    //entire excel consist of sheets
	 		sh = w.getSheet("Sheet1");  //select sheet1
	 		XSSFRow r = sh.getRow(row); //read cell values - row
	 		XSSFCell c = r.getCell(col); //read cell values - col
	 		return c.getStringCellValue(); //string to text format
	  
	 	} 
	  
	 	public static String readIntegerData(int row, int col) throws IOException { 
	 		f = new FileInputStream("C:\\Users\\jkann\\git\\javarepo\\mavenproject\\src\\main\\resources\\Data.xlsx"); 
	 		w = new XSSFWorkbook(f); //load workbook
	 		sh = w.getSheet("Sheet1"); 
	 		XSSFRow r = sh.getRow(row); 
	 		XSSFCell c = r.getCell(col); 
	 		int val =   (int) c.getNumericCellValue();  //convert double(gets by default) to int using typecasting 
	 		return String.valueOf(val);   //convert int to string using valueOf() method 
	 		//return val; 
	 	 
	 	} 
	  
	 }

//FileInputStream f: Used to read the Excel file from your system.

//XSSFWorkbook w: Represents the entire .xlsx Excel workbook.

//XSSFSheet sh: Represents one sheet inside the workbook
