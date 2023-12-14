package cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/features",glue={"stepDefination","helper"},tags="@Reg"
,plugin="json:target/jsonReports/test.json")
public class TestRunner extends AbstractTestNGCucumberTests{

}
