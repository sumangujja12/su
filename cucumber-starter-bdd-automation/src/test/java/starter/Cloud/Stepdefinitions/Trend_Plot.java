package starter.Cloud.Stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverInitialize.BaseClassBO;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import pages.Cloud.LoginPageBO;
import pages.Cloud.Trendchart;

public class Trend_Plot {
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
	
	
	
	@Given ("Select mouseover points from Favorite dropdown of Trendchart screen")
	public void Engineovw() throws Exception {
	
		BaseClassBO bo = new BaseClassBO();
		this.driver= bo.seldriver();
		LoginPageBO sp= new LoginPageBO(driver);
		sp.setUserName();
		Thread.sleep(3000);
		sp.setUserPassword();
		Thread.sleep(3000);	
		sp.submitLogin();
		Thread.sleep(20000);
		Trendchart st=new Trendchart(driver);
		st.Trendicon();
		Thread.sleep(5000);	
		st.favoriteTrend1();
		Thread.sleep(10000);
		//st.graphHover2();
		//Thread.sleep(8000);
		st.graphHover();
		//st.graphHover4();
		Thread.sleep(8000);
		System.out.print("Favoritelist is PLotted");
		//st.graphHover3();
		Thread.sleep(8000);
		
		
		
	}
}
