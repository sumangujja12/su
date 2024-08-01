package starter.postcodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import utility.XLUtils;

public class ComparisonMultifactPower {

	String exlpath = "C:\\Environment\\EnvironmentParameters.xls";
	String outpath = "C:\\\\ABBOutput\\\\APITestPowerWave2.xls";
	String ompath = "C:\\Environment\\Omicron-Parameters.xls";
	
	String url = null;
	String org = null;
	String widget = null;
	String site = null;
	String panel = null;
	String token = null;

	//@Test
	@Given("To verify the power widget for Wave 2 multifactor Comparison")
	public void powerValidation() throws IOException {
		String testEnv= XLUtils.getCellData(exlpath, "MainEnvironment", 3, 1);
if 


		(testEnv.equalsIgnoreCase("GlobalDevTest")) {
		url = XLUtils.getCellData(exlpath, "Wave2", 31, 1);
		org = XLUtils.getCellData(exlpath, "Wave2", 40, 1);
		widget = XLUtils.getCellData(exlpath,"Wave2", 37, 1);
		site = XLUtils.getCellData(exlpath, "Wave2",38, 1);
		panel = XLUtils.getCellData(exlpath, "Wave2", 39, 1);
		token = XLUtils.getCellData(exlpath, "Wave2", 41, 1); 
}

else if(testEnv.equalsIgnoreCase("GlobalStage"))
{
	url = XLUtils.getCellData(exlpath, "Wave2", 19, 1);
	org = XLUtils.getCellData(exlpath, "Wave2", 28, 1);
	widget = XLUtils.getCellData(exlpath, "Wave2", 25, 1);
	site = XLUtils.getCellData(exlpath, "Wave2",26, 1);
	panel = XLUtils.getCellData(exlpath, "Wave2", 27, 1);
	token = XLUtils.getCellData(exlpath, "Wave2", 29, 1); 

}
else if(testEnv.equalsIgnoreCase("GlobalProduction"))
{
	url = XLUtils.getCellData(exlpath, "Wave2", 43, 1);
	org = XLUtils.getCellData(exlpath, "Wave2", 52, 1);
	widget = XLUtils.getCellData(exlpath, "Wave2", 49, 1);
	site = XLUtils.getCellData(exlpath, "Wave2",50, 1);
	panel = XLUtils.getCellData(exlpath, "Wave2", 51, 1);
	token = XLUtils.getCellData(exlpath, "Wave2", 53, 1); 
}

		String response = SerenityRest.given()
				.queryParam("isOptions", "true")
				.queryParam("plantType", "EL")
				.queryParam("isPageEnabled", "true")
				.queryParam("page", "1")
				.queryParam("pageSize", "14")
				.header("accesstoken",token)
				.when()
				.get(url+org+"/site/"+site+"/panel/"+panel+"/widget/"+widget)
				.then()
				.extract()
				.response().asString();
		System.out.println(response.toString());
		JsonPath path = new JsonPath(response);
		System.out.println(path.getString("value.data.summary.devices["+0+"].name"));
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheetout = wb.createSheet("Sheet1");
		File f = new File(outpath);


		File f1 = new File(exlpath);
		FileInputStream inputStream = new FileInputStream(f1);
		try (Workbook wb1 = new HSSFWorkbook(inputStream)) {
			Sheet sheet1 =  wb1.getSheet("SimulatorInput");
			int deviceCount = path.getInt("value.data.summary.devices.size()");
			System.out.println(deviceCount);
			for(int i=0;i<=deviceCount;i++) {
				Row rowheader = sheetout.createRow(0);
				Cell cellheader1 = rowheader.createCell(0);
				cellheader1.setCellValue("Device Name");
				Cell cellheader2 = rowheader.createCell(1);
				cellheader2.setCellValue("p Input");
				Cell cellheader3 = rowheader.createCell(2);
				cellheader3.setCellValue("q Input");
				Cell cellheader4 = rowheader.createCell(3);
				cellheader4.setCellValue("s Input");
				Cell cellheader5 = rowheader.createCell(4);
				cellheader5.setCellValue("p Output");
				Cell cellheader6 = rowheader.createCell(5);
				cellheader6.setCellValue("q Output");
				Cell cellheader7 = rowheader.createCell(6);
				cellheader7.setCellValue("s Output");
				Cell cellheader8 = rowheader.createCell(7);
				cellheader8.setCellValue("p Result");
				Cell cellheader9 = rowheader.createCell(8);
				cellheader9.setCellValue("q Result");
				Cell cellheader10 = rowheader.createCell(9);
				cellheader10.setCellValue("s Result");
				//System.out.println(path.getString("value.data.summary.devices["+i+"].name"));
				Row row0 = sheetout.createRow(i+1);
				Cell celldev = row0.createCell(0);
				Cell cell0 = row0.createCell(4);
				Cell cell1 = row0.createCell(5);
				Cell cell2 = row0.createCell(6);
				Cell cell3 = row0.createCell(1);
				Cell cell4 = row0.createCell(2);
				Cell cell5 = row0.createCell(3);

				celldev.setCellValue(path.getString("value.data.summary.devices["+i+"].name"));

			    if(path.get("value.data.summary.devices["+i+"].p")==null){
					cell0.setCellValue(0);
				}else {
					cell0.setCellValue(path.getDouble("value.data.summary.devices["+i+"].p"));
				}
				if(path.get("value.data.summary.devices["+i+"].q")==null) {
					cell1.setCellValue(0);
				}else {
					cell1.setCellValue(path.getDouble("value.data.summary.devices["+i+"].q"));
				}
				if(path.get("value.data.summary.devices["+i+"].s")==null) {
					cell2.setCellValue(0);
				}else
				{
					cell2.setCellValue(path.getDouble("value.data.summary.devices["+i+"].s"));
				}

				FileOutputStream fos = new FileOutputStream(f);
				wb.write(fos);

				//reading data from a file
				FileInputStream fis=new FileInputStream(exlpath);  
				//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
				HSSFWorkbook workbook=new HSSFWorkbook(fis);  

				//getting the XSSFSheet object at given index 
				Sheet sheetcom = workbook.getSheet("DeviceSel");
				int rowCount = sheetcom.getLastRowNum()+1;
				for(int k=3;k<rowCount;k++) {
					Row rowf1 = sheetcom.getRow(k);
					Cell cellf1 = rowf1.getCell(7);
	
				//System.out.println(cellf1);
				if(cellf1.getStringCellValue().equals("Simulator")){
				Sheet sheet=workbook.getSheet("SimulatorInput");
				int rowTotal = sheet.getLastRowNum()+1;
				for(int j=3;j<rowTotal;j++) {
					Row row1 = sheet.getRow(j);
					Cell cellx = row1.getCell(1);
					//System.out.println(rowTotal);
					if(cellx.toString().equals(path.getString("value.data.summary.devices["+i+"].name"))){
						Cell vol1 = row1.getCell(8);
						Cell vol2 = row1.getCell(9);
						Cell vol3 = row1.getCell(10);
						Cell celly = rowf1.getCell(3);
						if(celly.toString().equals(path.getString("value.data.summary.devices["+i+"].name"))) {
						Cell multfact = rowf1.getCell(11);
						double mult = multfact.getNumericCellValue();
						cell3.setCellValue(vol1.getNumericCellValue()*mult);
						cell4.setCellValue(vol2.getNumericCellValue()*mult);
						cell5.setCellValue(vol3.getNumericCellValue()*mult);
					}
					}
					Cell cellout1 = row0.createCell(7);
					Cell cellout2 = row0.createCell(8);
					Cell cellout3 = row0.createCell(9);

					if(cell0.getNumericCellValue()==cell3.getNumericCellValue())
					{

						cellout1.setCellValue("PASS");

						wb.write(fos);
					}
					else
						cellout1.setCellValue("FAIL");

					wb.write(fos);
					if(cell1.getNumericCellValue()==cell4.getNumericCellValue())
					{
						cellout2.setCellValue("PASS");

						wb.write(fos);

					}
					else
						cellout2.setCellValue("FAIL");

					wb.write(fos);
					if(cell2.getNumericCellValue()==cell5.getNumericCellValue())
					{
						cellout3.setCellValue("PASS");

						wb.write(fos);
					}
					else
						cellout3.setCellValue("FAIL");

					wb.write(fos);


					//wb.close();
					//fos.close();
				}
				}
					else if(cellf1.getStringCellValue().equals("Real Time")) {
						
						System.out.println("Real Time Pwer is not Injected");
					//FileInputStream fisr=new FileInputStream(ompath);  
					//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
//					HSSFWorkbook workbookr=new HSSFWorkbook(fisr);
//					Sheet sheetr = workbookr.getSheet("results");
//					Row rowr1 = sheetr.getRow(9);
//					Cell cellr1 = rowr1.getCell(1);
//					Row rowr2 = sheetr.getRow(10);
//					Cell cellr2 =  rowr2.getCell(1);
//					Row rowr3 = sheetr.getRow(11);
//					Cell cellr3 = rowr3.getCell(1);
//					if(cellr1.toString().equals(null)) {
//						cell3.setCellValue("");
//					}
//					else if(cellr2.toString().equals(null)){
//						cell4.setCellValue("");
//					}
//					else if(cellr3.toString().equals(null))
//					{
//						cell5.setCellValue("");
//					}
//					Cell multfact = rowf1.getCell(10);
//					double mult = multfact.getNumericCellValue();
//					cell3.setCellValue(cellr1.getNumericCellValue()*mult);
//					cell4.setCellValue(cellr2.getNumericCellValue()*mult);
//					cell5.setCellValue(cellr3.getNumericCellValue()*mult);
//					//FileOutputStream fos = new FileOutputStream(f);
//					wb.write(fos);
					//wb.close();
					//fos.close();
				}

			}
			}

		}
	}
}
