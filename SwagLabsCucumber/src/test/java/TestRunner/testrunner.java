package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
features= "C:\\Users\\HP\\eclipse-workspace\\SwagLabsCucumber\\swaglabscucumber\\SwagLabs.feature",
//features= ".//Feature//Login.feature",
glue= {"StepDefinitions"},
plugin= {"pretty",
"html:Reports/myreports.html",
"html:Reports/myreports.json",
//"rerun:target/rerun.txt",
},
dryRun=false,
monochrome=true
//tags="@Sanity"
)

public class testrunner {

}
