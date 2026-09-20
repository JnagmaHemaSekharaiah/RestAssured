package CucumberPratice.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "src/test/java/CucumberPratice/Features/createFeature.feature",
    glue =  "CucumberPratice.StepDefinationsofjava",
    plugin = "pretty",
    monochrome = true
   )
public class Testrunner extends AbstractTestNGCucumberTests
{

}