package co.com.pragma.web.demoblaze.userinterfaces.login;

import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

@NoArgsConstructor
public class LoginModalPage {
    public static final Target LBL_USER = Target.the("")
            .located(id("loginusername"));
    public static final Target LBL_PASSSWORD = Target.the("")
            .located(id("loginpassword"));
    public static final Target BTN_START_LOGIN = Target.the("Log in button")
            .located(xpath("//div[@id='logInModal']//button[text()='Log in']"));
    public static final Target BTN_CLOSE = Target.the("Close button")
            .located(xpath("//div[@id='logInModal']//button[text()='Close']"));

}
