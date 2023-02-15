package gov.uk.check.visa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "gov/uk/check/visa",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        tags = {"@smoke"}
)
public class TestRunnerSanity {

}
