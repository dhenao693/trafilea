package co.com.pragma.web.demoblaze.userinterfaces.buy;

import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

@NoArgsConstructor
public class ShoppingCardPage {
    public static final Target BTN_PLACE_ORDER = Target.the("Place order button")
            .located(xpath("//button[text()='Place Order']"));
}
