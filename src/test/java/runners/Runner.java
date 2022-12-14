package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Runner class is start point of execution for our tests

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "steps",
        dryRun = false,
        monochrome = true
)
public class Runner {
}
