package co.com.pragma.web.demoblaze.userinterfaces.buy;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ItemPage {
    public static final Target BTN_ADD_TO_CARD = Target.the("Add to card button")
            .located(xpath("//a[text()='Add to cart']"));

}
