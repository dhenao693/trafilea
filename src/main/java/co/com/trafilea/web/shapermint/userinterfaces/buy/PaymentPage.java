package co.com.trafilea.web.shapermint.userinterfaces.buy;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage {
    public static final Target LBL_EMAIL = Target.the("")
            .located(By.xpath("//*[@data-testid='email-field']"));



    public static final Target LBL_CARD_NUMBER = Target.the("")
            .located(By.xpath(""));

    public static final Target LBL_CARD_NAME = Target.the("")
            .located(By.xpath(""));

    public static final Target LBL_EXP_DATE = Target.the("")
            .located(By.xpath(""));

    public static final Target LBL_CVV = Target.the("")
            .located(By.xpath(""));
}
