package TestRuneer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/index.html","json:target/report.json"},
					features="src/main/java/.",
					glue= {"stepDefinitions"},
					tags="@Test",
					monochrome=true
						)
public class RunCukes{
	
}
