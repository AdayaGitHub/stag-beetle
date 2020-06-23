package testRunner;

// Import Statements that are always required for the Runner Class
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// Tells JUnit that tests should run using Cucumber class present in ‘Cucumber.api.junit.Cucumber‘ package.
@RunWith(Cucumber.class)

// Tells Cucumber where to look for feature and step definition files
@CucumberOptions(features = "C:\\ecplise\\WebDriverExample-Java-Cucumber\\src\\test\\resources\\featureFiles"
, tags = {"@ForgotPasswordSuccess" }
, glue = { "stepDefinitionFiles" })
// Need to instantiate our class but no code is required

public class TestRunner {

}
