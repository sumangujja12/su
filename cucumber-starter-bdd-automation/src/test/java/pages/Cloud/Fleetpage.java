package pages.Cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Fleetpage {
	WebDriver ldriver;

	public Fleetpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void Fleeticon(){
		ldriver.findElement(By.id("Fleet overview_0")).click();

	}

	public void favoritefleet() throws InterruptedException{
		Actions ac1 = new Actions(ldriver);
	
		WebElement st1=ldriver.findElement(By.xpath("//div[@aria-label='Load All']"));
		//ac1.moveToElement(st1).click().perform();
		st1.click();
		Thread.sleep(9000);
		WebElement st2=ldriver.findElement(By.xpath("//td[@aria-label='Column Ship name']"));
		ac1.moveToElement(st2).click().perform();
		Thread.sleep(9000);
		//ac1.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(9000);
		//ac1.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(9000);
		//ac1.sendKeys(Keys.ENTER).perform();
		
	}

}

