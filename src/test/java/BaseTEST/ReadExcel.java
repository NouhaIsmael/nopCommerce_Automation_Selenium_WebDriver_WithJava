package BaseTEST;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ReadExcel {

   public Object [][] Testdata () throws IOException , InvalidFormatException {

        File myfile = new File("TestData/TestDataDriven.xlsx");

        XSSFWorkbook xwb = new XSSFWorkbook(myfile);
        XSSFSheet mysheet = xwb.getSheet("sheet1");

        int row_count = mysheet.getPhysicalNumberOfRows();
        int column_count = mysheet.getRow(0).getPhysicalNumberOfCells();

        //(row -1) 3shan ana msh 3ayz el header
        Object [][] myobj =  new Object[row_count-1][column_count];

        for (int i = 1 ; i < row_count; i++) {

            for (int j = 0; j < column_count; j++) {
                XSSFRow row = mysheet.getRow(i);
                myobj[i-1][j]= row.getCell(j).getStringCellValue();
            }
        }

     return myobj;
    }
}
