package co.com.trafilea.web.shapermint.userinterfaces.buy;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.name;
import static org.openqa.selenium.By.xpath;

public class PaymentPage {
    public static final Target LBL_EMAIL = Target.the("Email")
            .located(name("email"));

    public static final Target LBL_FIRST_NAME = Target.the("")
            .located(name("delivery.buyer_name"));

    public static final Target LBL_LAST_NAME = Target.the("")
            .located(name("delivery.buyer_lastname"));

    public static final Target LBL_ADDRESS = Target.the("")
            .located(name("delivery.address1"));

    public static final Target LBL_APT = Target.the("")
            .located(name("delivery.address2"));

    public static final Target LBL_ZIP_CODE = Target.the("")
            .located(name("delivery.zip"));

    public static final Target LBL_CITY = Target.the("")
            .located(name("delivery.city"));

    public static final Target LBL_PHONE_NUMBER = Target.the("")
            .located(name("delivery.phone"));

    public static final Target CHK_SHIPPING_TYPE_CHECKED= Target.the("")
            .locatedBy("//p[text()='{0}']/parent::div/parent::div/parent::div//input[@checked]");

    public static final Target IFRAME_CARD_NUMBER = Target.the("Secure card number input frame")
            .located(xpath("//iframe[@title='Secure card number input frame']"));

    public static final Target LBL_CARD_NUMBER = Target.the("")
            .located(name("cardnumber"));

    public static final Target LBL_INVALID_CARD_NUMBER = Target.the("")
            .locatedBy("//span[text()='{0}']");

    public static final Target LBL_CARD_NAME = Target.the("")
            .located(xpath("//input[@data-testid='base-input' and @placeholder='Name on card']"));

    public static final Target IFRAME_EXP_DATE = Target.the("Secure expiration date input frame")
            .located(xpath("//iframe[@title='Secure expiration date input frame']"));

    public static final Target LBL_EXP_DATE = Target.the("Exp date")
            .located(name("exp-date"));

    public static final Target IFRAME_CVV = Target.the("Secure CVC input frame")
            .located(xpath("//iframe[@title='Secure CVC input frame']"));

    public static final Target LBL_CVV = Target.the("Cvv")
            .located(name("cvc"));

}
