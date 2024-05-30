package co.com.trafilea.web.shapermint.tasks.buy;

import co.com.trafilea.web.shapermint.models.UserInfo;
import co.com.trafilea.web.shapermint.questions.ProductAdd;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import java.util.List;
import java.util.Map;

import static co.com.trafilea.web.shapermint.userinterfaces.ShapermintHomePage.BTN_CLOSE_MODAL;
import static co.com.trafilea.web.shapermint.userinterfaces.ShapermintHomePage.BTN_OUR_FIRST_BEST_SELLER;
import static co.com.trafilea.web.shapermint.userinterfaces.buy.ItemPage.BTN_ADD_TO_CARD;
import static co.com.trafilea.web.shapermint.userinterfaces.buy.ItemPage.LBL_PRODUCT_TITLE;
import static co.com.trafilea.web.shapermint.utils.ConvertMapToModel.convertMapToUserInfo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RequiredArgsConstructor
public class FillUserForm implements Task {
    private final UserInfo userInfo;

    public static FillUserForm toPay(List<Map<String, String>> userInfo) {
        UserInfo userInfoModel = convertMapToUserInfo(userInfo.get(0));
        return Tasks.instrumented(FillUserForm.class, userInfoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CLOSE_MODAL)
        );

        actor.attemptsTo(
                Scroll.to(BTN_OUR_FIRST_BEST_SELLER));

        actor.attemptsTo(
                Click.on(BTN_OUR_FIRST_BEST_SELLER)
        );

        String productName = LBL_PRODUCT_TITLE.resolveFor(actor).getText();
        actor.attemptsTo(Click.on(BTN_ADD_TO_CARD));
        actor.should(seeThat(ProductAdd.toCar(), equalTo(productName)));

    }

}
