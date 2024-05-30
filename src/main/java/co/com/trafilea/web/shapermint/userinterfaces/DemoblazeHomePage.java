package co.com.trafilea.web.shapermint.userinterfaces;

import co.com.trafilea.web.shapermint.utils.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(Constants.URL_HOME)
public class DemoblazeHomePage extends PageObject {
    public static final Target BTN_LOG_IN = Target.the("Log in button")
            .located(By.id("login2"));
    public static final Target BTN_SING_UP = Target.the("Log out button")
            .located(By.id("login2"));
    public static final Target BTN_CAR = Target.the("Car button")
            .located(By.xpath("//a[text()='Cart']"));
    public static final Target BTN_FIRST_PRODUCT = Target.the("")
            .located(By.xpath("(//*[@class='hrefch'])[1]"));
    public static final Target LBL_NAME_USER = Target.the("")
            .located(By.id("nameofuser"));

}