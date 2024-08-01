package starter.Cloud.Stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverInitialize.BaseClassBO;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import pages.Cloud.Engineovwpage;
import pages.Cloud.LoginPageBO;

public class Engineovwtest {
WebDriver driver;
	
	
	/*--@After(order = 0)
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
	}*/
	
	
	//@Test
	@Given ("Select Engine Overview icon form Left side menu")
	public void Engineovw() throws Exception {
	
		BaseClassBO bo = new BaseClassBO();
		this.driver= bo.seldriver();
		LoginPageBO sp= new LoginPageBO(driver);
		sp.setUserName();
		Thread.sleep(3000);
		sp.setUserPassword();
		Thread.sleep(5000);	
		sp.submitLogin();
		Thread.sleep(30000);
		Engineovwpage st=new Engineovwpage(driver);
		st.Engineovwicon();
		Thread.sleep(5000);	
		//st.selectFleet1();
		//Thread.sleep(5000);
		//st.selectEngineVesselInfocard2();
		driver.quit();
		
	}
	
}
