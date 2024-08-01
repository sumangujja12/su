package starterapi;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			 
        plugin = {"pretty","html:target/cucumber/report.html","json:target/cucumber/report.json"},
        features = "src/test/resources/features/postcodes",
        glue = {"starter.Stepdefinitions"}
        
        )

public class apistarter {

}
