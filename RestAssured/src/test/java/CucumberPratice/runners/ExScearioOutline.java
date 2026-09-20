package CucumberPratice.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/CucumberPratice/Features/exSecenarioOutline.feature",
        glue =  "CucumberPratice.StepDefinationsofjava",
        plugin = "pretty",
        monochrome = true
)
public class ExScearioOutline extends AbstractTestNGCucumberTests
{

}