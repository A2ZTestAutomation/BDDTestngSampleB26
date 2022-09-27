package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//",
		glue= {"stepDefs"},
		monochrome=true,
//		dryRun = false,
		plugin= {
				"pretty",
				"html:target/Reports/HtmlReport.html",
		}
		)

public class GooglePageRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
