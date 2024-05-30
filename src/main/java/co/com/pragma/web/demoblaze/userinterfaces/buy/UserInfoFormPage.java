package co.com.pragma.web.demoblaze.userinterfaces.buy;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserInfoFormPage {
    public static final Target LBL_NAME_MODAL = Target.the("Log in button")
            .located(By.id("name"));
    public static final Target LBL_COUNTRY_MODAL = Target.the("Log in button")
            .located(By.id("country"));
    public static final Target LBL_CITY_MODAL = Target.the("Log in button")
            .located(By.id("city"));
    public static final Target LBL_CARD_MODAL = Target.the("Log in button")
            .located(By.id("card"));
    public static final Target LBL_MONTH_MODAL = Target.the("Log in button")
            .located(By.id("month"));
    public static final Target LBL_YEAR_MODAL = Target.the("Log in button")
            .located(By.id("year"));

    public static final Target BTN_PURCHASE = Target.the("Log in button")
            .located(By.xpath("//button[text()='Purchase']"));

}
