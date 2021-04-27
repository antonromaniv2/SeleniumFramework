package StepDefinitions;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" })
public class TestRunner {

}

/*@CucumberOptions(features="src/test/resources/Features", 
glue={"StepDefinitions"},
monochrome=true,
plugin = {"pretty","junit:target/JunitReports/XMLreport.xml", "json:target/JsonReports/jsonReport.json"})*/
