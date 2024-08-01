package pages.Cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Fastdatauploaderpage {
	WebDriver ldriver;





	public Fastdatauploaderpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void Fdatauploadericon(){
		ldriver.findElement(By.id("Fast data bin file uploader_5")).click();

	}

	


}

