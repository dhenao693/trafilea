package co.com.trafilea.web.shapermint.interactions.buy;

import co.com.trafilea.web.shapermint.models.UserInfo;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.trafilea.web.shapermint.userinterfaces.buy.PaymentPage.*;

@AllArgsConstructor
public class FillShippingAddressForm implements Interaction {
    private final UserInfo userInfo;

    public static FillShippingAddressForm toPay(UserInfo userInfo) {
        return Tasks.instrumented(FillShippingAddressForm.class, userInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userInfo.getFirstName()).into(LBL_FIRST_NAME),
                Enter.theValue(userInfo.getLastName()).into(LBL_LAST_NAME),
                Enter.theValue(userInfo.getAddress()).into(LBL_ADDRESS));

        actor.attemptsTo(
                Check.whether(!userInfo.getAptSuite().isEmpty())
                        .andIfSo(
                                Enter.theValue(userInfo.getAptSuite()).into(LBL_APT)
                        )
        );

        actor.attemptsTo(
                Enter.theValue(userInfo.getZipCode()).into(LBL_ZIP_CODE),
                Enter.theValue(userInfo.getCity()).into(LBL_CITY),
                Enter.theValue(userInfo.getPhone()).into(LBL_PHONE_NUMBER)
        );

    }


}
