package co.com.pragma.web.demoblaze.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class WaitPage implements Interaction {
    private int seconds;

    @Override
    public <T extends Actor> void performAs(T t) {
        new InternalSystemClock().pauseFor((seconds * 1000));
    }

    public static WaitPage aSeconds(int seconds) {
        return Tasks.instrumented(WaitPage.class, seconds);
    }
}
