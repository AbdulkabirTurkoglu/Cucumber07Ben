package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {"json:target/site/cucumber.json"} //basit report

)

public class _04_CountryMultiple extends AbstractTestNGCucumberTests {
}
