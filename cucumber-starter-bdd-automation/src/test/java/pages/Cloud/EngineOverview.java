package pages.Cloud;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.screenplay.ui.Select;
import utility.XLUtils;

public class EngineOverview {
	WebDriver ldriver;
	public EngineOverview(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickEngineIcon() throws InterruptedException{
		
		ldriver.findElement(By.xpath("//div[@aria-label='Engine overview']")).click();
		Thread.sleep(2000);
		
	}
	
	public void selectEngineOverview() throws InterruptedException{

//		WebElement engineOverview = ldriver.findElement(By.xpath("//div[@id='dashboard_page']"));
//		engineOverview.click();
//		Thread.sleep(2000);
//		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Actions action = new Actions(ldriver);
//		action.sendKeys(Keys.ENTER);
//		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement engineOverview = ldriver.findElement(By.xpath("//div[@id='dashboard_page']"));
		Actions action = new Actions(ldriver);
		Thread.sleep(2000);

		action.doubleClick(engineOverview).perform();		
		Thread.sleep(2000);		
	}
	
	
	public void clickFleet() throws InterruptedException{		
		WebElement fleet = ldriver.findElement(By.xpath("//div[@id='fleetDDL']"));
		fleet.click();
		Thread.sleep(2000);	 			
	}
	
	
	
	public void selectFleet() throws InterruptedException{
		 
		// Locate the dropdown element
		WebElement dropdown = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		 
		// Create Actions object
		Actions actions = new Actions(ldriver);
		 
		// Move to the dropdown and click on it
		actions.moveToElement(dropdown).click().build().perform();
		 
		Thread.sleep(1000); 
		 
		// Move to the desired option and click on it
		WebElement desiredOption = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		actions.moveToElement(desiredOption).click().build().perform();
		Thread.sleep(4000);
		
	}
	
	
	
	public void clickShip() throws InterruptedException{
		
		WebElement ship = ldriver.findElement(By.xpath("//div[contains(text(),'Select Ship')]"));
		 
		// Create Actions object
		//Actions actions = new Actions(ldriver);
		 ship.click();
		// Move to the dropdown and click on it
		//actions.moveToElement(ship).click().build().perform();
		 
		Thread.sleep(1000); 
		
		
		
		
//		WebElement ship = ldriver.findElement(By.xpath("//div[contains(text(),'Select Ship')]"));
//		// //div[contains(text(),'Select Ship')]
//		// //li[text()='Select Ship']
//		ship.click();
//		Thread.sleep(2000);
	}
	

	public void selectShip() throws InterruptedException{
		 
		// Locate the dropdown1 element
		WebElement dropdown = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		 
		// Create Actions object
		Actions actions = new Actions(ldriver);
		 
		// Move to the dropdown1 and click on it
		actions.moveToElement(dropdown).click().build().perform();
		 
		Thread.sleep(2000); 
		 
		// Move to the desired option and click on it
		WebElement desiredOption = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		actions.moveToElement(desiredOption).click().build().perform();	
	}
	
	
	public void clickEngine() throws InterruptedException{
		
		WebElement ship = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
		ship.click();
		Thread.sleep(2000);
	}
	

	public void selectEngine() throws InterruptedException{
		 
		// Locate the dropdown1 element
		WebElement dropdown = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		 
		// Create Actions object
		Actions actions = new Actions(ldriver);
		 
		// Move to the dropdown1 and click on it
		actions.moveToElement(dropdown).click().build().perform();
		 
		Thread.sleep(2000); 
		 
		// Move to the desired option and click on it
		WebElement desiredOption = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		actions.moveToElement(desiredOption).click().build().perform();	
	}
	
	 
		
		public void selectFleet1() throws InterruptedException{		
			WebElement selectFleetIcon = ldriver.findElement(By.xpath("//div[@id='fleetDDL']"));
		    selectFleetIcon.click();
		    Thread.sleep(3000);
		    
			WebElement clickBabylon = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
			clickBabylon.click();
		    Thread.sleep(3000);  
		    
			WebElement selectShip = ldriver.findElement(By.xpath("//div[contains(text(),'Select Ship')]"));
			selectShip.click();
		    Thread.sleep(3000);
		    
			WebElement clickCamalTwin = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
			clickCamalTwin.click();
		    Thread.sleep(3000);
		  
			WebElement selectEngine = ldriver.findElement(By.xpath("//div[contains(text(),'Select Engine')]"));
			selectEngine.click();
		    Thread.sleep(3000);
		    
			WebElement click99935 = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
			click99935.click();
		    Thread.sleep(3000);
		  //*[@id="menu-"]/div[3]/ul/li[2]  
		}
		
		public void selectEngineVesselInfocard() throws InterruptedException{
			WebElement vesselCard = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]"));
		    Actions actions = new Actions(ldriver);
		    actions.doubleClick(vesselCard).perform();
			vesselCard.click();
		    Thread.sleep(3000);
		    WebElement textCheck = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div"));
			// WebElement textCheck = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]"));
			    Actions act1 = new Actions(ldriver);
			    act1.doubleClick(textCheck).perform();
			    act1.click().build().perform();
			    Thread.sleep(2000);
			
			
			    String textValue = textCheck.getText();
			    System.out.println("Text value: " + textValue);
			    
			    //Assert.assertEquals(textValue, "Wind speed : 26.80 kn");
			    
			    Assert.assertEquals(textValue, "Speed Over Ground : 15.94 kn \n\r"
			    		+"Speed Through Water : 0.00 kn\n\r "
			    		+"Course Over Ground : 87.10 deg\n\r"
			    		+"Wind speed : 26.80 kn");
			    
			    
			   // Assert.assertEquals(textValue, "Course Over Ground : 87.10 deg");
			    
		}
		
		public void selectEngineVesselInfocard1() throws InterruptedException{
			WebElement vesselCard = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div"));
		    Actions actions = new Actions(ldriver);
		    actions.doubleClick(vesselCard).perform();
			vesselCard.click();
		    Thread.sleep(3000);
			
			 WebElement textCheck = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div"));
			    Actions act1 = new Actions(ldriver);
			    act1.doubleClick(textCheck).perform();
			    act1.click().build().perform();
			    Thread.sleep(2000);
			
			
			    String textValue = textCheck.getText();
			    System.out.println("Text value: " + textValue);
			    
			    Assert.assertEquals(textValue, "Wind speed : 26.80 kn");
		}
		
		public void selectEngineVesselInfocard2() throws InterruptedException{
			WebElement vesselCard = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[2]/div/div[1]/p"));
		    Actions actions = new Actions(ldriver);
		    actions.doubleClick(vesselCard).perform();
			vesselCard.click();
		    Thread.sleep(3000);
			
			 WebElement textCheck = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[2]/div/div[1]/p"));
			    Actions act1 = new Actions(ldriver);
			    act1.doubleClick(textCheck).perform();
			    act1.click().build().perform();
			    Thread.sleep(2000);
			
			
			    String textValue = textCheck.getText();
			    System.out.println("Text value: " + textValue);
			    
			    Assert.assertEquals(textValue, "Vessel Info");
		}
	
	
	
	
	
}
