package co.com.trafilea.web.shapermint.interactions.buy;

import co.com.trafilea.web.shapermint.interactions.iframe.SwitchTo;
import co.com.trafilea.web.shapermint.interactions.iframe.SwitchToDefault;
import co.com.trafilea.web.shapermint.models.CardInfo;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.trafilea.web.shapermint.userinterfaces.buy.PaymentPage.*;
import static co.com.trafilea.web.shapermint.utils.ConvertMapToModel.convertMapToCardInfo;

@AllArgsConstructor
public class FillCardInformation implements Interaction {
    private final CardInfo cardInfo;

    public static FillCardInformation toPay(List<Map<String, String>> cardInfo) {
        CardInfo cardInfo1 = convertMapToCardInfo(cardInfo.get(0));
        return Tasks.instrumented(FillCardInformation.class, cardInfo1);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchTo.Frame(IFRAME_CARD_NUMBER),
                Enter.theValue(cardInfo.getCardNumber()).into(LBL_CARD_NUMBER)
        );


        actor.attemptsTo(
                SwitchToDefault.content(),
                Enter.theValue(cardInfo.getCardName()).into(LBL_CARD_NAME)
        );

        actor.attemptsTo(
                SwitchTo.Frame(IFRAME_EXP_DATE),
                Enter.theValue(cardInfo.getExpDate()).into(LBL_EXP_DATE)
        );

        actor.attemptsTo(
                SwitchTo.Frame(IFRAME_CVV),
                Enter.theValue(cardInfo.getCvv()).into(LBL_CVV)
        );

        actor.attemptsTo(
                SwitchToDefault.content()
        );
    }
}
