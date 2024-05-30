package co.com.trafilea.web.shapermint.userinterfaces.buy;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPayModalPage {
    public static final Target LBL_PAY_INFO = Target.the("")
            .located(By.xpath("//div[contains(@class,'sweet-alert')]/h2"));
}
