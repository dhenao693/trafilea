package co.com.trafilea.web.shapermint.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SeeConfirmPay implements Question<String> {
    public static SeeConfirmPay modal() {
        return new SeeConfirmPay();
    }

    @Override
    public String answeredBy(Actor actor) {
        return "hola";
    }
}
