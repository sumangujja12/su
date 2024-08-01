package pages.Cloud;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DataReportingpage {
	WebDriver ldriver;





	public DataReportingpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void Datareportingicon(){
		ldriver.findElement(By.id("Data Reporting_7")).click();

	}
	public void favoritedatareport() throws InterruptedException{
		Actions ac1 = new Actions(ldriver);
				
				WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
				ac1.moveToElement(st1).click().perform();
				
				Thread.sleep(9000);
				
				WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-collapsed\"]"));
				ac1.moveToElement(deflt).click().perform();
				Thread.sleep(9000);
				
				ac1.sendKeys(Keys.ARROW_DOWN).perform();
				
				ac1.sendKeys(Keys.ARROW_DOWN).perform();
				
				//ac1.sendKeys(Keys.ARROW_DOWN).perform();
				
				WebElement deflt1 = ldriver.findElement(By.xpath("//*[text()='Test2']"));;
				ac1.moveToElement(deflt1).click().perform();
				//.clickAndHold();
				
				//ac1.sendKeys(Keys.ARROW_DOWN).perform();
				
				//ac1.sendKeys(Keys.ENTER).perform();
				Thread.sleep(9000);
				
				
				
				
			}
	
	public void favoritedatareporttext() throws InterruptedException{
	
	WebElement Signalname = ldriver.findElement(By.xpath("//*[@id=\"gridContainer\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
    Actions actions = new Actions(ldriver);
    actions.doubleClick(Signalname).perform();
    Thread.sleep(2000);


    // Get the text value of the element
    String textValue = Signalname.getText();
    System.out.println("Signal value: " + textValue);
    Assert.assertEquals("The text value is expected.", "8999748", textValue);
	}
}
