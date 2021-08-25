package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"Feature/function2.feature"},
glue= "stepdefn")

public class run2 extends AbstractTestNGCucumberTests {

}
