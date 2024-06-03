package co.com.trafilea.web.shapermint.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GeneralPage {
    public static final Target GENERAL_PATH_DATA_TESTID = Target.the("General path to data-testid")
            .locatedBy("//*[@data-testid='{0}']");
}
