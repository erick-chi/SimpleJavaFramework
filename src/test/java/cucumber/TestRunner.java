package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/cucumber/features",
        glue = {"cucumber.definitions", "cucumber.hooks"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Test runner configuration
}
