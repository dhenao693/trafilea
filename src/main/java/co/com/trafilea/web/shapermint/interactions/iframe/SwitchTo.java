package co.com.trafilea.web.shapermint.interactions.iframe;

import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

@RequiredArgsConstructor
public class SwitchTo implements Interaction {
    private final Target iFrame;

    public static SwitchTo Frame(Target iFrame) {
        return Tasks.instrumented(SwitchTo.class, iFrame);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(iFrame.resolveFor(actor));
    }
}
