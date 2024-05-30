package co.com.trafilea.web.shapermint.tasks;

import co.com.trafilea.web.shapermint.questions.SeeProductInCar;
import co.com.trafilea.web.shapermint.userinterfaces.buy.ShoppingCardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.trafilea.web.shapermint.userinterfaces.DemoblazeHomePage.BTN_CAR;
import static co.com.trafilea.web.shapermint.utils.Constants.PRODUCT_IN_MEMORY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class SelectCar implements Task {
    public static SelectCar toBuy() {
        return new SelectCar();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String productToBuy = actor.recall(PRODUCT_IN_MEMORY);
        actor.attemptsTo(Click.on(BTN_CAR));
        actor.should(GivenWhenThen.seeThat(SeeProductInCar.toBuy(), equalTo(productToBuy)));
        actor.attemptsTo(Click.on(ShoppingCardPage.BTN_PLACE_ORDER));
    }
}
