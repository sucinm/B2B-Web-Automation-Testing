package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/"}, // package class cucumber
        glue = { "step_definitions","hooks"}, // running final method
        plugin= {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"}
)

public class RunCukesTest
{
}