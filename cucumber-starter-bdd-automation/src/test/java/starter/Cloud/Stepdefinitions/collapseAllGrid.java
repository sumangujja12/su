
package starter.Cloud.Stepdefinitions;


import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.paulhammant.ngwebdriver.ByAngularModel;
import driverInitialize.BaseClassBO;
import generic.MyScreenRecorder;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import pages.Cloud.EngineOverview;
import pages.Cloud.fleetOverview;
import pages.Cloud.LoginPageBO;
import utility.XLUtils;


public class collapseAllGrid {
	
	WebDriver driver;
	
	
	@After(order = 0)
    public void quit() throws InterruptedException {
		
		
		try {		
		Thread.sleep(3000);
		driver.quit();
	}
			
		catch(NullPointerException e)
		{			
			System.out.print("Driver close"); 
		}
	}
	
	@After(order = 1)
	public void beforeorafter(Scenario sc) {
		System.out.println("this will run after the test scenario");
		try {
		if(sc.isFailed()) {
			String screenshotName = sc.getName().replaceAll(" ","_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath, "image/png", screenshotName);
		}
		}
		
		catch(NullPointerException e) {
			System.out.print("NullPointerException Caught");
		}
	}
	
	
	
	
	@Given ("Verifying Collapse All button functionality in Fleet Overview screen")
	public void collapseGrid() throws Exception {
	
		BaseClassBO bo = new BaseClassBO();
		this.driver= bo.seldriver();
		LoginPageBO sp= new LoginPageBO(driver);
		sp.setUserName();
		Thread.sleep(3000);
		sp.setUserPassword();
		Thread.sleep(5000);	
		sp.submitLogin();
		Thread.sleep(30000);
		
		fleetOverview fo = new fleetOverview(driver);
		fo.clickfleetIcon();
		Thread.sleep(20000);
		
		fo.collapseAll();
		Thread.sleep(2000);
		
	}
}


