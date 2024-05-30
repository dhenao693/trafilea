package co.com.pragma.web.demoblaze.tasks;

import co.com.pragma.web.demoblaze.questions.SeeProductInCar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pragma.web.demoblaze.userinterfaces.DemoblazeHomePage.BTN_CAR;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.ShoppingCardPage.BTN_PLACE_ORDER;
import static co.com.pragma.web.demoblaze.utils.Constants.PRODUCT_IN_MEMORY;
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
        actor.should(seeThat(SeeProductInCar.toBuy(), equalTo(productToBuy)));
        actor.attemptsTo(Click.on(BTN_PLACE_ORDER));
    }
}
