package pages.Cloud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ch.qos.logback.core.util.Duration;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Trendchart {
	WebDriver ldriver;

	public Trendchart(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void Trendicon(){
		ldriver.findElement(By.id("Trend chart_2")).click();

	}

	public void favoriteTrend() throws InterruptedException{
		Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		
		Thread.sleep(9000);
		
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-collapsed\"]"));
		//ac1.moveToElement(deflt).click().perform();
		//Thread.sleep(9000);
		//WebElement deflt1=ldriver.findElement(By.xpath("//div[@class=\"fav-text\"]"));
		ac1.moveToElement(deflt).click().perform();
		Thread.sleep(15000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();

		WebElement deflt1 = ldriver.findElement(By.xpath("//*[text()='Test2']"));;
		ac1.moveToElement(deflt1).click().perform();
		//.clickAndHold();
		
		//ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		//ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);
		
		
		
	}
	
	public void favorite_Save() throws InterruptedException{
Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		
		Thread.sleep(9000);
		
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-collapsed\"]"));
		//ac1.moveToElement(deflt).click().perform();
		//Thread.sleep(9000);
		//WebElement deflt1=ldriver.findElement(By.xpath("//div[@class=\"fav-text\"]"));
		ac1.moveToElement(deflt).click().perform();
		Thread.sleep(15000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();

		WebElement deflt1 = ldriver.findElement(By.xpath("//*[text()='Test2']"));;
		ac1.moveToElement(deflt1).click().perform();
		
		WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFavIcon.click();
	    Thread.sleep(5000);
	    
	    WebElement selectSave = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[1]"));
	    selectSave.click();
	    Thread.sleep(5000);
	    
	    
	    
	    WebElement Save = ldriver.findElement(By.xpath("//*[text()='Save']"));
	    Actions action1 = new Actions(ldriver);
	    action1.moveToElement(Save).click().perform();
	   //selectSave.click();
	    Thread.sleep(20000);
	}
	
	public void favorite_Rename() throws InterruptedException{
Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		
		Thread.sleep(9000);
		
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-collapsed\"]"));
		//ac1.moveToElement(deflt).click().perform();
		//Thread.sleep(9000);
		//WebElement deflt1=ldriver.findElement(By.xpath("//div[@class=\"fav-text\"]"));
		ac1.moveToElement(deflt).click().perform();
		Thread.sleep(15000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();

		WebElement deflt1 = ldriver.findElement(By.xpath("//*[text()='Test2']"));;
		ac1.moveToElement(deflt1).click().perform();
		
				
		WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFavIcon.click();
	    Thread.sleep(5000);
	    
	    WebElement Rename = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[4]"));
	    Rename.click();
	    Thread.sleep(5000);
	    
	    WebElement textCheck = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/p[1]"));
	    Actions actions = new Actions(ldriver);
	    actions.doubleClick(textCheck).perform();
	    actions.click().build().perform();
	    Thread.sleep(2000);
	
	
	    String textValue = textCheck.getText();
	    System.out.println("Text value: " + textValue);
	    
	    Assert.assertEquals("The text value is expected.", "Favorite Item Name already exist, please change to a different one", textValue);
	    
	    WebElement sendValueToSaveAs = ldriver.findElement(By.xpath("//*[@id=\"mui-2\"]"));
	    Actions action = new Actions(ldriver);
	    action.click(sendValueToSaveAs).sendKeys("TFA").build().perform();
	    Thread.sleep(8000);
	    
	    WebElement Save = ldriver.findElement(By.xpath("//*[text()='Save']"));
	    Actions action1 = new Actions(ldriver);
	    action1.moveToElement(Save).click().perform();
	   //selectSave.click();
	    Thread.sleep(20000);
	}
	
	public void favorite_Delete() throws InterruptedException{
Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		
		Thread.sleep(9000);
		
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-collapsed\"]"));
		//ac1.moveToElement(deflt).click().perform();
		//Thread.sleep(9000);
		//WebElement deflt1=ldriver.findElement(By.xpath("//div[@class=\"fav-text\"]"));
		ac1.moveToElement(deflt).click().perform();
		Thread.sleep(5000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();

		WebElement deflt1 = ldriver.findElement(By.xpath("//*[text()='Test123456']"));;
		ac1.moveToElement(deflt1).click().perform();
		Thread.sleep(5000);
		WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFavIcon.click();
	    Thread.sleep(5000);
	    
	    WebElement Delete = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[5]"));
	    Delete.click();
	    Thread.sleep(5000);
	    
	    	    
	    WebElement Deleteconfirm = ldriver.findElement(By.xpath("//*[text()='Delete']"));
	    Actions action1 = new Actions(ldriver);
	    action1.moveToElement(Deleteconfirm).click().perform();
	   //selectSave.click();
	    Thread.sleep(20000);
	}
	
	public void favorite_Share() throws InterruptedException{
Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		
		Thread.sleep(9000);
		
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-collapsed\"]"));
		//ac1.moveToElement(deflt).click().perform();
		//Thread.sleep(9000);
		//WebElement deflt1=ldriver.findElement(By.xpath("//div[@class=\"fav-text\"]"));
		ac1.moveToElement(deflt).click().perform();
		Thread.sleep(15000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();

		WebElement deflt1 = ldriver.findElement(By.xpath("//*[text()='Test2']"));;
		ac1.moveToElement(deflt1).click().perform();
		
		WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFavIcon.click();
	    Thread.sleep(5000);
	    
	    WebElement Share = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[6]"));
	    Share.click();
	    Thread.sleep(5000);
	    
	    	    
	    
	}
	
	public void favorite_upload() throws InterruptedException{
		
		
		//Actions ac1 = new Actions(ldriver);
	
		/*WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		
		Thread.sleep(9000);
		
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treeview-toggle-item-visibility\"]"));
		ac1.moveToElement(deflt).click().perform();
		Thread.sleep(9000);
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);*/
		
		WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFavIcon.click();
	    Thread.sleep(5000);
	    
	    WebElement Upload = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[7]"));
	    Upload.click();
	    Thread.sleep(5000);
	    
	    String Filepath="D:\\cucumber-starter-bdd-automation 2\\cucumber-starter-bdd-automation\\TestData\\abc.json";
	  //File f= new File("../WIDEAPI/Favorite_Trend_Delete.json");
	    WebElement path = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[3]/label/img"));
	    Actions action = new Actions(ldriver);
	    action.moveToElement(path).click().perform();
	    action.click(path).sendKeys(Filepath).build().perform();
	    Thread.sleep(8000);
	   // Actions ac2 = new Actions(ldriver);
	    //path.click();
	    //ac2.sendKeys(Filepath);
	    //Thread.sleep(5000);
	    
	   /* WebElement grpname = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[4]/div[1]/div/div[2]/div"));
	    grpname.click();
         ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);
	    Thread.sleep(5000);
	    
	    WebElement fname = ldriver.findElement(By.xpath("//*[@id=\"outlined-adornment-weight\"]"));
	    fname.click();
         fname.sendKeys("abc");
         Thread.sleep(5000); */
         
        // WebElement upload1 = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[5]/button[2]"));
 	    //upload1.click();
 	   //Thread.sleep(5000);
 	   
 	  WebElement Save = ldriver.findElement(By.xpath("//*[text()='Upload']"));
	    Actions action1 = new Actions(ldriver);
	    action1.moveToElement(Save).click().perform();
	   //selectSave.click();
	    Thread.sleep(20000);
         
         
	      
	}
	/*public void Fileupload()throws InterruptedException {
		 try {
			  
	            WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	selectFavIcon.click();
	 
	           // WebDriverWait wait = new WebDriverWait(driver, 2);
	           // WebElement uploadOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[7]")));
	 
	uploadOption.click();
	 
	            // Wait for the file input field to be clickable
	            WebElement path = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[3]/label/img")));
	 
	path.click();
	            String Filepath = "D:\\cucumber-starter-bdd-automation 2\\cucumber-starter-bdd-automation\\TestData\\abc.json";
	            path.sendKeys(Filepath);
	 
	            // Wait for file upload to complete
	            Thread.sleep(8000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            ldriver.quit(); // Close the WebDriver session
	        }
	    }*/
	
	
	
	public void Vessel_showselected()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement vessel_showselected = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[1]"));
	    vessel_showselected.click();
	    Thread.sleep(5000);
	    vessel_showselected.click();
	    Thread.sleep(5000);
	    
	    
	}
	
	public void Vessel_collapseall()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement vessel_showselected = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[1]"));
	    vessel_showselected.click();
	    Thread.sleep(5000);
	    vessel_showselected.click();
	    Thread.sleep(5000);
	    
	    WebElement vessel_collapseall = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[1]/div[2]"));
	    vessel_collapseall.click();
	    Thread.sleep(5000);
	    vessel_collapseall.click();
	    Thread.sleep(5000);
	    
	  
	}
	
	public void Vessels_search()throws InterruptedException {
		WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    
	    
	    
	    WebElement searchicon = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[4]/div/div/div[3]/div/div/div"));
	    
	    Thread.sleep(8000);
	    
	    Actions actions = new Actions(ldriver);
		actions.moveToElement(searchicon ).click().sendKeys("Camal Twin").build().perform();
	       Thread.sleep(8000);
	       
	       
	}
	
	public void Vessels_select_cancel()throws InterruptedException {
		WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    	       
	    WebElement cancel = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[1]"));
		    cancel.click();
		    Thread.sleep(5000);
	}
	
	public void trendChart()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(5000);
	    
	    WebElement apply1 = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));
	    apply1.click();
	    Thread.sleep(5000);
	  
	    WebElement selectDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[1]"));
	    selectDate.click();
	    Thread.sleep(5000);
	  
	    WebElement selectYear1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear3 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[2]"));
	    selectYear3.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear4 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[10]"));
	    selectYear4.click();
	    Thread.sleep(5000);
	  
	    WebElement selectMonth = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[6]"));
	    selectMonth.click();
	    Thread.sleep(5000);
	  
	    WebElement selectDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[1]"));
	    selectDate1.click();
	    Thread.sleep(5000);
	  
	    WebElement selectDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[30]"));
	    selectDate2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectApply = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
	    selectApply.click();
	    Thread.sleep(5000);
	    
	    WebElement selectProceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
	    selectProceed.click();
	    Thread.sleep(5000);
	}
	
	public void Lasttime_period()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(8000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(8000);
	    
	      
	    WebElement apply1 = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));
	    apply1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[1]"));
	    selectDate.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear3 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[2]"));
	    selectYear3.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear4 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[10]"));
	    selectYear4.click();
	    Thread.sleep(5000);
	    
	    WebElement selectMonth = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[6]"));
	    selectMonth.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[1]"));
	    selectDate1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[30]"));
	    selectDate2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectApply = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
	    selectApply.click();
	    Thread.sleep(5000);
	    
	    WebElement selectProceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
	    selectProceed.click();
	    Thread.sleep(5000);
	    
	   // WebElement lasttimeperiod = ldriver.findElement(By.xpath("//*[@aria-label=\"Select latest time period\"]"));
	   // lasttimeperiod.click();
	    //Thread.sleep(5000);
	    
	    Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//*[@aria-label=\"Select latest time period\"]"));
		ac1.moveToElement(st1).click().perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		ac1.sendKeys(Keys.ENTER).perform();
	}
	
	public void Favoritelist_creation()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(9000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(8000);
	    
	    //WebElement multiplssignals = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div"));
	    //multiplssignals.click();
	    //Thread.sleep(8000);
	    
	    WebElement apply1 = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));
	    apply1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[1]"));
	    selectDate.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear3 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[2]"));
	    selectYear3.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear4 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[10]"));
	    selectYear4.click();
	    Thread.sleep(5000);
	    
	    WebElement selectMonth = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[6]"));
	    selectMonth.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[1]"));
	    selectDate1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[30]"));
	    selectDate2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectApply = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
	    selectApply.click();
	    Thread.sleep(5000);
	    
	    WebElement selectProceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
	    selectProceed.click();
	    Thread.sleep(5000);
	  
	    WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFavIcon.click();
	    Thread.sleep(5000);
	    
	    WebElement selectSaveAs = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[2]"));
	    selectSaveAs.click();
	    Thread.sleep(5000);
	    
	    WebElement save = ldriver.findElement(By.xpath("//div//*[@id=\"react-select-3-placeholder\"]"));
	    Actions ac1 = new Actions(ldriver);
	    ac1.moveToElement(save).click().perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(9000);
		
		ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);
	    
	    
	    
	    WebElement sendValueToSaveAs = ldriver.findElement(By.xpath("//*[@id=\"mui-2\"]"));
	    Actions action = new Actions(ldriver);
	    action.click(sendValueToSaveAs).sendKeys("Test12345678").build().perform();
	    Thread.sleep(8000);
	    
	    //WebElement selectSave = ldriver.findElement(By.xpath("//span[@class=\"MuiTouchRipple-root css-w0pj6f\"]"));
	    
	    WebElement selectSave = ldriver.findElement(By.xpath("//*[text()='Save']"));
	    Actions action1 = new Actions(ldriver);
	    action1.moveToElement(selectSave).click().perform();
	   //selectSave.click();
	    Thread.sleep(20000);
	}	
	
	public void Favoritelist_creation_cancel()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(9000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(8000);
	    
	       
	    WebElement apply1 = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));
	    apply1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[1]"));
	    selectDate.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear3 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[2]"));
	    selectYear3.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear4 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[10]"));
	    selectYear4.click();
	    Thread.sleep(5000);
	    
	    WebElement selectMonth = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[6]"));
	    selectMonth.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[1]"));
	    selectDate1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[30]"));
	    selectDate2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectApply = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
	    selectApply.click();
	    Thread.sleep(5000);
	    
	    WebElement selectProceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
	    selectProceed.click();
	    Thread.sleep(5000);
	  
	    WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFavIcon.click();
	    Thread.sleep(5000);
	    
	    WebElement selectSaveAs = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[2]"));
	    selectSaveAs.click();
	    Thread.sleep(5000);
	    
	    WebElement save = ldriver.findElement(By.xpath("//div//*[@id=\"react-select-3-placeholder\"]"));
	    Actions ac1 = new Actions(ldriver);
	    ac1.moveToElement(save).click().perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(9000);
		
		ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);
	    
	    
	    
	    WebElement sendValueToSaveAs = ldriver.findElement(By.xpath("//*[@id=\"mui-2\"]"));
	    Actions action = new Actions(ldriver);
	    action.click(sendValueToSaveAs).sendKeys("TFAV2").build().perform();
	    Thread.sleep(8000);
	    
	    WebElement selectCancel = ldriver.findElement(By.xpath("//span[@class=\"MuiTouchRipple-root css-w0pj6f\"]"));
	    
	    //WebElement selectCancel = ldriver.findElement(By.xpath("//*[text()='Cancel']"));
	    Actions action1 = new Actions(ldriver);
	    action1.moveToElement(selectCancel).click().perform();
	   //selectSave.click();
	    Thread.sleep(20000);
	}	

	public void fastchatsignals()throws InterruptedException {
		WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(9000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(8000);
	    
	    WebElement fastsignals = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[1]/div[1]/div"));
	    fastsignals.click();
	    Thread.sleep(8000);
	    
	    WebElement fastsignalscheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    fastsignalscheckbox.click();
	    Thread.sleep(8000);
	    
	    WebElement apply1 = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));
	    apply1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[1]"));
	    selectDate.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear3 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[2]"));
	    selectYear3.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear4 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[10]"));
	    selectYear4.click();
	    Thread.sleep(5000);
	    
	    WebElement selectMonth = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[6]"));
	    selectMonth.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[1]"));
	    selectDate1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[30]"));
	    selectDate2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectApply = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
	    selectApply.click();
	    Thread.sleep(5000);
	    
	    WebElement selectProceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
	    selectProceed.click();
	    Thread.sleep(5000);
	  
	   
	}	
	
	public void signals_collapseALL()throws InterruptedException {
		WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(9000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(8000);
	    
	    WebElement selectCollapseAll = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[1]/div[3]/div"));
	    selectCollapseAll.click();
	    Thread.sleep(8000);
	    
	    selectCollapseAll.click();
	    Thread.sleep(8000);
	    
	    	}
	
	public void signals_showselected()throws InterruptedException {
		WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(9000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(8000);
	    
	    WebElement showselected = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[1]/div[2]"));
	    showselected.click();
	    Thread.sleep(8000);
	    
	    showselected.click();
	    Thread.sleep(8000);
	    
	    
	}
	
	public void signals_search()throws InterruptedException {
		WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(9000);
	    
	    WebElement searchicon = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
	    searchicon.click();
	    Thread.sleep(8000);
	    
	    searchicon.sendKeys("LOT");
	    
	    Thread.sleep(8000);
	}
	
	public void Signals_selection_Cancel()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(8000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(5000);
	    
	    WebElement Cancel = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]"));
	    Cancel.click();
	    Thread.sleep(5000);
	}
	
	public void Multiplesignals()throws InterruptedException {
	    WebElement trendIcon = ldriver.findElement(By.xpath("//*[@id=\"webapp-container\"]/header/div/div/div/div/div[1]/ul/ul/div[3]"));
	    trendIcon.click();
	    Thread.sleep(2000);
	    
	    WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]"));
	    selectSignal.click();
	    Thread.sleep(5000);
	    
	    WebElement selectCamal = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div"));
	    selectCamal.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	    apply.click();
	    Thread.sleep(9000);
	    
	    WebElement selectCheckbox = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
	    selectCheckbox.click();
	    Thread.sleep(8000);
	    
	    WebElement multiplssignals = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div"));
	    multiplssignals.click();
	    Thread.sleep(8000);
	    
	    
	    
	    WebElement apply1 = ldriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));
	    apply1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[1]"));
	    selectDate.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[3]"));
	    selectYear2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear3 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button[2]"));
	    selectYear3.click();
	    Thread.sleep(5000);
	    
	    WebElement selectYear4 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[10]"));
	    selectYear4.click();
	    Thread.sleep(5000);
	    
	    WebElement selectMonth = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/button[6]"));
	    selectMonth.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[1]"));
	    selectDate1.click();
	    Thread.sleep(5000);
	    
	    WebElement selectDate2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[30]"));
	    selectDate2.click();
	    Thread.sleep(5000);
	    
	    WebElement selectApply = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
	    selectApply.click();
	    Thread.sleep(5000);
	    
	    WebElement selectProceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
	    selectProceed.click();
	    Thread.sleep(5000);
	}

	public void selectFav1() throws InterruptedException {
		
		Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//div[@id='react-select-2-placeholder']"));
		ac1.moveToElement(st1).click().perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);
		
	    WebElement selectFav = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
	    selectFav.click();
	    Thread.sleep(2000);
	  
	    WebElement selectSaveAs = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[2]"));
	    selectSaveAs.click();
	    Thread.sleep(2000);
	    
	    
	    WebElement textCheck = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/p[1]"));
	    Actions actions = new Actions(ldriver);
	    actions.doubleClick(textCheck).perform();
	    actions.click().build().perform();
	    Thread.sleep(2000);
	
	
	    String textValue = textCheck.getText();
	    System.out.println("Text value: " + textValue);
	    
	    Assert.assertEquals("The text value is expected.", "Favorite Item Name already exist, please change to a different one", textValue);
	}
	
	public void graphHover() throws InterruptedException{
		
		//String verticalXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-no-tooltip highcharts-button highcharts-button-normal']//*[name()='rect']";
		String verticalXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-annotation-shapes']";
	    String textXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend-item highcharts-line-series highcharts-color-undefined highcharts-series-0 highcharts-legend-item-hidden']";
		String textXpath2 = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-markers highcharts-series-0 highcharts-line-series highcharts-tracker']";
				
		List<WebElement> graphList = ldriver.findElements(By.xpath(verticalXpath));
				Actions act = new Actions(ldriver);
				 for(WebElement e :graphList) {
					act.moveToElement(e).perform();
					Thread.sleep(3000);
					String text = ldriver.findElement(By.xpath(textXpath)).getText();
					System.out.println(text);
					Assert.assertEquals("126.1547", text);
				}
				 
				List<WebElement> graphList2 = ldriver.findElements(By.xpath(textXpath2));
				Actions act1 = new Actions(ldriver);
				for(WebElement e :graphList2) {
					act1.moveToElement(e).perform();
					Thread.sleep(3000);
					String text2 = ldriver.findElement(By.xpath(textXpath2)).getText();
					System.out.println(text2);
					Assert.assertEquals("154.1169", text2);
				} 
				Thread.sleep(10000);
				WebElement Legend = ldriver.findElement(By.xpath("//*[name()='g']//*[name()='g' and contains(@class,'highcharts')]//*[name()='text' and contains(@x,'21')]"));
				Actions actions = new Actions(ldriver);
			    actions.moveToElement(Legend).perform();
			    String Legendtext=Legend.getText();
			    System.out.println(Legendtext);
			    Assert.assertEquals("99935.LON", Legendtext);
			    
	}
   
	public void graphHover2() throws InterruptedException {
		String verticalXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-annotation-shapes']";
		String textXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-yaxis-labels']//*[name()='text']";
				
		List<WebElement> graphList = ldriver.findElements(By.xpath(verticalXpath));
				System.out.println("total element: " + graphList.size());
				Actions act = new Actions(ldriver);
				 
				for(WebElement e :graphList) {
					act.moveToElement(e).perform();
					Thread.sleep(3000);
					ldriver.findElement(By.xpath(textXpath)).getText();
					String text = ldriver.findElement(By.xpath(textXpath)).getText();
					System.out.println(text);
					Assert.assertEquals("120", text);
					
					WebElement Legend = ldriver.findElement(By.xpath("//*[name()='g']//*[name()='g' and contains(@class,'highcharts')]//*[name()='text' and contains(@x,'21')]"));
					Actions actions = new Actions(ldriver);
				    actions.moveToElement(Legend).perform();
				    String Legendtext=Legend.getText();
				    System.out.println(Legendtext);
				    Assert.assertEquals("99935.LON", Legendtext);
				}
    }
	
	
	
	
	public void graphHover1() throws InterruptedException {
	    Thread.sleep(2000);
	    WebElement graphElement = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/svg/g[5]/g[1]/path[2]"));
	    
	    // Execute JavaScript to trigger hover action
	    String script = "var element = arguments[0];"
	                  + "var mouseEvent = document.createEvent('MouseEvents');"
	                  + "mouseEvent.initEvent('mouseover', true, true);"
	                  + "element.dispatchEvent(mouseEvent);";
	    ((JavascriptExecutor) ldriver).executeScript(script, graphElement);
	    
	    Thread.sleep(6000);
	}
	
	public void favoriteTrend1() throws InterruptedException{
		Actions ac1 = new Actions(ldriver);
		
		WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		
		Thread.sleep(9000);
		
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treeview-toggle-item-visibility\"]"));
		ac1.moveToElement(deflt).click().perform();
		Thread.sleep(9000);
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		//ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);
		
		
	}
	
	public void graphHover4() throws InterruptedException {
		String verticalXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-annotation-shapes']";
		String textXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-yaxis-labels']//*[name()='text']";
				
		List<WebElement> graphList = ldriver.findElements(By.xpath(verticalXpath));
				System.out.println("total element: " + graphList.size());
				Actions act = new Actions(ldriver);
				
				for(WebElement e :graphList) {
					act.moveToElement(e).perform();
					Thread.sleep(6000);
					ldriver.findElement(By.xpath(textXpath)).getText();
					String text = ldriver.findElement(By.xpath(textXpath)).getText();
					System.out.println(text);
					Assert.assertEquals("120", text);
					
					WebElement Legend = ldriver.findElement(By.xpath("//*[name()='g']//*[name()='g' and contains(@class,'highcharts')]//*[name()='text' and contains(@x,'21')]"));
					Actions actions = new Actions(ldriver);
				    actions.moveToElement(Legend).perform();
				    String Legendtext=Legend.getText();
				    System.out.println(Legendtext);
				    Assert.assertEquals("99935.LON", Legendtext);
				}
	
     }
	
	public void graphHover3() throws InterruptedException {
		String verticalXpath = "//*[@id=\"highcharts-oiq71vu-0\"]/svg/g[19]/g[1]/path[2]";
		String textXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-yaxis-labels']//*[name()='text']";
				
		List<WebElement> graphList = ldriver.findElements(By.xpath(verticalXpath));
				System.out.println("total element: " + graphList.size());
				Actions act = new Actions(ldriver);
				
				for(WebElement e :graphList) {
					act.moveToElement(e).perform();
					Thread.sleep(6000);
					ldriver.findElement(By.xpath(textXpath)).getText();
					String text = ldriver.findElement(By.xpath(textXpath)).getText();
					System.out.println(text);
					Assert.assertEquals("120", text);
					
					WebElement Legend = ldriver.findElement(By.xpath("//*[name()='g']//*[name()='g' and contains(@class,'highcharts')]//*[name()='text' and contains(@x,'21')]"));
					Actions actions = new Actions(ldriver);
				    actions.moveToElement(Legend).perform();
				    String Legendtext=Legend.getText();
				    System.out.println(Legendtext);
				    Assert.assertEquals("99935.LON", Legendtext);
				}
	
     }
	
	public void Datapoint_Resolution()throws InterruptedException {
	    WebElement Datapoint = ldriver.findElement(By.xpath("//div[contains(text(),'Auto Loading-Single Sample')]"));
	    Datapoint.click();
	    Thread.sleep(2000);
	    Actions ac1 = new Actions(ldriver);
	    ac1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(9000);
		ac1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(9000);
}

	public void Fastdataicon()throws InterruptedException {
	    WebElement FastdataIcon = ldriver.findElement(By.xpath("//div[@aria-label=\"Fast data chart (redirect)\"]"));
	    FastdataIcon.click();
	    Thread.sleep(2000);
}
	public void Download1()throws InterruptedException {
	    WebElement DownloadIcon1 = ldriver.findElement(By.xpath("//div[@aria-label=\"Download (csv)\"]"));
	    DownloadIcon1.click();
	    Thread.sleep(2000);
}
	
	public void Notesicon()throws InterruptedException {
	    WebElement Noteicon = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[7]/div/img"));
	    Noteicon.click();
	    Thread.sleep(5000);
	    
	    //WebElement Signalname = ldriver.findElement(By.xpath("//*[@id=\"signal-name-checkbox\"]"));
	   // Signalname.click();
	    //Thread.sleep(5000);
	  // WebElement Signalcheck = ldriver.findElement(By.xpath("//*[@class=\"MuiTouchRipple-root css-w0pj6f\"]"));
	   // Signalcheck.click();
	    //Thread.sleep(5000);
	    
	  // Actions ac1 = new Actions(ldriver);
	    //ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		//ac1.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(30000);
		
		WebElement Notestext = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[3]/div[3]/div/div[1]/div[2]/div"));
		
	    Thread.sleep(10000);
	   	    
	    Actions action = new Actions(ldriver);
	    action.moveToElement(Notestext).click().perform();
	    action.click(Notestext).sendKeys("TFAV2").build().perform();
	    Thread.sleep(8000);
	    
	 
	    
	    WebElement Submit = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[3]/div[3]/div/div[2]/button[2]"));
		Submit.click();
	    Thread.sleep(5000);
	    
	    
}
	
	public void Notescancel()throws InterruptedException {
	    WebElement Noteicon = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[7]/div/img"));
	    Noteicon.click();
	    Thread.sleep(5000);
	    
	    //WebElement Signalname = ldriver.findElement(By.xpath("//*[@id=\"signal-name-checkbox\"]"));
	   // Signalname.click();
	    //Thread.sleep(5000);
	  // WebElement Signalcheck = ldriver.findElement(By.xpath("//*[@class=\"MuiTouchRipple-root css-w0pj6f\"]"));
	   // Signalcheck.click();
	    //Thread.sleep(5000);
	    
	  // Actions ac1 = new Actions(ldriver);
	    //ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		//ac1.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(30000);
		
		WebElement Notestext = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[3]/div[3]/div/div[1]/div[2]/div"));
		
	    Thread.sleep(10000);
	   	    
	    Actions action = new Actions(ldriver);
	    action.moveToElement(Notestext).click().perform();
	    action.click(Notestext).sendKeys("TFAV2").build().perform();
	    Thread.sleep(8000);
	    
	 
	    
	    WebElement Cancel = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[3]/div[3]/div/div[2]/button[1]"));
		Cancel.click();
	    Thread.sleep(5000);
	    
	    
}
	
	public void ECMAlarm()throws InterruptedException {
	    WebElement ECMAlarm = ldriver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div[1]/div[1]/div[1]"));
	    ECMAlarm.click();
	    Thread.sleep(2000);
	    ECMAlarm.click();
}
	
	public void WIDEAlarm()throws InterruptedException {
	    WebElement WIDEAlarm = ldriver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div[1]/div[1]/div[4]"));
	    WIDEAlarm.click();
	    Thread.sleep(2000);
	    WIDEAlarm.click();
}
	
	public void SelectedSignallist()throws InterruptedException {
	    WebElement Signallist = ldriver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div[2]/div/div[2]"));
	    Signallist.click();
	    Thread.sleep(2000);
	    
}
}
