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
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import net.minidev.json.parser.ParseException;
import net.serenitybdd.rest.SerenityRest;
import utility.XLUtils;
import generic.ConvertCSVtoExcel;


public class ComparisonMultifactCurrentWave1 {

		String exlpath = "C:\\Environment\\EnvironmentParameters.xls";
		String outpath = "C:\\ABBOutput\\CurrentWave1Values.xls";
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
		int deviceCount = 0;
		public  String simDevName;
		
		//@Test
		@Given("To verify the Current widget for Wave 1 multifactor Comparison")
		public void multifactorCurrentWave1() throws ParseException, JsonProcessingException, IOException,JSONException, InterruptedException {
			
			generic.ConvertCSVtoExcel cs = new generic.ConvertCSVtoExcel();
			cs.ConvertCSVToXls();
        String testEnv= XLUtils.getCellData(exlpath, "MainEnvironment", 3, 1);
			
			if (testEnv.equalsIgnoreCase("GlobalDevTest"))
			{
				 url = XLUtils.getCellData(exlpath, "Wave1", 28, 1);
				 plant = "/plants/"+XLUtils.getCellData(exlpath, "Wave1", 29, 1);
				 widget = "/widget/"+XLUtils.getCellData(exlpath, "Wave1", 33, 1);
				 options = "?isOptions="+XLUtils.getCellData(exlpath, "Wave1",31, 1);
				 plantType = "&plantType="+XLUtils.getCellData(exlpath, "Wave1", 30, 1);
				 token = XLUtils.getCellData(exlpath, "Wave1", 35, 1);
				
			}
			
			else if(testEnv.equalsIgnoreCase("GlobalStage"))
			{
			url = XLUtils.getCellData(exlpath, "Wave1", 19, 1);
			plant = "/plants/"+XLUtils.getCellData(exlpath, "Wave1", 20, 1);
			widget = "/widget/"+XLUtils.getCellData(exlpath, "Wave1", 24, 1);
			options = "?isOptions="+XLUtils.getCellData(exlpath, "Wave1",22, 1);
			plantType = "&plantType="+XLUtils.getCellData(exlpath, "Wave1", 21, 1);
			token = XLUtils.getCellData(exlpath, "Wave1", 26, 1); 	
			}
			
			else if(testEnv.equalsIgnoreCase("GlobalProduction"))
			{
				 url = XLUtils.getCellData(exlpath, "Wave1", 37, 1);
				 plant = "/plants/"+XLUtils.getCellData(exlpath, "Wave1", 38, 1);
				 widget = "/widget/"+XLUtils.getCellData(exlpath, "Wave1", 42, 1);
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
			HSSFSheet sheetout = wb.createSheet("APICurrent");
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
					cellheader2.setCellValue("iL1 Input");
					Cell cellheader3 = rowheader.createCell(2);
					cellheader3.setCellValue("iL2 Input");
					Cell cellheader4 = rowheader.createCell(3);
					cellheader4.setCellValue("iL3 Input");
					Cell cellheader5 = rowheader.createCell(4);
					cellheader5.setCellValue("iL1 Output");
					Cell cellheader6 = rowheader.createCell(5);
					cellheader6.setCellValue("iL2 Output");
					Cell cellheader7 = rowheader.createCell(6);
					cellheader7.setCellValue("iL3 Output");
					Cell cellheader8 = rowheader.createCell(7);
					cellheader8.setCellValue("iL1 Result");
					Cell cellheader9 = rowheader.createCell(8);
					cellheader9.setCellValue("iL2 Result");
					Cell cellheader10 = rowheader.createCell(9);
					cellheader10.setCellValue("iL3 Result");
				
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

				    if(path.get("value.data.summary.devices["+i+"].iL1")==null){
						cell0.setCellValue(0);
					}else {
						cell0.setCellValue(path.getDouble("value.data.summary.devices["+i+"].iL1"));
					}
					if(path.get("value.data.summary.devices["+i+"].iL2")==null) {
						cell1.setCellValue(0);
					}else {
						cell1.setCellValue(path.getDouble("value.data.summary.devices["+i+"].iL2"));
					}
					if(path.get("value.data.summary.devices["+i+"].iL3")==null) {
						cell2.setCellValue(0);
					}else
					{
						cell2.setCellValue(path.getDouble("value.data.summary.devices["+i+"].iL3"));
					}

					FileOutputStream fos = new FileOutputStream(f);
					wb.write(fos);

				}

			}
		}
		
		//@Test
		@Then ("Validate Current APIWave1")
		public void currentDatavalidation() throws IOException {
			System.out.println("Executed second method");
			int envRowNum = xlUtil2.getRowCount("DeviceSel");
			int simRowNum = xlUtil2.getRowCount("SimulatorInput");
			int outputRowNum = xlUtil1.getRowCount("APICurrent");
			System.out.println("OutputRowNum"+outputRowNum);
			String d1= "";
			String d2= "";
			String d3= "";
			
			System.out.println(deviceCount);
			for(int i=1;i<=deviceCount;i++) {
				
				//System.out.println("going inside first loop");
				String UIdeviceName = XLUtils.getCellData(outpath,"APICurrent",i,0);
				 
				System.out.println("UIdeviceName111: "+UIdeviceName);
				 for(int j=2;j<=envRowNum;j++) {
					// System.out.println("inside second loop");
					 String XLdeviceName = XLUtils.getCellData(exlpath,"DeviceSel",j,3);
					System.out.println(XLdeviceName);
					 if(UIdeviceName.equalsIgnoreCase(XLdeviceName)){
						 
						 System.out.println("Device name matched");
						 
						 if(xlUtil2.getCellData("DeviceSel",j,7).equalsIgnoreCase("Real Time")) {
							 d1 =xlUtil3.getCellData("results",6,1);
								System.out.println("******d1:"+d1);
								d2 = xlUtil3.getCellData("results",7,1);
								System.out.println(d2);
								d3 =xlUtil3.getCellData("results",8,1);
								System.out.println(d3);
								
								 int convertedmFactor=0;
								 for(int b=2;b<=envRowNum;b++) { 
									 if((xlUtil2.getCellData("DeviceSel",b,3).equalsIgnoreCase(UIdeviceName))) {
										 String currentMFactor = xlUtil2.getCellData("DeviceSel",b,11);
										 convertedmFactor = Integer.parseInt(currentMFactor);
										 System.out.println("*******convertedmFactor: "+convertedmFactor+"  UIdeviceName:"+UIdeviceName+"xlUtil2 Device: "+xlUtil2.getCellData("DeviceSel",b,3));
										 break;
									 }
								 }	
								 double convertedd1=Double.valueOf(d1);
								 System.out.println("************convertedd1:"+convertedd1);
								 double convertedd2=Double.valueOf(d2);
								 double convertedd3=Double.valueOf(d3);
					
								 double multipliedd1=convertedd1*convertedmFactor;
								 System.out.println("***********multipliedd1:"+multipliedd1);
								 double multipliedd2=convertedd2*convertedmFactor;
								 double multipliedd3=convertedd3*convertedmFactor;
								 
								 double output1=0,output2=0,output3=0, devValue=0, convDev=0;
								 String deviation = xlUtil2.getCellData("DeviceSel",j,13);
								 if(deviation!="") {
									 convDev = Double.valueOf(deviation);
								 }
								 
								 if((xlUtil1.getCellData("APICurrent", i, 4).equalsIgnoreCase("No Value"))==false) {
								  output1 = Double.valueOf(xlUtil1.getCellData("APICurrent", i, 4));
								  System.out.println("************op1:"+output1);
								  if(convDev!=0) {
									  devValue = (output1*convDev)/100;
								  }
								 }
								 if((xlUtil1.getCellData("APICurrent", i, 5).equalsIgnoreCase("No Value"))==false) {
								  output2 = Double.valueOf(xlUtil1.getCellData("APICurrent",i, 5));
								  if(convDev!=0) {
									  devValue = (output2*convDev)/100;
								  }
								 }
								 if((xlUtil1.getCellData("APICurrent", i, 6).equalsIgnoreCase("No Value"))==false) {
								  output3 = Double.valueOf(xlUtil1.getCellData("APICurrent", i, 6));	
								  if(convDev!=0) {
									  devValue = (output3*convDev)/100;
								  }
								 }
								 System.out.println("devValue"+devValue);	 
							 System.out.println("Device is realtime");
							 if(xlUtil2.getCellData("DeviceSel",j,9).equalsIgnoreCase("Omicron")) {
								 System.out.println("Injection is yes");
								 System.out.println("output1-devValue"+(output1-devValue));
								 System.out.println("output1+devValue"+(output1+devValue));
								// String v1Input = xlUtil3.getCellData("results",3,1);
								// System.out.println(v1Input);
								 if(output1==multipliedd1 || ((output1-devValue)<=multipliedd1) && (multipliedd1<=(output1+devValue))){
									 
									 xlUtil1.setCellDoubleVal("APICurrent",i,1,multipliedd1);
										xlUtil1.setCellData("APICurrent",i,7,"PASS");
									}
										else{
											System.out.println("comparing failed");
											xlUtil1.setCellDoubleVal("APICurrent",i,1,multipliedd1);
											xlUtil1.setCellData("APICurrent",i,7,"FAIL");	
										}
								// String v2Input = xlUtil3.getCellData("results",4,1);
								// System.out.println(v2Input);
								 if(output2==multipliedd2 || ((output2-devValue)<=multipliedd2) && (multipliedd2<=(output2+devValue))) {
									xlUtil1.setCellDoubleVal("APICurrent",i,2,multipliedd2);
										xlUtil1.setCellData("APICurrent",i,8,"PASS");
									}
										else{
											System.out.println("comparing failed");
											 xlUtil1.setCellDoubleVal("APICurrent",i,2,multipliedd2);
											xlUtil1.setCellData("APICurrent",i,8,"FAIL");	
										}
							
								// String v3Input = xlUtil3.getCellData("results",5,1);
								 //System.out.println(v3Input);
								 if(output3==multipliedd3 || ((output3-devValue)<=multipliedd3) && (multipliedd3<=(output3+devValue))){
									xlUtil1.setCellDoubleVal("APICurrent",i,3,multipliedd3);
									xlUtil1.setCellData("APICurrent",i,9,"PASS");
									
								}
									else{
										System.out.println("comparing failed");
										xlUtil1.setCellDoubleVal("APICurrent",i,3,multipliedd3);
										xlUtil1.setCellData("APICurrent",i,9,"FAIL");	
									}
								 //xlUtil1.setCellData("Current",i,10,"Yes");
							 }
							
							 else{
									System.out.println(" Data is not injected to "+XLdeviceName);
									//xlUtil1.setCellData("Current",i,10,"No");
								}

						 }
						 // Completion of Real time device logic
						
							else if(xlUtil2.getCellData("DeviceSel",j,7).equalsIgnoreCase("Simulator")) {
								
							for(int a=1;a<deviceCount;a++) {
								for(int k=3;k<=simRowNum;k++) {
									 simDevName = xlUtil2.getCellData("SimulatorInput",k,1);
									 String i1 = xlUtil2.getCellData("SimulatorInput", k,5);
									 int convertedmFactor=0;
									 
									 if(simDevName.equalsIgnoreCase(UIdeviceName)) {
										 
									 for(int b=2;b<=envRowNum;b++) { 
										 if((xlUtil2.getCellData("DeviceSel",b,3).equalsIgnoreCase(UIdeviceName))) {
											 String currentMFactor = xlUtil2.getCellData("DeviceSel",b,11);
											 convertedmFactor=Integer.parseInt(currentMFactor);
											 System.out.println("*******convertedmFactor: "+convertedmFactor+"  device:"+simDevName+"xlUtil2 Device: "+xlUtil2.getCellData("DeviceSel",b,3));
											 break;
										 }
									 }	 					
									 
									 double convertedi1=Double.valueOf(i1);
									 double multipliedi1=convertedi1*convertedmFactor;
									 double output1 = 0;
									 if((xlUtil1.getCellData("APICurrent", i,4).equalsIgnoreCase("No Value"))==false){
									  output1 = Double.valueOf(xlUtil1.getCellData("APICurrent", i,4));
									 }
								//	if(simDevName.equalsIgnoreCase(UIdeviceName)) {
										
										xlUtil1.setCellDoubleVal("APICurrent",i,1,multipliedi1);
										if(output1==multipliedi1) {
											xlUtil1.setCellData("APICurrent",i,7,"PASS");
										}

										else{
											xlUtil1.setCellData("APICurrent",i,7,"FAIL");	
										}
										
										String i2 = xlUtil2.getCellData("SimulatorInput", k,6);
										double convertedi2=Double.valueOf(i2);
										double multipliedi2=convertedi2*convertedmFactor;
										System.out.println("output2 string from excel:"+xlUtil1.getCellData("APICurrent", i,5));
										 double output2 = 0;
										 if((xlUtil1.getCellData("APICurrent", i,5).equalsIgnoreCase("No Value"))==false){
										 output2 = Double.valueOf(xlUtil1.getCellData("APICurrent", i,5));
										 }
										xlUtil1.setCellDoubleVal("APICurrent",i,2,multipliedi2);
									

										if(output2==multipliedi2) {
											xlUtil1.setCellData("APICurrent",i,8,"PASS");
										}

										else{
											xlUtil1.setCellData("APICurrent",i,8,"FAIL");	
										}
										String i3 = xlUtil2.getCellData("SimulatorInput", k,7);
										double convertedi3=Double.valueOf(i3);
										double multipliedi3=convertedi3*convertedmFactor;
										 double output3 = 0;
										 if((xlUtil1.getCellData("APICurrent", i,6).equalsIgnoreCase("No Value"))==false){
										  output3 = Double.valueOf(xlUtil1.getCellData("APICurrent", i,6));
										 }
										xlUtil1.setCellDoubleVal("APICurrent",i,3,multipliedi3);
										if(output3==multipliedi3) {
											xlUtil1.setCellData("APICurrent",i,9,"PASS");
										}

										else{
											xlUtil1.setCellData("APICurrent",i,9,"FAIL");	
										}

									}
								}

							}
							System.out.println("Data is not simulated to "+simDevName);
								// completion of Simulator logic
					}
				}

				 }
			}
			
			
			
			}	
			
		}
		
		


