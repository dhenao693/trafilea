package co.com.pragma.web.demoblaze.stepdefinitions;


import co.com.pragma.web.demoblaze.tasks.Start;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static co.com.pragma.web.demoblaze.utils.Constants.DEFAULT_USER;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class Hook {

    @Before
    public void initializer() {
        setTheStage(new OnlineCast());
        theActor(DEFAULT_USER);
    }

    @Given("{string} is on Demoblaze page")
    public void isOnDemoblazeWeb(String actorName) {
        theActorCalled(actorName).wasAbleTo(Start.browser());
    }
}
