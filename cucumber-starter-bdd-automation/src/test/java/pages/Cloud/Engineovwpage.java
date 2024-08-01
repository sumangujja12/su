package pages.Cloud;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Engineovwpage {
	WebDriver ldriver;





	public Engineovwpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void Engineovwicon(){
		ldriver.findElement(By.id("Engine overview_1")).click();

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
		
		 WebElement textCheck = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]"));
		    Actions act1 = new Actions(ldriver);
		    act1.doubleClick(textCheck).perform();
		    act1.click().build().perform();
		    Thread.sleep(2000);
		
		
		    String textValue = textCheck.getText();
		    System.out.println("Text value: " + textValue);
		    
		    Assert.assertEquals(textValue, "Speed Over Ground : 15.94 kn\r\n"
		    		+ "Speed Through Water : 0.00 kn\r\n"
		    		+ "Course Over Ground : 87.10 deg\r\n"
		    		+ "Wind speed : 26.80 kn");
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
