package co.com.trafilea.web.shapermint.interactions.iframe;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SwitchToDefault implements Interaction {
    public static SwitchToDefault content() {
        return Tasks.instrumented(SwitchToDefault.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
    }
}
