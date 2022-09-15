package runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\features\\Descarga_documento.feature",
         glue = "stepDef",
         monochrome = true ,
         strict = true ,
         dryRun = false)
public class RunnerTest {

}
