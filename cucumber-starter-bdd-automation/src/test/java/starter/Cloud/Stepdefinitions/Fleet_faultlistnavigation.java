package starter.Cloud.Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverInitialize.BaseClassBO;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import pages.Cloud.LoginPageBO;
import pages.Cloud.fleetOverview;

public class Fleet_faultlistnavigation {
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
	
	

	@Given ("Verify the Navigation from  Fault list to other screens in Fleet Analysis Screen")
	public void faultList() throws Exception {
		
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
		
		           
		fo.selectFaultList();
		Thread.sleep(2000);
		
		fo.faultListsearch();
		Thread.sleep(2000);
		
		WebElement selectfl = driver.findElement(By.xpath("//*[@id=\"simple-tab-2\"]"));
	    selectfl.click();
		
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
	    
	    WebElement proceed = driver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]  "));
	    proceed.click();
	    Thread.sleep(2000);  
	    
	    fo.selectKPI();
		Thread.sleep(2000);
		
		fo.selectVesselProfile();
		Thread.sleep(2000);
		
		fo.selectFaultList();
		Thread.sleep(2000);
		
		fo.breadCrumb();
		Thread.sleep(2000);
	}
}
