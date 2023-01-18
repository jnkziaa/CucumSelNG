package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"StepDefinitions"}, monochrome = true,
        plugin = {
                "pretty",
                "json:target/cucumber-report-json/cucumber.json",
                "html:target/cucumber-report-html/cucumber.html",
                "junit:target/cucumber-report-junit/cucumber.xml"},
        tags = "@ourstorytest or @smoketest"
        )
public class TestRunner {
}
