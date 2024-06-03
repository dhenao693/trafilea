package co.com.trafilea.web.shapermint.interactions.buy;

import co.com.trafilea.web.shapermint.models.CardInfo;
import co.com.trafilea.web.shapermint.utils.ConvertMapToModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.trafilea.web.shapermint.userinterfaces.buy.PaymentPage.*;

@AllArgsConstructor
public class FillCardInformation implements Interaction {
    private final CardInfo cardInfo;

    public static FillCardInformation toPay(List<Map<String, String>> cardInfo){
        CardInfo cardInfo1 = ConvertMapToModel.convertMapToCardInfo(cardInfo.get(0));
        return Tasks.instrumented(FillCardInformation.class,cardInfo1);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cardInfo.getCardNumber()).into(LBL_CARD_NUMBER),
                Enter.theValue(cardInfo.getCardName()).into(LBL_CARD_NAME),
                Enter.theValue(cardInfo.getExpDate()).into(LBL_EXP_DATE),
                Enter.theValue(cardInfo.getCvv()).into(LBL_CVV)
        );
    }
}
