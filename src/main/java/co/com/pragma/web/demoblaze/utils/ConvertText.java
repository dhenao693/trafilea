package co.com.pragma.web.demoblaze.utils;

import co.com.pragma.web.demoblaze.models.User;
import net.serenitybdd.screenplay.Actor;

import static co.com.pragma.web.demoblaze.utils.Constants.USER_IN_MEMORY;
import static java.lang.String.format;

public class ConvertText {
    public static String convertUsernameLogged(Actor actor){
        User user = actor.recall(USER_IN_MEMORY);
        return format(ValidateMessage.LOGGED_LBL,user.getUsername());
    }
}
