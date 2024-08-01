
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
import org.openqa.selenium.By;
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


public class Fleet_selectPower {
	
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
	
	

	@Given ("Selecting Power option in Fleet Analysis Screen")
	public void PowerIcon() throws Exception {
	
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
		fo.navigateToFleet();
		Thread.sleep(3000);
		
		fo.selectVesselProfile();
		Thread.sleep(2000);
		
		fo.selectPower();
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("//div[@class='react-datetimerange-picker react-datetimerange-picker--closed react-datetimerange-picker--disabled date']")).click();
		Thread.sleep(2000);
		
	    WebElement datePicker = driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"));
	   datePicker.click();
	    Thread.sleep(2000);
	    
	    WebElement datePicker2 = driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"));
	    datePicker2.click();
	    Thread.sleep(2000);
	    
	    WebElement selectYear = driver.findElement(By.xpath("//button[normalize-space()='2022']"));
	    selectYear.click();
	    Thread.sleep(2000);
	    
	   WebElement selectMonth = driver.findElement(By.xpath("//abbr[@aria-label='February 2022']"));
	   selectMonth.click();
	   Thread.sleep(2000);
	    
	    WebElement selectFromDate = driver.findElement(By.xpath("//abbr[@aria-label='February 1, 2022']"));
	    selectFromDate.click();
	    Thread.sleep(2000);
	    
	   WebElement selectToDate1 = driver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[29]"));
	    selectToDate1.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = driver.findElement(By.xpath("//button[@id='applyRangeButton']"));
	    apply.click();
	   Thread.sleep(2000);  
	    
	    WebElement proceed = driver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
	   proceed.click();
	    Thread.sleep(2000);  
		
		//fo.selectDatePicker();
		//Thread.sleep(2000);
		
		//fo.selectMonth();
		//Thread.sleep(2000);
		
		//fo.gridcheck1();
		//Thread.sleep(2000);
		
		//fo.gridcheck1();
		//Thread.sleep(2000);
		
		//fo.gridcheck2();
		//Thread.sleep(2000);--/
		
		
	}
}


