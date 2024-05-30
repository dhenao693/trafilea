package co.com.pragma.web.demoblaze.questions;

import co.com.pragma.web.demoblaze.interactions.WaitPage;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.pragma.web.demoblaze.userinterfaces.DemoblazeHomePage.LBL_NAME_USER;

@NoArgsConstructor
public class ValidateLogin implements Question<String> {
    public static ValidateLogin inScreen(){
        return new ValidateLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitPage.aSeconds(2));
        return Text.of(LBL_NAME_USER).answeredBy(actor);
    }
}
