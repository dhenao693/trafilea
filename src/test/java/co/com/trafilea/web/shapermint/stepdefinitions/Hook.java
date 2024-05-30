package co.com.trafilea.web.shapermint.stepdefinitions;


import co.com.trafilea.web.shapermint.tasks.Start;
import co.com.trafilea.web.shapermint.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;


public class Hook {

    @Before
    public void initializer() {
        setTheStage(new OnlineCast());
        theActor(Constants.DEFAULT_USER);
    }

    @Given("{string} is on Demoblaze page")
    public void isOnDemoblazeWeb(String actorName) {
        theActorCalled(actorName).wasAbleTo(Start.browser());
    }
}
