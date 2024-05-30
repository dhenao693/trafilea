package co.com.pragma.web.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/login.feature",
                "src/test/resources/features/buy.feature"
        },
        glue = {"co/com/pragma/web/demoblaze/stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DemoblazeRunner {
}
