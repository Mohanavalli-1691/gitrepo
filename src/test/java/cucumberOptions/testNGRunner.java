package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features",dryRun = true, //features file location path
    //dryRun true it will check all the teststeps have the stepDef associated to it
    glue = "stepDefinitions",//just give the package name don't need entire path
    monochrome = true,
    tags = "@Regression and @Mortage", //use or also not tag name
    plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json","com.avenstack.extentreports.cucumber.adapter.ExtentucumberAdapter:"} //pretty to give results in color code like pass for green and red for fail
)//what kind of report we need : path
public class testNGRunner extends AbstractTestNGCucumberTests {

}
