package co.com.trafilea.web.shapermint.userinterfaces;

import co.com.trafilea.web.shapermint.utils.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl(Constants.URL_HOME)
public class ShapermintHomePage extends PageObject {
    public static final Target BTN_CLOSE_MODAL = Target.the("Button to close modal")
            .located(By.xpath("//small"));

    public static final Target BTN_OUR_FIRST_BEST_SELLER = Target.the("Our first best seller")
            .located(By.xpath("(//*[text()='Our Best Sellers']/parent::div//a)[1]"));


}