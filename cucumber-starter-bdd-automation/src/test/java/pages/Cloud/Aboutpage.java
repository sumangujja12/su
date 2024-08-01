package pages.Cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Aboutpage {
	WebDriver ldriver;





	public Aboutpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void Abouticon(){
		ldriver.findElement(By.xpath("//div[@aria-label='About']")).click();

	}
}
