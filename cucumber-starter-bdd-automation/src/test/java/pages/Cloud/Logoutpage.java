package pages.Cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	WebDriver ldriver;





	public Logoutpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void Logouticon(){
		ldriver.findElement(By.xpath("//div[@aria-label='Logout']")).click();

	}
}
