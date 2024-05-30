package co.com.trafilea.web.shapermint.questions;

import co.com.trafilea.web.shapermint.interactions.WaitPage;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.trafilea.web.shapermint.userinterfaces.DemoblazeHomePage.LBL_NAME_USER;

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
