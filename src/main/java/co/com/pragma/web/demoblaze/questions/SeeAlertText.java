package co.com.pragma.web.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeeAlertText implements Question<String> {

    public static SeeAlertText inScreen(){
        return new SeeAlertText();
    }
    @Override
    public String answeredBy(Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        Alert alert =  wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
    }
}
