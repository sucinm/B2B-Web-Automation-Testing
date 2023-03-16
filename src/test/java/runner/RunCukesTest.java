package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@Login"}, //identitas cucumber class
        features = {"classpath:features/"}, // package class cucumber
        glue = { "classpath:step_definitions"}, // running final method
        plugin= {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"}
)

public class RunCukesTest
{
}