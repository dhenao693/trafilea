package co.com.trafilea.web.shapermint.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.trafilea.web.shapermint.userinterfaces.buy.ItemPage.LBL_PRODUCT_TITLE_IN_CAR;


public class ProductAdd implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_PRODUCT_TITLE_IN_CAR).answeredBy(actor);
    }

    public static ProductAdd toCar(){
        return new ProductAdd();
    }
}
