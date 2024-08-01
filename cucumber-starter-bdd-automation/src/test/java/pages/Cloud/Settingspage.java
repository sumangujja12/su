package pages.Cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Settingspage {
	WebDriver ldriver;





	public Settingspage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void Settingsicon(){
		ldriver.findElement(By.xpath("//div[@aria-label='Settings']")).click();

	}

}
