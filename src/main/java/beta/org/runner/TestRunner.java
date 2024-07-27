package beta.org.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/beta/org/features",
        glue="beta.org.stepdefinations"
)
public class TestRunner {
}
