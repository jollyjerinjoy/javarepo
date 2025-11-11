package excelRead;

import java.io.IOException;

public class ExcelMain  { 
	  
	 	public static void main(String[] args) throws IOException { 
	 		 
	 		String s=ExcelCode.readStringData(1, 0); // 1st row
	 		System.out.println(s); 
	 		String s1=ExcelCode.readIntegerData(1, 1); 
	 		System.out.println(s1); 
	 		
	 		String ss=ExcelCode.readStringData(2, 0); // 1st row
	 		System.out.println(ss); 
	 		String ss1=ExcelCode.readIntegerData(2, 1); 
	 		System.out.println(ss1); 
	 	

	 	} 
	  
	 }
