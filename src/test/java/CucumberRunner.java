
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Junit runner with cucumber options
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "step_definitions", monochrome = true,
        dryRun = false, snippets = CucumberOptions.SnippetType.CAMELCASE,
        /* @Delete test case is left out on purpose
           All cases could be ran wih tag @AllUseCases */
        tags = {"@AllUseCases"},

        plugin = {"pretty", "html:report/html/"}

)

public class CucumberRunner {
}
