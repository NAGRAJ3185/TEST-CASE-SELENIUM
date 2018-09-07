package com.Generic;

import java.io.FileInputStream;


import java.util.Set;

import org.openqa.selenium.By;

public class Generic
{
	public static String setStringCellValue()
	{
  try
  {
	   
	FileInputStream fis=new FileInputStream("D://selenium//Monster.xlsx");
	 Workbook create =WorkbookFactory.create(fis);
	 Set sheet = create.getSheet("Sheet1");
	 String stringCellValue1 = sheet.getRow(0).getCell(0).getStringCellValue();
  }
  catch(Exception e)
  {
	  
  }
  return v;
	}
}
