package co.com.trafilea.web.shapermint.tasks;

import co.com.trafilea.web.shapermint.userinterfaces.DemoblazeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Start implements Task {
    private DemoblazeHomePage demoblaze;

    public static Start browser() {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(demoblaze)
        );
    }
}
