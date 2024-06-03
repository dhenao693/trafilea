package co.com.trafilea.web.shapermint.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.trafilea.web.shapermint.userinterfaces.buy.PaymentPage.CHK_SHIPPING_TYPE_CHECKED;

@AllArgsConstructor
public class ValidateShippingMethod implements Question<Boolean> {
    private final String shippingType;

    public static ValidateShippingMethod inPay(String shippingType){
        return new ValidateShippingMethod(shippingType);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return CHK_SHIPPING_TYPE_CHECKED.of(shippingType).isVisibleFor(actor);
    }
}
