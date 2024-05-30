package co.com.pragma.web.demoblaze.stepdefinitions;

import co.com.pragma.web.demoblaze.interactions.buy.FillUserForm;
import co.com.pragma.web.demoblaze.interactions.buy.FillUserFormWithout;
import co.com.pragma.web.demoblaze.questions.SeeAlertText;
import co.com.pragma.web.demoblaze.questions.SeeConfirmPay;
import co.com.pragma.web.demoblaze.tasks.AddToCard;
import co.com.pragma.web.demoblaze.tasks.SelectCar;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BuyStepDefinition {
    @When("select first product and add to car with alert {string} and buy")
    public void completeBuy(String alertMessage, List<Map<String, String>> userInfo) {
        theActorInTheSpotlight().attemptsTo(AddToCard.withAlertMessage(alertMessage));
        theActorInTheSpotlight().attemptsTo(SelectCar.toBuy());
        theActorInTheSpotlight().attemptsTo(FillUserForm.toPay(userInfo));
    }

    @When("select first product and add to car with alert {string} after user form")
    public void incompleteBuy(String alertMessage) {
        theActorInTheSpotlight().attemptsTo(AddToCard.withAlertMessage(alertMessage));
        theActorInTheSpotlight().attemptsTo(SelectCar.toBuy());
    }

    @When("select first product and add to car with alert {string}")
    public void selectFirstProduc(String alertMessage) {
        theActorInTheSpotlight().attemptsTo(AddToCard.withAlertMessage(alertMessage));
    }

    @When("select car to buy")
    public void selectCarToBuy() {
        theActorInTheSpotlight().attemptsTo(SelectCar.toBuy());
    }

    @When("fill user form to pay")
    public void fillUserFormToPay(List<Map<String, String>> userInfo) {
        theActorInTheSpotlight().attemptsTo(FillUserForm.toPay(userInfo));
    }

    @When("fill user form to pay without {string}")
    public void fillUserFormToPayWithoutName(String label, List<Map<String, String>> userInfo) {
        theActorInTheSpotlight().attemptsTo(FillUserFormWithout.theLabel(label).toPay(userInfo));
    }

    @Then("see the alert with message {string}")
    public void seeTheAlertWithMessage(String alertMessage) {
        theActorInTheSpotlight().should(seeThat(SeeAlertText.inScreen(), equalTo(alertMessage)));
    }

    @Then("see the successful pay modal with message {string}")
    public void seeTheSuccessfulPayModal(String message) {
        theActorInTheSpotlight().should(seeThat(SeeConfirmPay.modal(), equalTo(message)));
    }
}
