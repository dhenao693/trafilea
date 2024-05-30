package co.com.pragma.web.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.pragma.web.demoblaze.userinterfaces.buy.ConfirmPayModalPage.LBL_PAY_INFO;

public class SeeConfirmPay implements Question<String> {
    public static SeeConfirmPay modal() {
        return new SeeConfirmPay();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_PAY_INFO).answeredBy(actor);
    }
}
