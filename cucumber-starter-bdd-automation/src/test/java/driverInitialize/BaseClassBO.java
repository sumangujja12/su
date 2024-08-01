package driverInitialize;



import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.XLUtils;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClassBO {

	

	WebDriver driver;

	public WebDriver seldriver() throws IOException 
	{
		String baseURL="https://wideui.dev2.wingd.digital/auth/login";
		String browser="chrome";
		if (browser.equalsIgnoreCase("chrome"))
		{   ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		    options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-sim-usage");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			
			//System.setProperty("webdriver.chrome.driver", "C://Users//INSHBS3//.cache//selenium//chromedriver//win32//109.0.5414.74//chromedriver.exe");
			//driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(baseURL);
		return driver;

	}



}
