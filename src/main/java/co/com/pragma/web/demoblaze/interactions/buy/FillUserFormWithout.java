package co.com.pragma.web.demoblaze.interactions.buy;

import co.com.pragma.web.demoblaze.exceptions.LabelDoesNotExistExcecption;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class FillUserFormWithout implements Task {
    private final String label;
    private List<Map<String, String>> userInfo;

    public static FillUserFormWithout theLabel(String label) {
        return Tasks.instrumented(FillUserFormWithout.class, label);

    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (label.toUpperCase()) {
            case "NAME":
                actor.attemptsTo(FillUserForm.toPay(userInfo).withoutName());
                break;
            case "COUNTRY":
                actor.attemptsTo(FillUserForm.toPay(userInfo).withoutCountry());
                break;
            case "CITY":
                actor.attemptsTo(FillUserForm.toPay(userInfo).withoutCity());
                break;
            case "CREDITCARD":
                actor.attemptsTo(FillUserForm.toPay(userInfo).withoutCreditCard());
                break;
            case "MONTH":
                actor.attemptsTo(FillUserForm.toPay(userInfo).withoutMonth());
                break;
            case "YEAR":
                actor.attemptsTo(FillUserForm.toPay(userInfo).withoutYear());
                break;
            default:
                throw new LabelDoesNotExistExcecption("this label doesn't exist");
        }

    }

    public FillUserFormWithout toPay(List<Map<String, String>> userInfo) {
        this.userInfo = userInfo;
        return this;
    }
}
