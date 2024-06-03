package co.com.trafilea.web.shapermint.interactions.buy;

import co.com.trafilea.web.shapermint.models.UserInfo;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.trafilea.web.shapermint.userinterfaces.buy.PaymentPage.LBL_EMAIL;

@AllArgsConstructor
public class FillShippingAddressForm implements Interaction {
    private final UserInfo userInfo;

    public static FillShippingAddressForm toPay(UserInfo userInfo){
        return Tasks.instrumented(FillShippingAddressForm.class, userInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userInfo.getEmail()).into(LBL_EMAIL)
        );

    }


}
