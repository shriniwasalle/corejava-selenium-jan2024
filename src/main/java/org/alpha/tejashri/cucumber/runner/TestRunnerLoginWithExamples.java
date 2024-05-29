package org.alpha.tejashri.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(// provide features & stepdefinition path
        //features, glue are attributes
        features = "src/main/java/org/alpha/tejashri/cucumber/features/LoginWithExamples.feature",
        glue = "org.alpha.tejashri.cucumber.stepdefinitions"
)
public class TestRunnerLoginWithExamples {
}
