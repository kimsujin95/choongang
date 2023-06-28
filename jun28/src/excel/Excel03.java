package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel03 {
   public static void main(String[] args) throws IOException {

      // Workbook생성하기
      Workbook wb = new HSSFWorkbook();// poi-4.0.0.jar
      //Workbook wb2 = new XSSFWorkbook();// poi-ooxml-4.0.0.jar

      Sheet sheet1 = wb.createSheet("시트만듬");

      //sheet1.setColumnWidth(0, 10000);

      Row row = null;
      Cell cell = null;
      int rowNum = 0;
      
      row = sheet1.createRow(rowNum++);
      
      cell = row.createCell(0);
      cell.setCellValue("이름");
      
      cell = row.createCell(1);
      cell.setCellValue("나이");
      
      cell = row.createCell(2);
      cell.setCellValue("사는곳");
      
     //data
      row = sheet1.createRow(rowNum++);
      cell = row.createCell(0);
      cell.setCellValue("홍길동");
      cell = row.createCell(1);
      cell.setCellValue("230");
      cell = row.createCell(2);
      cell.setCellValue("한양");
      
      File xlsfile = new File("c:\\temp\\test.xls") ;
      
      FileOutputStream fos = new FileOutputStream(xlsfile);
      wb.write(fos);
      
   }
}