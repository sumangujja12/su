package pages.Cloud;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Datadownloaderpage {
	WebDriver ldriver;





	public Datadownloaderpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void Datadownloadericon(){
		ldriver.findElement(By.id("Data downloader_6")).click();

	}

	public void favorite() throws InterruptedException{
		Actions ac1 = new Actions(ldriver);
		WebElement st1 = ldriver.findElement(By.xpath("//*[@id=\"dropDownBoxFavSelection\"]"));
		//WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
		ac1.moveToElement(st1).click().perform();
		ac1.click().build().perform();
		Thread.sleep(9000);
		WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-expanded\"]"));
		//WebElement deflt=ldriver.findElement(By.xpath("//div[@class=\"dx-treelist-empty-space dx-treelist-collapsed\"]"));
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
	
	public void favoritedatareport() throws InterruptedException{
		Actions ac1 = new Actions(ldriver);
				
				WebElement st1=ldriver.findElement(By.xpath("//div[@data-dx_placeholder=\"Select Favourite\"]"));
				ac1.moveToElement(st1).doubleClick().build().perform();
				WebElement st2 = ldriver.findElement(By.xpath("//div[@class=\"dx-button-content\"]"));
				st2.click();
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
	
	public void Download1()throws InterruptedException {
	    WebElement DownloadIcon1 = ldriver.findElement(By.xpath("//div[@aria-label=\"Download (csv)\"]"));
	    DownloadIcon1.click();
	    Thread.sleep(2000);
	}
	
	public void selectDownload() throws InterruptedException{
		WebElement clickDownload = ldriver.findElement(By.xpath("//a[normalize-space()='Download']"));
		clickDownload.click();
		Thread.sleep(9000);
	}
	
	public void downloadValidate() throws InterruptedException{
		WebElement download = ldriver.findElement(By.xpath("//*[@id=\"gridContainer\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div[1]"));
	    Actions actions = new Actions(ldriver);
	    actions.doubleClick(download).perform();
//	    download.click();
	    Thread.sleep(3000);
		
		 WebElement textCheck1 = ldriver.findElement(By.xpath("//*[@id=\"gridContainer\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div[1]"));
		    Actions act2 = new Actions(ldriver);
		    act2.doubleClick(textCheck1).perform();
		    act2.click().build().perform();
		    Thread.sleep(2000);
		
		
		    String textValue = textCheck1.getText();
		    System.out.println("Text value: " + textValue);
		    
		    Assert.assertEquals(textValue, "Completed");
	}
}
