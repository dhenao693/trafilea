package co.com.pragma.web.demoblaze.tasks;

import co.com.pragma.web.demoblaze.questions.SeeAlertText;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pragma.web.demoblaze.userinterfaces.DemoblazeHomePage.BTN_FIRST_PRODUCT;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.ItemPage.BTN_ADD_TO_CARD;
import static co.com.pragma.web.demoblaze.utils.Constants.PRODUCT_IN_MEMORY;
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
                Click.on(BTN_ADD_TO_CARD)
        );
        actor.should(seeThat(SeeAlertText.inScreen(), equalTo(alertMessage)));
    }
}
