package co.com.trafilea.web.shapermint.utils;

import co.com.trafilea.web.shapermint.models.User;
import net.serenitybdd.screenplay.Actor;

import static co.com.trafilea.web.shapermint.utils.Constants.USER_IN_MEMORY;
import static java.lang.String.format;

public class ConvertText {
    public static String convertUsernameLogged(Actor actor){
        User user = actor.recall(USER_IN_MEMORY);
        return format(ValidateMessage.LOGGED_LBL,user.getUsername());
    }
}
