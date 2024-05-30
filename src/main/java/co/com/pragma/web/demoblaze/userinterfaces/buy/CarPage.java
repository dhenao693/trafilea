package co.com.pragma.web.demoblaze.userinterfaces.buy;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarPage {
    public static final Target LBL_FIRST_PRODUCT_NAME = Target.the("Car button")
            .located(By.xpath("((//*[@id='tbodyid']//td)[2])[1]"));
}
