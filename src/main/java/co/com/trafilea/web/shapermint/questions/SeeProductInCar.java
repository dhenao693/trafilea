package co.com.trafilea.web.shapermint.questions;

import co.com.trafilea.web.shapermint.userinterfaces.buy.CarPage;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

@NoArgsConstructor
public class SeeProductInCar implements Question<String> {
    public static SeeProductInCar toBuy(){
        return new SeeProductInCar();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CarPage.LBL_FIRST_PRODUCT_NAME).answeredBy(actor);
    }
}
