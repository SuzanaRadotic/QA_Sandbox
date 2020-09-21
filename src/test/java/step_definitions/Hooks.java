package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Hooks Class use annotations to define what will be triggered before each scenario and after each
 * scenario
 *
 * @Before - Used to instantiate web driver before each scenario calling method from
 *         DriverFactory class
 * @After - Used to shut down driver after execution of each scenario
 *
 */

public class Hooks {
    DriverFactory df = new DriverFactory();

    @Before()
    public void beforeScenario() throws MalformedURLException, InterruptedException {
        df.createDriver("chrome");
    }

    @After()
    public void afterScenario() {
        df.teardown();
    }
}
