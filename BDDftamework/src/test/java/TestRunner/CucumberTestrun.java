package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(tags="",features= {"src/test/resources/feture"},
glue= {"StepDefination"},
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestrun extends AbstractTestNGCucumberTests  {

}
