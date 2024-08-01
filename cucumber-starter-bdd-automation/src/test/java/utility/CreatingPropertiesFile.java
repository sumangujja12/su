package utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import utility.XLUtils;

public class CreatingPropertiesFile {
	
	//@Given("Test Environment Details Capture") 
   // public static void main(String args[]) throws IOException {
	//@Test
	WebDriver ldriver;
	public CreatingPropertiesFile(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void test() throws IOException{
    	String envPath = "C:\\Environment\\EnvironmentParameters.xls";
    	String verPath="C:\\ABBOutput\\ABBMultiDeviceResultsCompare.xls";
    	String browser=XLUtils.getCellData(envPath, "Environment", 2, 1);
    	String testtype=XLUtils.getCellData(envPath, "Environment", 8, 1);
    	//String aptbuild="10.0.18";
    	//String stagebuild="develop_manual_20220927.1";
    	String aptbuild=XLUtils.getCellData(verPath, "SoftwareVersion", 1, 2);
    	String stagebuild=XLUtils.getCellData(verPath, "SoftwareVersion", 2, 2);
    	String testenv=XLUtils.getCellData(envPath, "Environment", 6, 1);
    	String pltfrm=XLUtils.getCellData(envPath, "Environment", 7, 1);
        //Instantiating the properties file
        Properties props = new Properties();
        //Populating the properties file
        props.put("serenity.project.name", "ABB EL Automation Report");
        props.put("report.customfields.TestSuite", testtype);
        props.put("report.customfields.Browser", browser);
        props.put("report.customfields.APTBuildNum", aptbuild);
        props.put("report.customfields.StageBuildNum", stagebuild);
        props.put("report.customfields.TestEnvironment",testenv);
        props.put("report.customfields.Platform",pltfrm);
        //Instantiating the FileInputStream for output file
        String path = "C:\\cucumber-starter-abbELtool-automation\\serenity.properties";
        FileOutputStream outputStrem = new FileOutputStream(path);
        //Storing the properties file
        props.store(outputStrem, "This is a sample properties file");
        System.out.println("Properties file created......");
    }
}