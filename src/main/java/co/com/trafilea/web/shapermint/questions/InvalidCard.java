package co.com.trafilea.web.shapermint.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.trafilea.web.shapermint.userinterfaces.buy.PaymentPage.LBL_INVALID_CARD_NUMBER;

@AllArgsConstructor
public class InvalidCard implements Question<Boolean> {
    private final String message;

    public static InvalidCard inPay(String message) {
        return new InvalidCard(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_INVALID_CARD_NUMBER.of(message).isVisibleFor(actor);
    }
}
