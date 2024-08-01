package pages.Cloud;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Fastdatachartpage {
	WebDriver ldriver;

	public Fastdatachartpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void Fdataicon(){
		ldriver.findElement(By.id("Fast data chart_3")).click();

	}

	public void favoritedata() throws InterruptedException{
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

public void fastDataChart() throws InterruptedException{
		
		WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
		fastDataChartIcon.click();
		Thread.sleep(2000);
		
		WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]/div/div/div/button"));
		selectSignal.click();
		Thread.sleep(2000);
		
		WebElement selectSignalHE = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
		selectSignalHE.click();
		Thread.sleep(2000);
		
		WebElement selectSignalHEApply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
		selectSignalHEApply.click();
		Thread.sleep(2000);
		
		WebElement selectSignalCylinder = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
		selectSignalCylinder.click();
		Thread.sleep(2000);
		
		WebElement selectSignalCylinderApply = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button[2]"));
		selectSignalCylinderApply.click();
		Thread.sleep(5000);
		
		WebElement selectDatePicker = ldriver.findElement(By.xpath("//div[@class='react-datetime-picker react-datetime-picker--closed react-datetime-picker--disabled date']"));
		selectDatePicker.click();
		Thread.sleep(2000);
		
		WebElement selectMonth1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[1]/div/div[1]/button[3]"));
		selectMonth1.click();
		Thread.sleep(2000);
		
		WebElement selectYear = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[1]/div/div[1]/button[3]"));
		selectYear.click();
		Thread.sleep(2000);
		
		WebElement selectYear1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/button[2]"));
		selectYear1.click();
		Thread.sleep(2000);
		
		WebElement selectMonth2 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/button[9]"));
		selectMonth2.click();
		Thread.sleep(2000);
		
		WebElement selectDate = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/button[18]"));
		selectDate.click();
		Thread.sleep(2000);
		
	    WebElement enterHour = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/input[5]"));
	    Actions actions01 = new Actions(ldriver);
	    actions01.doubleClick(enterHour).perform();
	    enterHour.sendKeys("072601");
	    
	   // WebElement enterMin = ldriver.findElement(By.xpath("//div[@class='selectbox-datetimepicker__values selectbox-datetimepicker__selected']//input[6]"));
//	    Actions actions02 = new Actions(ldriver);
//	    actions02.doubleClick(enterMin).perform();
	   // enterMin.click();
	    //enterMin.sendKeys("26");
	    
//	    WebElement enterSec = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/input[6]"));
//	    Actions actions03 = new Actions(ldriver);
//	    actions03.doubleClick(enterSec).perform();
//	    enterSec.sendKeys("01");
	    
		WebElement selectApplyDateNTime = ldriver.findElement(By.xpath("//*[@id=\"applyRangeButton\"]"));
		selectApplyDateNTime.click();
		Thread.sleep(2000);
		
		
		//WebElement selectGraph1 = ldriver.findElement(By.xpath("//*[@id=\"highcharts-h6z1vhd-0\"]/svg/g[20]"));
		//selectGraph1.click();
		//Thread.sleep(2000);
		
		//WebElement selectGraph2 = ldriver.findElement(By.xpath("//*[@id=\"highcharts-h6z1vhd-0\"]/svg/g[18]/g[1]/image"));
		//selectGraph2.click();
		//Thread.sleep(2000);
		
		WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
		selectFavIcon.click();
		Thread.sleep(2000);
		
		WebElement selectSaveAsInFavIcon = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[2]"));
		selectSaveAsInFavIcon.click();
		Thread.sleep(2000);
		
		
		//Actions ac1 = new Actions(ldriver);
		
		//WebElement st1=ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[6]/div/div/div[2]/div"));
		//ac1.moveToElement(st1).click().perform();
		
		//Thread.sleep(9000);
		
		//WebElement deflt=ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[6]/div/div"));
		//ac1.moveToElement(deflt).click().perform();
		//Thread.sleep(9000);
		
		//ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		//ac1.sendKeys(Keys.ARROW_DOWN).perform();
		
		//ac1.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(9000);
		
	    WebElement SaveFavNameAs = ldriver.findElement(By.xpath("//*[@id=\"mui-2\"]"));
	    SaveFavNameAs.click();
	    SaveFavNameAs.sendKeys("TestDefault01");
	    
	    //WebElement SaveFavNameSubmit = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/button[2]"));
	    //SaveFavNameSubmit.click();
	    WebElement selectSave = ldriver.findElement(By.xpath("//*[text()='Save']"));
	    Actions action1 = new Actions(ldriver);
	    action1.moveToElement(selectSave).click().perform();
	    Thread.sleep(9000);
	    
	    
	}

public void Vessel_showselected()throws InterruptedException {
	WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
	fastDataChartIcon.click();
	Thread.sleep(2000);
	
	WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]/div/div/div/button"));
	selectSignal.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHE = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
	selectSignalHE.click();
	Thread.sleep(2000);
    
    WebElement vessel_showselected = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[1]"));
    vessel_showselected.click();
    Thread.sleep(5000);
    vessel_showselected.click();
    Thread.sleep(5000);
    
    
}

public void Vessel_collapseall()throws InterruptedException {
	WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
	fastDataChartIcon.click();
	Thread.sleep(2000);
	
	WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]/div/div/div/button"));
	selectSignal.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHE = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
	selectSignalHE.click();
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

public void signals_collapseALL()throws InterruptedException {
	WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
	fastDataChartIcon.click();
	Thread.sleep(2000);
	
	WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]/div/div/div/button"));
	selectSignal.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHE = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
	selectSignalHE.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHEApply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	selectSignalHEApply.click();
	Thread.sleep(2000);
	
	WebElement selectSignalCylinder = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
	selectSignalCylinder.click();
	Thread.sleep(2000);
    
    WebElement selectCollapseAll = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div"));
    selectCollapseAll.click();
    Thread.sleep(8000);
    
    selectCollapseAll.click();
    Thread.sleep(8000);
    
    	}

public void signals_showselected()throws InterruptedException {
	WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
	fastDataChartIcon.click();
	Thread.sleep(2000);
	
	WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]/div/div/div/button"));
	selectSignal.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHE = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
	selectSignalHE.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHEApply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	selectSignalHEApply.click();
	Thread.sleep(2000);
	
	WebElement selectSignalCylinder = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
	selectSignalCylinder.click();
	Thread.sleep(2000);
    
    WebElement showselected = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div"));
    showselected.click();
    Thread.sleep(8000);
    
    showselected.click();
    Thread.sleep(8000);
    
    
}

public void signals_search()throws InterruptedException {
	WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
	fastDataChartIcon.click();
	Thread.sleep(2000);
	
	WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]/div/div/div/button"));
	selectSignal.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHE = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
	selectSignalHE.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHEApply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	selectSignalHEApply.click();
	Thread.sleep(2000);
	
	WebElement selectSignalCylinder = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
	selectSignalCylinder.click();
	Thread.sleep(2000);
    
    WebElement searchicon = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
    searchicon.click();
    Thread.sleep(8000);
    
    searchicon.sendKeys("CylinderPressure1");
    
    Thread.sleep(8000);
}

public void Signals_selection_Cancel()throws InterruptedException {
	WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
	fastDataChartIcon.click();
	Thread.sleep(2000);
	
	WebElement selectSignal = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[2]/div/div/div/button"));
	selectSignal.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHE = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
	selectSignalHE.click();
	Thread.sleep(2000);
	
	WebElement selectSignalHEApply = ldriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
	selectSignalHEApply.click();
	Thread.sleep(2000);
	
	WebElement selectSignalCylinder = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
	selectSignalCylinder.click();
	Thread.sleep(2000);
    
    WebElement Cancel = ldriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div/div/button[1]"));
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

public void Graph()throws InterruptedException {
	
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
	

//WebElement selectGraph = ldriver.findElement(By.xpath("//*[@id=\"highcharts-1wrzmi5-14417\"]/svg/g[22]"));
	//selectGraph1.click();
	//Thread.sleep(2000);

WebElement selectGraph1 = ldriver.findElement(By.xpath("//*[@id=\"highcharts-p2lmuem-0\"]/svg/g[25]/g[1]/path[2]"));
selectGraph1.click();
Thread.sleep(2000);

WebElement selectGraph2 = ldriver.findElement(By.xpath("//*[//*[@id=\"highcharts-p2lmuem-0\"]/svg/g[32]/g[1]/path[2]"));
selectGraph2.click();
Thread.sleep(2000);

WebElement selectGraph3 = ldriver.findElement(By.xpath("//*[//*[@id=\"highcharts-p2lmuem-0\"]/svg/g[59]/g[1]/path[2]"));
selectGraph3.click();
Actions actions = new Actions(ldriver);

actions.doubleClick(selectGraph1).perform();
Thread.sleep(2000);

String textValue = selectGraph1.getText();
System.out.println("graphValue: " + textValue);
   Assert.assertEquals("The text value is expected.", "8999748.99935", textValue);
}

public void favorite_Save() throws InterruptedException{
	Actions ac1 = new Actions(ldriver);

	WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
	ac1.moveToElement(st1).click().perform();
	
	Thread.sleep(9000);
	
	WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treeview-toggle-item-visibility\"]"));
	ac1.moveToElement(deflt).click().perform();
	Thread.sleep(9000);
	
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ENTER).perform();
	Thread.sleep(9000);
	
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
	
	WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treeview-toggle-item-visibility\"]"));
	ac1.moveToElement(deflt).click().perform();
	Thread.sleep(9000);
	
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ENTER).perform();
	Thread.sleep(9000);
	
			
	WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
    selectFavIcon.click();
    Thread.sleep(5000);
    
    WebElement Rename = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[3]"));
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
	
	WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treeview-toggle-item-visibility\"]"));
	ac1.moveToElement(deflt).click().perform();
	Thread.sleep(9000);
	
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ENTER).perform();
	Thread.sleep(9000);
	
	WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
    selectFavIcon.click();
    Thread.sleep(5000);
    
    WebElement Delete = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[4]"));
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
	
	WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treeview-toggle-item-visibility\"]"));
	ac1.moveToElement(deflt).click().perform();
	Thread.sleep(9000);
	
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	
	ac1.sendKeys(Keys.ENTER).perform();
	Thread.sleep(9000);
	
	WebElement selectFavIcon = ldriver.findElement(By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//button[@id='basic-button']//*[name()='svg']"));
    selectFavIcon.click();
    Thread.sleep(5000);
    
    WebElement Share = ldriver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li[5]"));
    Share.click();
    Thread.sleep(5000);
    
    	    
    
}

public void graphHover2() throws InterruptedException {
	Actions ac1 = new Actions(ldriver);

	WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
	ac1.moveToElement(st1).click().perform();
	
	Thread.sleep(9000);
	
	WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treeview-toggle-item-visibility\"]"));
	ac1.moveToElement(deflt).click().perform();
	Thread.sleep(9000);
	
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(9000);
	ac1.sendKeys(Keys.ENTER).perform();
	Thread.sleep(9000);
	String verticalXpath = "//*[@id=\"highcharts-s3l87x8-0\"]/svg/g[41]/g[1]";

			
	List<WebElement> graphList = ldriver.findElements(By.xpath(verticalXpath));
			System.out.println("total element: " + graphList.size());
			Actions act = new Actions(ldriver);
			
			for(WebElement e :graphList) {
				act.moveToElement(e).perform();
				Thread.sleep(3000);
}

}

public void fastDataChart01() throws InterruptedException{
	
	WebElement fastDataChartIcon = ldriver.findElement(By.xpath("//img[@class='fast-data-icon']"));
	fastDataChartIcon.click();
	Thread.sleep(2000);
	}

public void favoritedata1() throws InterruptedException{
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




        public void selectCreateNotes() throws InterruptedException{
	
	WebElement selectNotes = ldriver.findElement(By.xpath("//div[@aria-label='Create notes']//img"));
	selectNotes.click();
	Thread.sleep(2000);
}

public void selectSignalName() throws InterruptedException{
	
	WebElement selectSignalNAme = ldriver.findElement(By.xpath("//*[@id=\"signal-name-checkbox\"]"));
	selectSignalNAme.click();
	Thread.sleep(2000);
}

public void selectSignalDD() throws InterruptedException{
	
	WebElement selecFromDD = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]/span[1]/input"));
	selecFromDD.click();
	Thread.sleep(2000);
}


public void selectSimply() throws InterruptedException{
	
	WebElement randomClick = ldriver.findElement(By.xpath("//*[@id=\"menu-\"]"));
	randomClick.click();
	Thread.sleep(2000);
}


public void sendKeysName() throws InterruptedException{
    WebElement sendText = ldriver.findElement(By.xpath("//textarea[@id='mui-21']"));
    sendText.click();
    sendText.sendKeys("testSignal01");
    Thread.sleep(5000);

    WebElement submit = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[3]/div[2]/div/div[2]/button[2]"));
    submit.click();
    Thread.sleep(3000);
}

public void Notescancel() throws InterruptedException{
    WebElement sendText = ldriver.findElement(By.xpath("//textarea[@id='mui-21']"));
    sendText.click();
    sendText.sendKeys("testSignal01");
    Thread.sleep(5000);

    WebElement cancel = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[3]/div[2]/div/div[2]/button[1]"));
    cancel.click();
    Thread.sleep(3000);
}

public void selectNotesInGraph() throws InterruptedException{
	WebElement clickNoteOnGraph = ldriver.findElement(By.xpath("//*[name()='image' and contains(@preserveAspectRatio,'none')]"));
	Thread.sleep(3000);
	Actions acnew = new Actions(ldriver);
	acnew.click(clickNoteOnGraph).build().perform();
              Thread.sleep(3000);

}

public void selectNoteOptionsE() throws InterruptedException{
    WebElement clickEdit = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[3]/div[2]/div[1]/div[2]/p[3]/a[1]"));
    clickEdit.click();
}

public void selectNoteOptionsD() throws InterruptedException{
    WebElement clickDelete = ldriver.findElement(By.xpath("//div[@id='dashboard_container']//div[1]//div[2]//p[3]//a[2]"));
    clickDelete.click();
}

public void selectNoteOptionsR() throws InterruptedException{
    WebElement clickReply = ldriver.findElement(By.xpath("//div[@id='dashboard_container']//div[1]//div[2]//p[3]//a[3]"));
    clickReply.click();
}

public void Download1()throws InterruptedException {
    WebElement DownloadIcon1 = ldriver.findElement(By.xpath("//div[@aria-label=\"Download (csv)\"]"));
    DownloadIcon1.click();
    Thread.sleep(2000);
}

public void favorite() throws InterruptedException{
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

	WebElement deflt1 = ldriver.findElement(By.xpath("//*[text()='newfast']"));;
	ac1.moveToElement(deflt1).click().perform();
	//.clickAndHold();
	
	//ac1.sendKeys(Keys.ARROW_DOWN).perform();
	
	//ac1.sendKeys(Keys.ENTER).perform();
	Thread.sleep(9000);
	
	
	
}
}
