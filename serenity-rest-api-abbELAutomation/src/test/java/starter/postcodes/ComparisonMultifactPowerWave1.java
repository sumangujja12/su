package starter.postcodes;


import static org.assertj.core.api.Assertions.assertThat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.assertj.core.api.SoftAssertions;
import org.json.*;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import net.minidev.json.parser.ParseException;
import net.serenitybdd.rest.SerenityRest;
import utility.XLUtils;



public class ComparisonMultifactPowerWave1 {

		String exlpath = "C:\\Environment\\EnvironmentParameters.xls";
		String outpath = "C:\\ABBOutput\\PowerWave1Values.xls";
		String ompath = "C:\\Environment\\Omicron-Parameters.xls";
		XLUtils xlUtil1 = new XLUtils(outpath);
		XLUtils xlUtil2 = new XLUtils(exlpath);
		XLUtils xlUtil3 = new XLUtils(ompath);
		String url = null;
		String plant=null;
		String widget=null;
		String options=null;
		String plantType=null;
		String token=null;
		
		@Test
		//@Given("To verify the Power widget for Wave 1 multifactor Comparison")
		public void multifactorCurrentWave1() throws ParseException, JsonProcessingException, IOException,JSONException, InterruptedException {
			
        String testEnv= XLUtils.getCellData(exlpath, "MainEnvironment", 3, 1);
			
			if (testEnv.equalsIgnoreCase("GlobalDevTest"))
			{
				 url = XLUtils.getCellData(exlpath, "Wave1", 28, 1);
				 plant = "/plants/"+XLUtils.getCellData(exlpath, "Wave1", 29, 1);
				 widget = "/widget/"+XLUtils.getCellData(exlpath, "Wave1", 34, 1);
				 options = "?isOptions="+XLUtils.getCellData(exlpath, "Wave1",31, 1);
				 plantType = "&plantType="+XLUtils.getCellData(exlpath, "Wave1", 30, 1);
				 token = XLUtils.getCellData(exlpath, "Wave1", 35, 1);
				
			}
			
			else if(testEnv.equalsIgnoreCase("GlobalStage"))
			{
			 url = XLUtils.getCellData(exlpath, "Wave1", 19, 1);
			 plant = "/plants/"+XLUtils.getCellData(exlpath, "Wave1", 20, 1);
			 widget = "/widget/"+XLUtils.getCellData(exlpath, "Wave1", 25, 1);
			 options = "?isOptions="+XLUtils.getCellData(exlpath, "Wave1",22, 1);
			 plantType = "&plantType="+XLUtils.getCellData(exlpath, "Wave1", 21, 1);
			 token = XLUtils.getCellData(exlpath, "Wave1", 26, 1); 
			}
			
			else if(testEnv.equalsIgnoreCase("GlobalProduction"))
			{
				 url = XLUtils.getCellData(exlpath, "Wave1", 37, 1);
				 plant = "/plants/"+XLUtils.getCellData(exlpath, "Wave1", 38, 1);
				 widget = "/widget/"+XLUtils.getCellData(exlpath, "Wave1", 43, 1);
				 options = "?isOptions="+XLUtils.getCellData(exlpath, "Wave1",40, 1);
				 plantType = "&plantType="+XLUtils.getCellData(exlpath, "Wave1", 39, 1);
				 token = XLUtils.getCellData(exlpath, "Wave1", 44, 1);
				
			}
			
			String response = SerenityRest.given()
					.headers(
							"Authorization",
							"Bearer "+token,
							"Accept",
							ContentType.JSON)
					.when()
					//.get("https://electrificationapi-aps-stage-01.azurewebsites.net/api/plants/ae7e7a79-3044-450a-8e70-6cc55e75f692/widget/32973b2e-7255-4c3d-9922-19619a320c0b?isOptions=true&plantType=EL")
					.get(url+plant+widget+options+plantType)
					.then()
					.extract()
					.response().asString();
			System.out.println("----------------------------------------");
			JsonPath path = new JsonPath(response);
			System.out.println(response.toString());
			System.out.println(path.getString("value.data.summary.devices["+0+"].name"));
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheetout = wb.createSheet("APIPower");
			File f = new File(outpath);
			File f1 = new File(exlpath);
			FileInputStream inputStream = new FileInputStream(f1);
			try (Workbook wb1 = new HSSFWorkbook(inputStream)) {
				Sheet sheet1 =  wb1.getSheet("SimulatorInput");
				int deviceCount = path.getInt("value.data.summary.devices.size()");
				System.out.println(deviceCount);
				for(int i=0;i<deviceCount;i++) {
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

//						if(cell0.getNumericCellValue()==cell3.getNumericCellValue())
//						{
//
//							cellout1.setCellValue("PASS");
//
//							wb.write(fos);
//						}
//						else
//							cellout1.setCellValue("FAIL");
//
//						wb.write(fos);
//						if(cell1.getNumericCellValue()==cell4.getNumericCellValue())
//						{
//							cellout2.setCellValue("PASS");
//
//							wb.write(fos);
//
//						}
//						else
//							cellout2.setCellValue("FAIL");
//
//						wb.write(fos);
//						if(cell2.getNumericCellValue()==cell5.getNumericCellValue())
//						{
//							cellout3.setCellValue("PASS");
//
//							wb.write(fos);
//						}
//						else
//							cellout3.setCellValue("FAIL");
//
//						wb.write(fos);


						//wb.close();
						//fos.close();
					}
					}
						else if(cellf1.getStringCellValue().equals("Real Time")) {
							
							System.out.println("Real Time Pwer is not Injected");
						
					}

				}
				}

			}
		}
	}


