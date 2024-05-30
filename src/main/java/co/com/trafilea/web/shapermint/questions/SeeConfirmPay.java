package co.com.trafilea.web.shapermint.questions;

import co.com.trafilea.web.shapermint.userinterfaces.buy.ConfirmPayModalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeeConfirmPay implements Question<String> {
    public static SeeConfirmPay modal() {
        return new SeeConfirmPay();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ConfirmPayModalPage.LBL_PAY_INFO).answeredBy(actor);
    }
}
