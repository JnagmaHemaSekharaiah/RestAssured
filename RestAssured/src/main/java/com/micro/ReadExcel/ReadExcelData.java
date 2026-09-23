package com.micro.ReadExcel;


import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class ReadExcelData
{
    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Users\\sekha\\Downloads\\Workbook1.xlsx");
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet  sheet    = workbook.getSheet("Sheet1");
        int lastRow =sheet.getLastRowNum();
        for (int i=0;i<=lastRow;i++)
        {
            Row row = sheet.getRow(i);
             int lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++)
            {
                Cell cell = row.getCell(j);
                Object cellValye = ReadExcelData.getCellData(cell);
                System.out.print (cellValye+"  ");
            }
            System.out.println();
        }

    }

    public static Object  getCellData(Cell cell)
    {
        switch(cell.getCellType())
        {
            case STRING :
//                System.out.println("String : "+cell.getStringCellValue());
                return cell;

            case NUMERIC :
//                System.out.println("Numeric : "+cell.getStringCellValue());
                return cell;

            case BOOLEAN :
//                System.out.println("BOOLEAN : "+cell.getStringCellValue());
                return cell;

            case BLANK:
//                System.out.println("BLANK : "+cell.getStringCellValue());
                return "";

            default: return null;
        }
    }

}
