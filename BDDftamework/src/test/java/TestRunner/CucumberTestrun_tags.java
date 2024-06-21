package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags="@smoke and @regression",
features= {"src/test/resources/featureswithtag"},
glue= {"StepDefination"},
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestrun_tags extends AbstractTestNGCucumberTests {

}
