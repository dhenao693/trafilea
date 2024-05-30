package co.com.trafilea.web.shapermint.stepdefinitions;

import co.com.trafilea.web.shapermint.questions.ValidateLogin;
import co.com.trafilea.web.shapermint.tasks.Login;
import co.com.trafilea.web.shapermint.tasks.LoginWithout;
import co.com.trafilea.web.shapermint.utils.ConvertText;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {
    @When("login in app")
    public void loginInApp(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(Login.withTheUser(users));
    }

    @Then("see the correct username")
    public void seeTheCorrectUsername() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogin.inScreen(),
                equalTo(ConvertText.convertUsernameLogged(theActorInTheSpotlight()))));
    }

    @When("login in app without {string}")
    public void loginInAppWithoutUsername(String field, List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(LoginWithout.theField(users,field));
    }

    @When("login in app without all")
    public void loginInAppWithoutAll(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(Login.withTheUser(users).withoutUser().withoutPassword());
    }
}
