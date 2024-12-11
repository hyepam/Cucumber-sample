import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"src/test/java/steps" , "src/test/java/utilities"},
        plugin = {"pretty"}
)
public class TestRunner {

}
