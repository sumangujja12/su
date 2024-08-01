package pages.Cloud;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Alarmlistpage {
	WebDriver ldriver;

	public Alarmlistpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void Alarmicon(){
		ldriver.findElement(By.id("Alarm list_4")).click();

	}

	  public void favoritedata2() throws InterruptedException{
		Actions ac1 = new Actions(ldriver);
	
		WebElement st1=ldriver.findElement(By.xpath("//div[@id='fleetDDL']"));
		ac1.moveToElement(st1).click().perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(9000);
		//ac1.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(9000);
		ac1.sendKeys(Keys.ENTER).perform();
		
	}
	  public void shilpselection() throws InterruptedException{
			Actions ac2 = new Actions(ldriver);
		
			WebElement st4=ldriver.findElement(By.xpath("//div[@aria-label='Select ship']"));
			ac2.moveToElement(st4).click().perform();
			Thread.sleep(9000);
			ac2.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(9000);
			//ac2.sendKeys(Keys.ARROW_DOWN).perform();
			//Thread.sleep(9000);
			ac2.sendKeys(Keys.ENTER).perform();
			
		}
	  public void selectALDatePicker() throws InterruptedException{
		    WebElement clcikDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[1]/div"));
		    clcikDate.click();
		    Thread.sleep(8000);
		    
		    WebElement clcikDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[1]/button[3]"));
		    clcikDate1.click();
		    Thread.sleep(8000);
		    
		    WebElement clcikDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[1]/button[3]"));
		    clcikDate2.click();
		    Thread.sleep(8000);
		    
		    WebElement clickYear = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/button[2]"));
		    clickYear.click();
		    Thread.sleep(3000);
		    
		    WebElement clickMonth1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/button[6]"));
		    clickMonth1.click();
		    Thread.sleep(3000);
		    
		    WebElement clickMonthDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[16]"));
		    clickMonthDate1.click();
		    Thread.sleep(3000);
		    
		    WebElement clickMonthDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[28]"));
		    clickMonthDate2.click();
		    Thread.sleep(3000);
		    
		  
		  
		    WebElement clickApply = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
		    clickApply.click();
		    Thread.sleep(3000);
		    
		    WebElement clickProceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
		    clickProceed.click();
		    Thread.sleep(3000);
		}
	  
	  public void alarmValiate() throws InterruptedException{
		    WebElement textCheck01 = ldriver.findElement(By.xpath("//*[@id=\"dashbaord_alarm_grid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		    Actions actions = new Actions(ldriver);
		    actions.doubleClick(textCheck01).perform();
		    actions.click().build().perform();
		    Thread.sleep(2000);
		    
		    String textValue01 = textCheck01.getText();
		    System.out.println("Text value: " + textValue01);
		    
		    Assert.assertEquals("The text value is expected.", "Auxiliary Servo Oil Pump - Suction Pressure Low", textValue01);
		}
	  
	  public void alarmValiate2() throws InterruptedException{
		    WebElement textCheck012 = ldriver.findElement(By.xpath("//*[@id=\"dashbaord_alarm_grid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div[1]"));
		    Actions actions = new Actions(ldriver);
		    actions.doubleClick(textCheck012).perform();
		    actions.click().build().perform();
		    Thread.sleep(2000);
		    
		    String textValue012 = textCheck012.getText();
		    System.out.println("Text value: " + textValue012);
		    
		    Assert.assertEquals("The text value is expected.", "false", textValue012);
		}
	  public void alarmValiate3() throws InterruptedException{
		    WebElement textCheck012 = ldriver.findElement(By.xpath("//*[@id=\"dashbaord_alarm_grid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div[1]"));
		    Actions actions = new Actions(ldriver);
		    actions.doubleClick(textCheck012).perform();
		    actions.click().build().perform();
		    Thread.sleep(2000);
		    
		    String textValue012 = textCheck012.getText();
		    System.out.println("Text value: " + textValue012);
		    
		    Assert.assertEquals("The text value is expected.", "false", textValue012);
		}
	  
	  public void alarmValiate4() throws InterruptedException{
		    WebElement textCheck012 = ldriver.findElement(By.xpath("//*[@id=\"dashbaord_alarm_grid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div[1]"));
		    Actions actions = new Actions(ldriver);
		    actions.doubleClick(textCheck012).perform();
		    actions.click().build().perform();
		    Thread.sleep(2000);
		    
		    String textValue012 = textCheck012.getText();
		    System.out.println("Text value: " + textValue012);
		    
		    Assert.assertEquals("The text value is expected.", "false", textValue012);
		}
}
