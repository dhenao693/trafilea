package co.com.trafilea.web.shapermint.tasks;

import co.com.trafilea.web.shapermint.models.User;
import co.com.trafilea.web.shapermint.userinterfaces.DemoblazeHomePage;
import co.com.trafilea.web.shapermint.userinterfaces.login.LoginModalPage;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;
import java.util.Map;

import static co.com.trafilea.web.shapermint.utils.Constants.USER_IN_MEMORY;
import static co.com.trafilea.web.shapermint.utils.ConvertMapToModel.convertMapToUser;

@RequiredArgsConstructor
public class Login implements Task {
    private final User user;
    private boolean fillUserName = true;
    private boolean fillPassword = true;

    public static Login withTheUser(List<Map<String, String>> users) {
        return Tasks.instrumented(Login.class, convertMapToUser(users.get(0)));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(USER_IN_MEMORY, user);
        actor.attemptsTo(
                Click.on(DemoblazeHomePage.BTN_LOG_IN));
        actor.attemptsTo(Check.whether(fillUserName).andIfSo(Enter.theValue(user.getUsername()).into(LoginModalPage.LBL_USER)));
        actor.attemptsTo(Check.whether(fillPassword).andIfSo(Enter.theValue(user.getPassword()).into(LoginModalPage.LBL_PASSSWORD)));
        actor.attemptsTo(Click.on(LoginModalPage.BTN_START_LOGIN));
    }

    public Login withoutUser() {
        fillUserName = false;
        return this;
    }

    public Login withoutPassword() {
        fillPassword = false;
        return this;
    }

}
