package com.cybertek.tests.day19_excel_io;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelExample {
        private String filePath = "src/test/resources/Vytrack testusers.xlsx";

        //creates connection between jvm and the file
        private FileInputStream fileInputStream;
        //represents with excel file
        private Workbook workbook;
        //represent the sheet that contains actual data
        private Sheet workSheet;

        @BeforeMethod
    public void setUp() throws IOException {
            fileInputStream = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fileInputStream);
            workSheet = workbook.getSheetAt(0);
          //get sheet by name
            //  workSheet = workbook.getSheet("QA3-short");
        }

        @Test
        public void rowAndColumnCount(){
                System.out.println(workSheet.getSheetName());
                int rowCount = workSheet.getLastRowNum();
                System.out.println("row count = " + rowCount);
        }


}
