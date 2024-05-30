package co.com.pragma.web.demoblaze.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class LoginWithout implements Task {
    private List<Map<String, String>> users;
    private String labelTODoNotFill;

    public static LoginWithout theField(List<Map<String, String>> users, String field){
        return Tasks.instrumented(LoginWithout.class,users,field);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether("user".equalsIgnoreCase(labelTODoNotFill))
                .andIfSo(Login.withTheUser(users).withoutUser())
                .otherwise(Login.withTheUser(users).withoutPassword())
        );
    }
}
