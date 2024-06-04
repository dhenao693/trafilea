package co.com.trafilea.web.shapermint.stepdefinitions;

import co.com.trafilea.web.shapermint.interactions.buy.FillCardInformation;
import co.com.trafilea.web.shapermint.questions.InvalidCard;
import co.com.trafilea.web.shapermint.questions.ValidateShippingMethod;
import co.com.trafilea.web.shapermint.questions.ValidateUrl;
import co.com.trafilea.web.shapermint.tasks.buy.SelectProduct;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class BuyStepDefinition {
    @When("select first product and add to car to buy")
    public void selectProduct(List<Map<String, String>> userInfo) {
        theActorInTheSpotlight().attemptsTo(SelectProduct.toPay(userInfo));
    }

    @When("fill payment info")
    public void completePaymentInfo(List<Map<String, String>> cardInfo) {
        theActorInTheSpotlight().attemptsTo(FillCardInformation.toPay(cardInfo));
    }

    @Then("see the shipping type {string}")
    public void seeTheShippingType(String shippingType) {
        theActorInTheSpotlight().should(seeThat(ValidateShippingMethod.inPay(shippingType)));
    }

    @Then("see the failed pay with message {string} in card")
    public void seeTheFailedPayWithMessageInCard(String cardMessage) {
        theActorInTheSpotlight().should(seeThat(InvalidCard.inPay(cardMessage)));
    }

    @Then("the url contains {string}")
    public void theUrlContains(String urlContain) {
        theActorInTheSpotlight().should(seeThat(ValidateUrl.active(), containsString(urlContain)));
    }
}
