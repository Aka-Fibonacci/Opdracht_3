package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefiles"
        ,glue={"stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner {

}