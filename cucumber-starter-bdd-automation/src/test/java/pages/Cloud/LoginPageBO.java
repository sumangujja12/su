package pages.Cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageBO {

	WebDriver ldriver;





	public LoginPageBO(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void setUserName(){
		ldriver.findElement(By.id("email")).sendKeys("suman");

	}

	public void setUserPassword(){
		ldriver.findElement(By.id("password")).sendKeys("Suman#1234");

	}

	public void submitLogin(){
		ldriver.findElement(By.id("signInButton")).click();

	}




}
