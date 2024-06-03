package co.com.trafilea.web.shapermint.userinterfaces.buy;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class ItemPage {
    public static final Target LBL_PRODUCT_TITLE = Target.the("Product title")
            .located(xpath("//h1[@class='styles_summaryTitle__MluWn css-7p1x3i']"));

    public static final Target BTN_ADD_TO_CARD = Target.the("Add to card button")
            .located(xpath("//button[@data-testid='add-to-cart']"));

    public static final Target LBL_PRODUCT_TITLE_IN_CAR = Target.the("Our first best seller")
            .located(By.xpath("((//ul[@data-testid='line-items'])[1]//span)[1]"));

    public static final Target BTN_PROCEED_TO_CHECKOUT = Target.the("Button proceed to checkout")
            .located(By.xpath("(//*[@data-testid='proceed-to-checkout'])[1]"));
}
