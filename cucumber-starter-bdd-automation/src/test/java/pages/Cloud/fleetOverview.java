package pages.Cloud;
//import org.testng.Assert;
//import org.junit.Assert;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class fleetOverview {
	WebDriver ldriver;
	public fleetOverview(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickfleetIcon() throws InterruptedException{
		
		ldriver.findElement(By.xpath("//div[@aria-label='Fleet overview']")).click();
		Thread.sleep(2000);	
	}
   
	
	
//TC14	
	public void zoomInMap() throws InterruptedException{
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[1]/a[1]")).click();
		Thread.sleep(2000);
	}
	
	public void zoomOutMap() throws InterruptedException{
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[1]/a[2]")).click();
		Thread.sleep(2000);
	}

	
	
//TC15 and TC17
	public void clickBabylon() throws InterruptedException{	
		ldriver.findElement(By.xpath("//div[@aria-label='Fleet overview']")).click();
		Thread.sleep(2000);	
			
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(3000);	
}

	public void selectCamal() throws InterruptedException{
		
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span")).click();
		Thread.sleep(2000);
		
		
	//	WebElement dropdown = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span"));
	//	 
	//	// Create Actions object
	//	Actions actions = new Actions(ldriver);
	//	 
	//	// Move to the dropdown and click on it
	//	actions.moveToElement(dropdown).click().build().perform();
	//	 
	//	Thread.sleep(1000); 
		
	}

	public void clickShowSelected() throws InterruptedException{
	
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div")).click();
		Thread.sleep(2000);		
	}

//TC16
	public void unSelectGrid() throws InterruptedException{
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(3000);	
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span")).click();
		Thread.sleep(2000);
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(2000);	
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span")).click();
		Thread.sleep(2000);
	}
	
//TC18
	public void collapseAll() throws InterruptedException{
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(3000);	
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span")).click();
		Thread.sleep(2000);
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(2000);	
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[3]")).click();
		Thread.sleep(2000);
	}

//TC19
	public void showAll() throws InterruptedException{
		ldriver.findElement(By.xpath("//div[@aria-label='Fleet overview']")).click();
		Thread.sleep(5000);	
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(3000);	
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span")).click();
		Thread.sleep(2000);


		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(2000);	
		
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(2000);
	}
	
//TC20
	public void searchBar() throws InterruptedException{
		ldriver.findElement(By.xpath("//div[@aria-label='Fleet overview']")).click();
		Thread.sleep(5000);	
		
		
		
		WebElement searchBar = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
	   searchBar.click();
	    searchBar.sendKeys("wingd");
	}

	
//TC21
	public void searchNoData() throws InterruptedException{
		ldriver.findElement(By.xpath("//div[@aria-label='Fleet overview']")).click();
		Thread.sleep(5000);	
		WebElement searchBar = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
	    searchBar.click();
	    searchBar.sendKeys("zxcvbnm");
	    Thread.sleep(5000);
	    
	}
	
	public void ShipcolsearchBar() throws InterruptedException{
			
		
		WebElement ownersearchBar = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[5]/div/table/tbody/tr[2]/td[4]/div/div[2]/div/div/div[1]/input"));
	    ownersearchBar.click();
	    ownersearchBar.sendKeys("HE Star");
		Thread.sleep(2000);
		
	}
	
	public void imocolsearchBar() throws InterruptedException{
	WebElement imosearchBar = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[5]/div/table/tbody/tr[2]/td[3]"));
    
    Actions actions = new Actions(ldriver);
    actions.moveToElement(imosearchBar).click().sendKeys("1000204").build().perform();
    
	Thread.sleep(2000);
	}
	
public void EnginenumcolsearchBar() throws InterruptedException{
			
		
		WebElement enginesearchBar = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[5]/div/table/tbody/tr[2]/td[5]"));
		 Actions actions = new Actions(ldriver);
		 actions.moveToElement(enginesearchBar).click().sendKeys("58795").build().perform();
		
		Thread.sleep(2000);
		
	}

public void EnginetypecolsearchBar() throws InterruptedException{
	
	
	WebElement enginetypesearchBar = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[5]/div/table/tbody/tr[2]/td[6]"));
	 Actions actions = new Actions(ldriver);
	 actions.moveToElement(enginetypesearchBar).click().sendKeys("12X82DF").build().perform();
	
	Thread.sleep(2000);
	
}

public void EnginekpicolsearchBar() throws InterruptedException{
	
	
	WebElement enginekpisearch = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[5]/div/table/tbody/tr[2]/td[9]"));
	 Actions actions = new Actions(ldriver);
	 actions.moveToElement(enginekpisearch ).click().sendKeys("100").build().perform();
	
	Thread.sleep(2000);
	
}
	
//TC22
	public void vesselIconClick() throws InterruptedException{
//		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div")).click();
//		Thread.sleep(3000);	
	    WebElement vesselIcon = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[4]/img[2]"));
	    vesselIcon.click();
	}
	
//TC23, TC24 and TC26
	public void navigateToFleet() throws InterruptedException{
		ldriver.findElement(By.xpath("//div[@aria-label='Fleet overview']")).click();
		Thread.sleep(2000);	
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(5000);	
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span")).click();
		Thread.sleep(5000);
		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]")).click();
		Thread.sleep(2000);		
	}
	
	
//TC31
	
	public void selectVesselProfile() throws InterruptedException{
		ldriver.findElement(By.xpath("//*[@id=\"simple-tab-0\"]")).click();
		Thread.sleep(2000);
	}
	
//
	
	public void selectPower() throws InterruptedException{
		ldriver.findElement(By.xpath("//*[@id=\"simple-tab-0\"]")).click();
		Thread.sleep(2000);
	}
	
//
	
	public void selectSpeed() throws InterruptedException{
		ldriver.findElement(By.xpath("//div[@class='MuiTabs-root css-orq8zk']//button[@id='simple-tab-1']")).click();
		Thread.sleep(2000);
	}
	
//
	
	public void selectKPI() throws InterruptedException{
		ldriver.findElement(By.xpath("//div[@class='MuiTabs-root css-1irf1v6']//button[@id='simple-tab-1']")).click(); 
		Thread.sleep(2000);
	}
	
public void kpiSearch() throws InterruptedException{
		
	    WebElement selectKpi = ldriver.findElement(By.xpath("//*[@id=\"simple-tab-1\"]"));
	    selectKpi.click();
		
	    WebElement kpisearchBar = ldriver.findElement(By.xpath("//input[@aria-label='Search in the data grid']"));
	    kpisearchBar.click();
	    kpisearchBar.sendKeys("Camal Twin");
	}
	
public void kpiSearchnotmatching() throws InterruptedException{
	
    WebElement selectKpi = ldriver.findElement(By.xpath("//*[@id=\"simple-tab-1\"]"));
    selectKpi.click();
	
    WebElement kpisearchBar = ldriver.findElement(By.xpath("//input[@aria-label='Search in the data grid']"));
    kpisearchBar.click();
    kpisearchBar.sendKeys("WXXY");
}
	public void DataKpiCC() throws InterruptedException {
	    WebElement Kpicc = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[8]/div[1]/span"));
	    Actions actions = new Actions(ldriver);
	    actions.doubleClick(Kpicc).perform();
	    Thread.sleep(2000);
	    
	    // Get the color of the text element
	    String color = Kpicc.getCssValue("color");
	    System.out.println("Color of the text element: " + color);
	    
	 // Get the text value of the element
	    String textValue = Kpicc.getText();
	    System.out.println("Data KPI value: " + textValue);
 
	    // Assertion for color
	   // Assert.assertTrue(color.equals("rgb(230, 76, 60)") || color.equals("red"));
	    // Check if the color is red
	    if (color.equals("rgb(230, 76, 60)") || color.equals("red")) {
	        System.out.println("Data KPI is less than 70% then The text color is red.");
	    } else {
	        System.out.println("Data KPI is not less than 70% then The text color is not red.");
	    }
 
	    // Assertion for text value
	    //Assert.assertEquals("The text value is expected.", "0.4%", textValue);
	}
	
public void LastupdateCC() throws InterruptedException {
		
		
	    WebElement kpiCC = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[7]/div[1]/span"));
	    Actions actions = new Actions(ldriver);
	    actions.doubleClick(kpiCC).perform();
	    Thread.sleep(2000);
 
	    // Get the color of the text element
	    String color = kpiCC.getCssValue("color");
	    System.out.println("Color of the text element: " + color);
 
	    // Get the text value of the element
	    String textValue = kpiCC.getText();
	    System.out.println("Last update value: " + textValue);
	    //Assert.assertEquals("The text value is expected.", "669 days", textValue);
	    
	     //Assertion for color
	  //Assert.assertTrue(color.equals("rgb(230, 76, 60)") || color.equals("red"));
	    // Check if the color is red
	    if (color.equals("rgb(230, 76, 60)") || color.equals("red")) {
	        System.out.println("Last update is greater than 48 hrs then The text color is red.");
	    } else {
	        System.out.println("Last update is less than 48 hrs then The text color is not red.");
	    }
 
	    // Assertion for text value
	    //Assert.assertEquals("The text value is expected.", "627 days", textValue);
	}

public void RemainingdaysCC() throws InterruptedException {
	
	
    WebElement RedaysCC = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[11]/div[1]/span"));
    Actions actions = new Actions(ldriver);
    actions.doubleClick(RedaysCC).perform();
    Thread.sleep(2000);

    // Get the color of the text element
    String color = RedaysCC.getCssValue("color");
    System.out.println("Color of the text element: " + color);

    // Get the text value of the element
    String textValue = RedaysCC.getText();
    System.out.println("Remaining Days value: " + textValue);

    // Assertion for color
   // Assert.assertTrue(color.equals("rgb(230, 76, 60)") || color.equals("red"));
    // Check if the color is red
    if (color.equals("rgb(230, 76, 60)") || color.equals("red")) {
        System.out.println("Remaining Days is less than 7 days then The text color is red.");
    } else {
        System.out.println("Remaining Days is not less than 7 days then The text color is not red.");
    }

    // Assertion for text value
  //  Assert.assertEquals("The text value is expected.", "0 days", textValue);
}

public void EngineKPICC() throws InterruptedException {
	
	
	WebElement EngKpiCC = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[9]/div[1]/span"));
    Actions actions = new Actions(ldriver);
    actions.doubleClick(EngKpiCC).perform();
    Thread.sleep(2000);

    String color = EngKpiCC.getCssValue("color");
    System.out.println("Color of the text element: " + color);

    String textValue = EngKpiCC.getText();
    System.out.println("Engine KPI  value: " + textValue);

   // Assert.assertTrue(color.equals("rgb(0, 0, 0)") || color.equals("black"));
    
    if (color.equals("rgb(0, 0, 0)") || color.equals("black")) {
        System.out.println("Engine Kpi is greater than or equal to 70%, The text color is black.");
    } else {
        System.out.println("Engine Kpi is less than 70%, the text color is not black.");
    }
    
  //  Assert.assertEquals("The text value is expected.", "89%", textValue);
}

public void ActivefaultCC() throws InterruptedException {
	
	
	WebElement ActivefaltCC = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[10]/div[1]/span"));
    Actions actions = new Actions(ldriver);
    actions.doubleClick(ActivefaltCC).perform();
    Thread.sleep(2000);

    String color = ActivefaltCC.getCssValue("color");
    System.out.println("Color of the text element: " + color);

    String textValue = ActivefaltCC.getText();
    System.out.println("Active Fault  value: " + textValue);

   // Assert.assertTrue(color.equals("rgb(0, 0, 0)") || color.equals("black"));
    
    if (color.equals("rgb(0, 0, 0)") || color.equals("black")) {
        System.out.println("Active Fault is equal to 0, The text color is black.");
    } else {
        System.out.println("Active Fault is greater 1, the text color is not black.");
    }
    
   // Assert.assertEquals("The text value is expected.", "0", textValue);
}

public void kpiSearch1() throws InterruptedException{
	
    //WebElement selectKpi = ldriver.findElement(By.xpath("//*[@id=\"simple-tab-1\"]"));
    //selectKpi.click();
	//Thread.sleep(3000);
    WebElement kpisearchBar = ldriver.findElement(By.xpath("//input[@aria-label='Search in the data grid']"));
    kpisearchBar.click();
    kpisearchBar.sendKeys("Camal Twin");
    
    
    Thread.sleep(2000); // Adjust the wait time as needed

    // Assuming there's a WebElement representing the search results, you can locate it here
    WebElement searchResults1 = ldriver.findElement(By.xpath("//input[@aria-label='Search in the data grid']")); // Update the locator as per your HTML structure

    // Check if the search key was sent successfully
    if (searchResults1.getText().contains("Camal Twin")) {
        // Assertion to check if search results contain the expected text
   //     Assert.assertTrue(searchResults1.getText().contains("Camal Twin"), "Search results do not contain expected text: Camal Twin");
    } else {
        // If the search key was not sent successfully or if the data is not available, assert no data message
    //    Assert.assertTrue(searchResults1.getText().contains("No data"), "No data message not displayed when expected");
    }  
}
	
// 
	public void selectFaultList() throws InterruptedException{
		ldriver.findElement(By.xpath("//*[@id=\"simple-tab-2\"]")).click();
		Thread.sleep(2000);
		      
	}
	
	public void faultListsearch() throws InterruptedException{
	    WebElement selectfl = ldriver.findElement(By.xpath("//*[@id=\"simple-tab-2\"]"));
	    selectfl.click();
	    
	    WebElement flsearchBar = ldriver.findElement(By.xpath("//input[@aria-label='Search in the data grid']"));
	    flsearchBar.click();
	    flsearchBar.sendKeys("Camal Twin");
	}
	public void breadCrumb() throws InterruptedException{
		WebElement bc = ldriver.findElement(By.xpath("//span[@class='prev-pg']"));
		bc.click();
	}
	
	
	public void gridcheck1() throws InterruptedException{
	    WebElement graphcheck= ldriver.findElement(By.xpath("//*[@id=\"vessel-gridContainer\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/span"));
	    graphcheck.click();
	    Thread.sleep(5000);
	}
	
	public void gridcheck2() throws InterruptedException{
	    WebElement graphcheck2= ldriver.findElement(By.xpath("//*[@id=\"vessel-gridContainer\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
	    graphcheck2.click();
	    Thread.sleep(5000);
	}

	public void fleetValidate() throws InterruptedException{
	    WebElement clickOwner = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div"));
	    clickOwner.click();
	    Thread.sleep(3000);
	    WebElement ownerElement = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div"));
	    Assert.assertTrue(ownerElement.isDisplayed());
	}
	
	public void fleetValidate3() throws InterruptedException{
	    WebElement textCheck1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[4]/div[1]"));
	    Actions actions = new Actions(ldriver);
	    actions.doubleClick(textCheck1).perform();
	    actions.click().build().perform();
	    Thread.sleep(2000);
	    
	    String textValue1 = textCheck1.getText();
	    System.out.println("Text value: " + textValue1);
	    
	    Assert.assertEquals("The text value is expected.", "Camal Twin", textValue1);
	}

	
	
	public void fleetValidate2() throws InterruptedException{
	    WebElement hoverOwner = ldriver.findElement(By.xpath("//*[@id=\"map0\"]/div[1]/div[4]/img[2]"));
	    hoverOwner.click();
	    Thread.sleep(3000);
	    WebElement hoverOwnerElement = ldriver.findElement(By.xpath("//*[@id=\\\"map0\\\"]/div[1]/div[4]/img[2]"));
	    Assert.assertTrue(hoverOwnerElement.isDisplayed());
	    
	}
	
	
//TC29

	public void selectDatePicker() throws InterruptedException{
		//ldriver.findElement(By.xpath("//div[@class='react-datetimerange-picker react-datetimerange-picker--closed react-datetimerange-picker--disabled date']")).click();
		//Thread.sleep(2000);
		
		WebElement selectfl =ldriver.findElement(By.xpath("//*[@id=\"simple-tab-2\"]"));
	    selectfl.click();
		
		ldriver.findElement(By.xpath("//div[@class='react-datetimerange-picker react-datetimerange-picker--closed react-datetimerange-picker--disabled date']")).click();
		Thread.sleep(2000);
		
	    WebElement datePicker = ldriver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"));
	    datePicker.click();
	    Thread.sleep(2000);
	    
	    WebElement datePicker2 = ldriver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"));
	    datePicker2.click();
	    Thread.sleep(2000);
	    
	    WebElement selectYear = ldriver.findElement(By.xpath("//button[normalize-space()='2022']"));
	    selectYear.click();
	    Thread.sleep(2000);
	    
	    WebElement selectMonth = ldriver.findElement(By.xpath("//abbr[@aria-label='February 2022']"));
	    selectMonth.click();
	    Thread.sleep(2000);
	    
	    WebElement selectFromDate = ldriver.findElement(By.xpath("//abbr[@aria-label='February 1, 2022']"));
	    selectFromDate.click();
	    Thread.sleep(2000);
	    
	    WebElement selectToDate1 = ldriver.findElement(By.xpath("//*[@id=\"dashboard_container\"]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[29]"));
	    selectToDate1.click();
	    Thread.sleep(2000);
	    
	    WebElement apply = ldriver.findElement(By.xpath("//button[@id='applyRangeButton']"));
	    apply.click();
	    Thread.sleep(2000);  
	    
	    WebElement proceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]  "));
	    proceed.click();
	    Thread.sleep(2000);  
	
//	    WebElement fYear = ldriver.findElement(By.xpath("//div[@class='selectbox__values selectbox__selected']//div[@class='react-datetimerange-picker__wrapper']//div[1]//input[2]"));
//	    fYear.click();
//	    fYear.sendKeys("2020");
//	    Thread.sleep(5000);
//	    
//	    WebElement fMonth = ldriver.findElement(By.xpath("//div[@class='selectbox__values selectbox__selected']//div[@class='react-datetimerange-picker__wrapper']//div[1]//input[3]"));
//	    fMonth.click();
//	    fMonth.sendKeys("02");
//	    Thread.sleep(5000);
//	    
//	    WebElement fDate = ldriver.findElement(By.xpath("//div[@class='selectbox__values selectbox__selected']//div[@class='react-datetimerange-picker__wrapper']//div[1]//input[4]"));
//	    fDate.click();
//	    fDate.sendKeys("14");
//	    Thread.sleep(5000);
//	    
//	    
//	    WebElement fHour = ldriver.findElement(By.xpath("//div[@class='selectbox__values selectbox__selected']//div[@class='react-datetimerange-picker__wrapper']//div[1]//input[5]"));
//	    fHour.click();
//	    fHour.sendKeys("15");
//	    Thread.sleep(5000);
//	    
//	    WebElement fMin = ldriver.findElement(By.xpath("//div[@class='selectbox__values selectbox__selected']//div[@class='react-datetimerange-picker__wrapper']//div[1]//input[6]"));
//	    fMin.click();
//	    fMin.sendKeys("05");
//	    Thread.sleep(5000);
//	    
//	    WebElement fSec = ldriver.findElement(By.xpath("//div[@class='selectbox__values selectbox__selected']//div[@class='react-datetimerange-picker__wrapper']//div[1]//input[7]"));
//	    fSec.click();
//	    fSec.sendKeys("00");
//	    Thread.sleep(5000);
//	    
//	    
//	    WebElement tYear = ldriver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r']//div[2]//input[2]"));
//	    tYear.click();
//	    tYear.sendKeys("2020");
//	    Thread.sleep(5000);
//	    
//	    WebElement tMonth = ldriver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r']//div[2]//input[3]"));
//	    tMonth.click();
//	    tMonth.sendKeys("02");
//	    Thread.sleep(5000);
//	    
//	    WebElement tDate = ldriver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r']//div[2]//input[4]"));
//	    tDate.click();
//	    tDate.sendKeys("18");
//	    Thread.sleep(5000);
//	    
//	    WebElement tHour = ldriver.findElement(By.xpath("///div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r']//div[2]//input[5]"));
//	    tHour.click();
//	    tHour.sendKeys("15");
//	    Thread.sleep(5000);
//	    
//	    WebElement tMin = ldriver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r']//div[2]//input[6]"));
//	    tMin.click();
//	    tMin.sendKeys("05");
//	    Thread.sleep(5000);
//	    
//	    WebElement tSec = ldriver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r']//div[2]//input[7]"));
//	    tSec.click();
//	    tSec.sendKeys("00");
//	    Thread.sleep(5000);
//	    
//	    WebElement appTimeChange = ldriver.findElement(By.xpath("//button[@id='applyRangeButton']"));
//	    appTimeChange.click();
//	    Thread.sleep(5000);
//	    
//	    WebElement proceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
//	    proceed.click();
//	    Thread.sleep(5000);
	   	 	           
	}
   
//
	
	public void selectMonth() throws InterruptedException{
	    WebElement datePicker = ldriver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"));
	    datePicker.click();
	    Thread.sleep(2000);
	    
	    WebElement datePicker2 = ldriver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']"));
	    datePicker2.click();
	    Thread.sleep(2000);
	  //button[@class='react-calendar__navigation__label']
	    // Double click on month to change the year
//	    Actions actions = new Actions(driver);
//	    actions.doubleClick(datePicker).perform();
//	    Thread.sleep(6000);
	    // Click on the go backward button to change the year
	    WebElement backToyear = ldriver.findElement(By.xpath("//button[contains(text(),'‹')]"));
	    backToyear.click();
	    Thread.sleep(6000);
//	    WebElement goBackwardButton = ldriver.findElement(By.xpath("//button[contains(@class, 'go-back')]"));
//	    goBackwardButton.click();
 
	    // Click on the month January
	    WebElement selectYear = ldriver.findElement(By.xpath("//button[normalize-space()='2020']"));
	    selectYear.click();
	    Thread.sleep(6000);
 
	    // Click on the date
	    WebElement selectMonth = ldriver.findElement(By.xpath("//div[@class='react-calendar__viewContainer']//button[2]"));
	    selectMonth.click();
	    Thread.sleep(6000);
	    
	    WebElement selectFdate = ldriver.findElement(By.xpath("//abbr[@aria-label='February 28, 2020']"));
	    selectFdate.click();
	    Thread.sleep(6000);
	  
	    WebElement selectTdate = ldriver.findElement(By.xpath("//abbr[@aria-label='February 29, 2020']"));
	    selectTdate.click();
	    Thread.sleep(6000);
	    
//	    WebElement dateElement3 = ldriver.findElement(By.xpath("//button[normalize-space()='2024']"));
//	    dateElement3.click();
//	    Thread.sleep(6000);
//	  
//	    WebElement dateElement4 = ldriver.findElement(By.xpath("//abbr[@aria-label='February 2024']"));
//	    dateElement4.click();
//	    Thread.sleep(6000);
//	    
//	    WebElement dateElement5 = ldriver.findElement(By.xpath("//abbr[@aria-label='February 19, 2024']"));
//	    dateElement5.click();
//	    Thread.sleep(6000);
	    
	    WebElement appTimeChange = ldriver.findElement(By.xpath("//button[@id='applyRangeButton']"));
	    appTimeChange.click();
	    Thread.sleep(6000);
	    
//	    WebElement proceed = ldriver.findElement(By.xpath("//*[@id=\"dialogProceedButton\"]"));
//	    proceed.click();
//	    Thread.sleep(6000);
	     
	}
	

}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void clickBabylon() throws InterruptedException{
//		
//		
//		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div")).click();
//		Thread.sleep(30000);	
//	
//		
//		
//
//	}
//	
//	public void selectCamal() throws InterruptedException{
//		
//		
//		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span")).click();
//		Thread.sleep(2000);
//		
//		
////		WebElement dropdown = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span"));
////		 
////		// Create Actions object
////		Actions actions = new Actions(ldriver);
////		 
////		// Move to the dropdown and click on it
////		actions.moveToElement(dropdown).click().build().perform();
////		 
////		Thread.sleep(1000); 
//		
//	}
//	
//	public void clickWinGD() throws InterruptedException{
//
//		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[2]/div")).click();
//		Thread.sleep(2000);			
//	}
//	
//	public void selectHEstar() throws InterruptedException{
//		WebElement dropdown = ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div/span"));
//		 
//		// Create Actions object
//		Actions actions = new Actions(ldriver);
//		 
//		// Move to the dropdown and click on it
//		actions.moveToElement(dropdown).click().build().perform();
//		 
//		Thread.sleep(1000); 
//	}
//	
//	public void clickShowSelected() throws InterruptedException{
//		
//		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]")).click();
//		Thread.sleep(2000);		
//	}
//	
//	public void clickFleetAnalysis() throws InterruptedException{
//		ldriver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div")).click();
//		Thread.sleep(2000);		
//	}
//	
//	public void clickSpeed() throws InterruptedException{
//		ldriver.findElement (By.xpath("//*[@id=\"simple-tab-1\"]")).click(); 
//		Thread.sleep(2000);
//	}
//	
//	public void clickKpiOverview() throws InterruptedException{
//		ldriver.findElement(By.xpath("//*[@id=\"simple-tab-1\"]")).click();
//		Thread.sleep(2000);
//	}
//	
//	public void clickFaultList() throws InterruptedException{
//		ldriver.findElement(By.xpath("//*[@id=\"simple-tab-2\"]")).click();
//		Thread.sleep(2000);
//	}
	
	
	
	
	

	
