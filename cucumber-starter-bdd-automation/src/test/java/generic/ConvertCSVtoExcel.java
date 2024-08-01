package generic;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import au.com.bytecode.opencsv.CSVReader;
import utility.XLUtils;

public class ConvertCSVtoExcel {
public static void ConvertCSVToXls() {
        HSSFSheet sheet = null;
        CSVReader reader = null;
        Workbook workBook = null ;
        String generatedXlsFilePath = "";
        FileOutputStream fileOutputStream = null;
        
 
        try {
 
            /**** Get the CSVReader Instance & Specify The Delimiter To Be Used ****/
            String[] nextLine;
            String csvLoc = "C:\\Environment\\Omicron-Parameters.csv";
			String FILE_DELIMITER="";
			reader = new CSVReader(new FileReader(csvLoc));
 
            workBook = new HSSFWorkbook();
            sheet = (HSSFSheet) workBook.createSheet("results");
 
            int rowNum = 0;
        //    logger.info("Creating New .Xls File From The Already Generated .Csv File");
            while((nextLine = reader.readNext()) != null) {
                Row currentRow = sheet.createRow(rowNum++);
                for(int i=0; i < nextLine.length; i++) {
                    if(NumberUtils.isDigits(nextLine[i])) {
                        currentRow.createCell(i).setCellValue(Integer.parseInt(nextLine[i]));
                    } else if (NumberUtils.isNumber(nextLine[i])) {
                        currentRow.createCell(i).setCellValue(Double.parseDouble(nextLine[i]));
                    } else {
                        currentRow.createCell(i).setCellValue(nextLine[i]);
                    }
                }
            }
 
            String xlsLoc="C:\\Environment\\";
            String FILE_NAME = "Omicron-Parameters";
            String FILE_EXTN = ".xls";
			generatedXlsFilePath = xlsLoc + FILE_NAME + FILE_EXTN;
        //    logger.info("The File Is Generated At The Following Location?= " + generatedXlsFilePath);
 
            fileOutputStream = new FileOutputStream(generatedXlsFilePath.trim());
            workBook.write(fileOutputStream);
        } catch(Exception exObj) {
         //   logger.error("Exception In convertCsvToXls() Method?=  " + exObj);
        } finally {         
            try {
 
                /**** Closing The Excel Workbook Object ****/
                workBook.close();
 
                /**** Closing The File-Writer Object ****/
                fileOutputStream.close();
 
                /**** Closing The CSV File-ReaderObject ****/
                reader.close();
            } catch (IOException ioExObj) {
            //    logger.error("Exception While Closing I/O Objects In convertCsvToXls() Method?=  " + ioExObj);          
            }
        }
 
     // return generatedXlsFilePath;
      //  fileLoc = CSVtoExcel.convertCsvToXls(xlsLoc, csvLoc);
    }
public static void main(String args[]) throws IOException {
	ConvertCSVtoExcel cs = new ConvertCSVtoExcel();
	cs.ConvertCSVToXls();
	String OmicronXLPath = "C:\\Environment\\Omicron-Parameters.xls";
	XLUtils xlUtil3 = new XLUtils(OmicronXLPath);
	String var = xlUtil3.getCellData("results",0, 0); 
	System.out.println("*****var: *****"+var);
}
}