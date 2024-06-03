package co.com.trafilea.web.shapermint.tasks.buy;

import co.com.trafilea.web.shapermint.interactions.WaitPage;
import co.com.trafilea.web.shapermint.interactions.buy.FillShippingAddressForm;
import co.com.trafilea.web.shapermint.models.UserInfo;
import co.com.trafilea.web.shapermint.questions.ProductAdd;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;
import java.util.Map;

import static co.com.trafilea.web.shapermint.userinterfaces.ShapermintHomePage.BTN_CLOSE_MODAL;
import static co.com.trafilea.web.shapermint.userinterfaces.ShapermintHomePage.BTN_OUR_FIRST_BEST_SELLER;
import static co.com.trafilea.web.shapermint.userinterfaces.buy.ItemPage.*;
import static co.com.trafilea.web.shapermint.userinterfaces.buy.PaymentPage.LBL_EMAIL;
import static co.com.trafilea.web.shapermint.utils.ConvertMapToModel.convertMapToUserInfo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RequiredArgsConstructor
public class SelectProduct implements Task {
    private final UserInfo userInfo;

    public static SelectProduct toPay(List<Map<String, String>> userInfo) {
        UserInfo userInfoModel = convertMapToUserInfo(userInfo.get(0));
        return Tasks.instrumented(SelectProduct.class, userInfoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CLOSE_MODAL),
                Scroll.to(BTN_OUR_FIRST_BEST_SELLER),
                Click.on(BTN_OUR_FIRST_BEST_SELLER)
        );

        String productName = LBL_PRODUCT_TITLE.resolveFor(actor).getText();
        actor.attemptsTo(Click.on(BTN_ADD_TO_CARD));
        actor.should(seeThat(ProductAdd.toCar(), equalTo(productName)));

        actor.attemptsTo(
                Click.on(BTN_PROCEED_TO_CHECKOUT),
                WaitPage.aSeconds(3)
        );
        actor.attemptsTo(
                Enter.theValue(userInfo.getEmail()).into(LBL_EMAIL),
                FillShippingAddressForm.toPay(userInfo)
        );

    }

}
