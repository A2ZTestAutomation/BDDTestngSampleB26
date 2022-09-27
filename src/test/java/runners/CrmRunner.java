package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = "src//test//resources//CrmFeatures//",
		glue= {"stepDefs"},
		monochrome=true,
//		dryRun = false,
		plugin= {
//				"pretty",
				"html:target/Reports/HtmlReport.html"
		},
//		tags = "@SmokeTest"
//		tags = "@RegressionTest"
//		tags = "@RegressionTest or @SmokeTest"
//		tags = "@RegressionTest and @SmokeTest"
//		tags = "@RegressionTest"
//		tags = "@PhaseTwo"
//		tags = "@PhaseTwo and @SmokeTest"
//		tags = "@PhaseTwo and not @SmokeTest"
//		tags = "@PhaseTwo and @SmokeTest or @PhaseOne and @RegressionTest"
//		tags = "@PhaseTwo and @SmokeTest or @PhaseOne and @RegressionTest"
//		tags = "@PhaseOne and not @SmokeTest and not @RegressionTest"
		tags = "@PhaseTwo and @SmokeTest or @PhaseTwo and @RegressionTest"
		)

public class CrmRunner extends AbstractTestNGCucumberTests{
	

}
