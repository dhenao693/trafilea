package co.com.trafilea.web.shapermint.tasks;

import co.com.trafilea.web.shapermint.questions.SeeAlertText;
import co.com.trafilea.web.shapermint.userinterfaces.buy.ItemPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.trafilea.web.shapermint.userinterfaces.DemoblazeHomePage.BTN_FIRST_PRODUCT;
import static co.com.trafilea.web.shapermint.utils.Constants.PRODUCT_IN_MEMORY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class AddToCard implements Task {
    private final String alertMessage;

    public static AddToCard withAlertMessage(String alertMessage) {
        return Tasks.instrumented(AddToCard.class, alertMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(PRODUCT_IN_MEMORY, BTN_FIRST_PRODUCT.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BTN_FIRST_PRODUCT),
                Click.on(ItemPage.BTN_ADD_TO_CARD)
        );
        actor.should(GivenWhenThen.seeThat(SeeAlertText.inScreen(), equalTo(alertMessage)));
    }
}
