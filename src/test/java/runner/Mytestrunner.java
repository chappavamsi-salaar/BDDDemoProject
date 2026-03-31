package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = "src/test/java/feature/Signin.feature",
	glue = 	"stepdefinition",
	plugin = {"json",  "html:target/TestReport.html"},
	monochrome= true
)

public class Mytestrunner extends AbstractTestNGCucumberTests{

}
