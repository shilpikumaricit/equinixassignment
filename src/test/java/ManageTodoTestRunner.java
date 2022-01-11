import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber_json_reports/wiki.json",
                "html:target/wiki-html"},
        strict = true,
        glue = {"wiki.stepDefinitions", "wiki.infrastructure"},
        features = {"src/test/resources/features/wiki.feature"}
)
public class ManageTodoTestRunner {
}
