package co.com.trafilea.web.shapermint.stepdefinitions;

import co.com.trafilea.web.shapermint.interactions.buy.FillCardInformation;
import co.com.trafilea.web.shapermint.tasks.buy.SelectProduct;
import co.com.trafilea.web.shapermint.questions.SeeConfirmPay;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BuyStepDefinition {
    @When("select first product and add to car to buy")
    public void selectProduct(List<Map<String, String>> userInfo) {
        theActorInTheSpotlight().attemptsTo(SelectProduct.toPay(userInfo));
    }

    @When("fill payment info")
    public void completePaymentInfo(List<Map<String, String>> cardInfo) {
        theActorInTheSpotlight().attemptsTo(FillCardInformation.toPay(cardInfo));
    }

    @Then("see the successful pay modal with message {string}")
    public void seeTheSuccessfulPayModal(String message) {
        theActorInTheSpotlight().should(seeThat(SeeConfirmPay.modal(), equalTo(message)));
    }
}
