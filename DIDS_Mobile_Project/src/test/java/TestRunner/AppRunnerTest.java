package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags = "@login or @marketGroup or @initialInvestment or @recommendedTM or @recommendedRSM",
        features = {
                "src/test/resources/Features"
                },

        glue = {"AppStepDefination"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/appFeature1.html"
        })

@Test
public class AppRunnerTest extends AbstractTestNGCucumberTests {


}
