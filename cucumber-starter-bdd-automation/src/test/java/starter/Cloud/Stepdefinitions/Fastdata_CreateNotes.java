package starter.Cloud.Stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverInitialize.BaseClassBO;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import pages.Cloud.Fastdatachartpage;
import pages.Cloud.LoginPageBO;

public class Fastdata_CreateNotes {
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
	
	
	
	@Given ("Select Create Notes option from Favorite chart in Fastdatachart screen")
	public void Engineovw() throws Exception {
	
		BaseClassBO bo = new BaseClassBO();
		this.driver= bo.seldriver();
		LoginPageBO sp= new LoginPageBO(driver);
		sp.setUserName();
		Thread.sleep(3000);
		sp.setUserPassword();
		Thread.sleep(3000);	
		sp.submitLogin();
		Thread.sleep(10000);
		Fastdatachartpage st=new Fastdatachartpage(driver);
		st.Fdataicon();
		Thread.sleep(3000);	
		st.favoritedata1();;
		Thread.sleep(3000);	
		st.selectCreateNotes();
		Thread.sleep(3000);
		st.selectSignalName();
		Thread.sleep(3000);
		st.selectSignalDD();
		Thread.sleep(3000);
		st.selectSimply();
		Thread.sleep(3000);
		st.sendKeysName();
		
		Thread.sleep(8000);
		System.out.print("Favoritelist is Created");
		
		
		driver.close();
		
		
		
	}
}
