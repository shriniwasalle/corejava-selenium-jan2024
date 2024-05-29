package org.alpha.tejashri.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(// provide features & stepdefinition path
        //features, glue, tags are attributes
        features = "src/main/java/org/alpha/tejashri/cucumber/features/LoginWithBackground.feature",
        glue = "org.alpha.tejashri.cucumber.stepdefinitions",
        tags = "@regression"
)

public class TestRunnerLoginWithBackground {
}
