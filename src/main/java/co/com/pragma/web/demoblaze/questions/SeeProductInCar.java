package co.com.pragma.web.demoblaze.questions;

import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.pragma.web.demoblaze.userinterfaces.buy.CarPage.LBL_FIRST_PRODUCT_NAME;

@NoArgsConstructor
public class SeeProductInCar implements Question<String> {
    public static SeeProductInCar toBuy(){
        return new SeeProductInCar();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_FIRST_PRODUCT_NAME).answeredBy(actor);
    }
}
