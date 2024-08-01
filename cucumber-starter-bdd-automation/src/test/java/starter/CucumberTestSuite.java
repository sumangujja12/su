package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber/report.html","json:target/cucumber/report.json"},
        features="src/test/resources/features/Loginfeature"



)

public class CucumberTestSuite {
	
} 