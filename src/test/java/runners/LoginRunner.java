package runners;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="classpath:features",
        glue = "steps",
	    //tags = "@Regression",
	    //tags = "@Smoke",
       //tags = "@OtherScenario1",
        //tags = "@OtherLoginFeature",
        //tags= "@DDScenario1",
        tags = "@Scenario1",
		monochrome = true, 
		dryRun = false, 
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
					}
		
		)

		
public class LoginRunner {
	
	
}
