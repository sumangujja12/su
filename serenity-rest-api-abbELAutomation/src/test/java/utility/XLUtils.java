package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row; 
public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static HSSFWorkbook workbook;
	public static HSSFSheet worksheet;
	public static HSSFRow row;
	public static HSSFCell cell;
	String path;
	
	public  XLUtils(String path)
	{
		this.path=path;
	}
	
	
	public int getRowCount(String sheetName)throws IOException

	{
		fi= new FileInputStream(path);
		workbook= new HSSFWorkbook(fi);
		worksheet=workbook.getSheet(sheetName);
		int rowcount=worksheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;    
	}
	
	public int getRowCount1(String sheetName)throws IOException

	{
		fi= new FileInputStream(path);
		workbook= new HSSFWorkbook(fi);
		worksheet=workbook.getSheet(sheetName);
		int rowcount=worksheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++) {		
			
			if((worksheet.getRow(i+2).getCell(1).getStringCellValue() == worksheet.getRow(i+2).getCell(2).getStringCellValue())) {
				rowcount=i+1;
				break;
			}	 
		}
		workbook.close();
		fi.close();
		return rowcount;    
	}
	
public static int getRowCount(String xlfile, String xlsheet)throws IOException

{
	fi= new FileInputStream(xlfile);
	workbook= new HSSFWorkbook(fi);
    worksheet=workbook.getSheet(xlsheet);
    int rowcount=worksheet.getLastRowNum();
    workbook.close();
    fi.close();
    return rowcount;    
}
	
public int getCellCount(String sheetName,int rownum)throws IOException
{
	fi= new FileInputStream(path);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(sheetName);
	row=worksheet.getRow(rownum);
	int cellcount=row.getLastCellNum();
	workbook.close();
	fi.close();
	return cellcount; 
}


public static int getCellCount(String xlfile,String xlsheet,int rownum)throws IOException
{
	fi= new FileInputStream(xlfile);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(xlsheet);
	row=worksheet.getRow(rownum);
	int cellcount=row.getLastCellNum();
	workbook.close();
    fi.close();
    return cellcount; 
}
	
public String getCellData(String sheetName,int rownum, int column)throws IOException
{
	fi= new FileInputStream(path);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(sheetName);
	row=worksheet.getRow(rownum);
	cell=row.getCell(column);
	
	DataFormatter formatter = new DataFormatter();
	String data;
	try
	{
		data = formatter.formatCellValue(cell);
		
	}
	catch(Exception e)
	{
		data="";
	}

	workbook.close();
	fi.close();
	return data;
}

public static String getCellData(String xlfile,String xlsheet,int rownum, int column)throws IOException
{
	fi= new FileInputStream(xlfile);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(xlsheet);
	row=worksheet.getRow(rownum);
	cell=row.getCell(column);
	String data;
	try
	{
	DataFormatter formatter = new DataFormatter();
	String cellData = formatter.formatCellValue(cell);
	return cellData;
	}
	catch(Exception e)
	{
		data="";
	}
	
	workbook.close();
    fi.close();
	return data;
}

public void setCellData(String sheetName, int rownum, int column, String deviceName) throws IOException {
	File xlfile = new File(path);
	if(!xlfile.exists())  // if file not exists then create a new file
	{
		workbook = new HSSFWorkbook();
		fo = new FileOutputStream(path);
		workbook.write(fo);
	}
	
	fi= new FileInputStream(path);
	workbook= new HSSFWorkbook(fi);
	
	if(workbook.getSheetIndex(sheetName)==-1)  // if sheet not exists then create new sheet
	workbook.createSheet(sheetName);
	worksheet=workbook.getSheet(sheetName);
	
	if(worksheet.getRow(rownum)==null)  //if row not exists then create new row
		worksheet.createRow(rownum);
	row = worksheet.getRow(rownum);
	
	cell=row.createCell(column);
	cell.setCellValue(deviceName);
	fo = new FileOutputStream(path);
	workbook.write(fo);
	workbook.close();
	fi.close();
	fo.close();
	
}

public static void setCellData1(String xlfile, String xlsheet, int rownum, int column, String data) throws IOException

{
	fi= new FileInputStream(xlfile);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(xlsheet);
	row=worksheet.getRow(rownum);
	cell=row.createCell(column+1);
	cell.setCellValue(data);
	fo = new FileOutputStream(xlfile);
	workbook.write(fo);
	workbook.close();
    fi.close();
    fo.close();
	
}

public void setCellVal(String sheetName,int rownum, int column, float v2) throws IOException
{
	File xlfile = new File(path);
	if(!xlfile.exists())  // if file not exists then create a new file
	{
		workbook = new HSSFWorkbook();
		fo = new FileOutputStream(path);
		workbook.write(fo);
	}
	
	fi= new FileInputStream(path);
	workbook= new HSSFWorkbook(fi);
	
	if(workbook.getSheetIndex(sheetName)==-1)  // if sheet not exists then create new sheet
	workbook.createSheet(sheetName);
	worksheet=workbook.getSheet(sheetName);
	
	if(worksheet.getRow(rownum)==null)  //if row not exists then create new row
		worksheet.createRow(rownum);
	row = worksheet.getRow(rownum);
	
	cell=row.createCell(column);
	cell.setCellValue(v2);
	fo = new FileOutputStream(path);
	workbook.write(fo);
	workbook.close();
	fi.close();
	fo.close();
	
}

public void setCellDoubleVal(String sheetName,int rownum, int column, double v2) throws IOException
{
	File xlfile = new File(path);
	if(!xlfile.exists())  // if file not exists then create a new file
	{
		workbook = new HSSFWorkbook();
		fo = new FileOutputStream(path);
		workbook.write(fo);
	}
	
	fi= new FileInputStream(path);
	workbook= new HSSFWorkbook(fi);
	
	if(workbook.getSheetIndex(sheetName)==-1)  // if sheet not exists then create new sheet
	workbook.createSheet(sheetName);

	worksheet=workbook.getSheet(sheetName);
	
	if(worksheet.getRow(rownum)==null)  //if row not exists then create new row
		worksheet.createRow(rownum);
	row = worksheet.getRow(rownum);
	
	cell=row.createCell(column);
	cell.setCellValue(v2);
	fo = new FileOutputStream(path);
	workbook.write(fo);
	workbook.close();
	fi.close();
	fo.close();
	
}

public static void setCellVal(String xlfile, String xlsheet, int rownum, int column, double data) throws IOException

{
	fi= new FileInputStream(xlfile);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(xlsheet);
	row=worksheet.getRow(rownum);
	cell=row.createCell(column);
	cell.setCellValue(data);
	fo = new FileOutputStream(xlfile);
	workbook.write(fo);
	workbook.close();
    fi.close();
    fo.close();
	
}

public static void setCellColorPass(String xlfile, String xlsheet, int rownum, int column,String data) throws IOException{
	//public static void setCellColorPass(String xlfile, String xlsheet, int rownum, int column) throws IOException{
	
	fi= new FileInputStream(xlfile);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(xlsheet);
	row=worksheet.getRow(rownum);
	cell=row.createCell(column);
	cell.setCellValue(data);
	CellStyle style = workbook.createCellStyle();
	style. setFillForegroundColor(IndexedColors.GREEN. getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	cell.setCellStyle(style); 
	fo = new FileOutputStream(xlfile);
	workbook.write(fo);
	workbook.close();
    fi.close();
    fo.close();
	
	}

public static void setCellColorFail(String xlfile, String xlsheet, int rownum, int column,String data) throws IOException{
	
	fi= new FileInputStream(xlfile);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(xlsheet);
	row=worksheet.getRow(rownum);
	cell=row.createCell(column);
	cell.setCellValue(data);
	CellStyle style = workbook.createCellStyle();
	style. setFillForegroundColor(IndexedColors.RED. getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	cell.setCellStyle(style); 
	fo = new FileOutputStream(xlfile);
	workbook.write(fo);
	workbook.close();
    fi.close();
    fo.close();
	
	}

public String getCellPlantData() throws IOException {
	   FileInputStream fs = new FileInputStream("C:\\Environment\\EnvironmentParameters.xls");
	   //Creating a workbook
	   HSSFWorkbook workbook = new HSSFWorkbook(fs);
	   HSSFSheet sheet = workbook.getSheetAt(0);
	   Row row = sheet.getRow(5);
	   Cell cell = row.getCell(1);
	   System.out.println(sheet.getRow(5).getCell(1));
	   String data1 = sheet.getRow(5).getCell(1).toString();
	   return data1;
	}

public int getRowCountWithoutBlankRows(String sheetName)throws IOException
{
	fi= new FileInputStream(path);
	workbook= new HSSFWorkbook(fi);
	worksheet=workbook.getSheet(sheetName);
	int rowcount=worksheet.getLastRowNum();
	for(int i=0;i<=rowcount;i++) { 
		if((worksheet.getRow(i+2).getCell(1).getStringCellValue() == worksheet.getRow(i+2).getCell(2).getStringCellValue())) {
			rowcount=i+1;
			break;
		} 
	}
	workbook.close();
	fi.close();
	return rowcount; 
}

}

