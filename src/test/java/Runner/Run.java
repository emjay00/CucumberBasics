package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"Steps"},

        //using tags by "@" labels
       // tags = "@dataload",
        //generating basic report ----- plugin = {"html:target/cucumber-reports/cucumber-html-report.html"}
        //monochrome = true    //to make better console output

        //generating extent reports
        plugin = {"html:target/cucumber-reports/cucumber-html-report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Run extends AbstractTestNGCucumberTests {

}
