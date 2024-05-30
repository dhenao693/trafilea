package co.com.pragma.web.demoblaze.interactions.buy;

import co.com.pragma.web.demoblaze.models.UserInfo;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;
import java.util.Map;

import static co.com.pragma.web.demoblaze.userinterfaces.buy.UserInfoFormPage.BTN_PURCHASE;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.UserInfoFormPage.LBL_CARD_MODAL;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.UserInfoFormPage.LBL_CITY_MODAL;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.UserInfoFormPage.LBL_COUNTRY_MODAL;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.UserInfoFormPage.LBL_MONTH_MODAL;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.UserInfoFormPage.LBL_NAME_MODAL;
import static co.com.pragma.web.demoblaze.userinterfaces.buy.UserInfoFormPage.LBL_YEAR_MODAL;
import static co.com.pragma.web.demoblaze.utils.ConvertMapToModel.convertMapToUserInfo;

@RequiredArgsConstructor
public class FillUserForm implements Interaction {
    private final UserInfo userInfo;
    private boolean fillName = true;
    private boolean fillCountry = true;
    private boolean fillCity = true;
    private boolean fillCreditCard = true;
    private boolean fillMonth = true;
    private boolean fillYear = true;

    public static FillUserForm toPay(List<Map<String, String>> userInfo) {
        UserInfo userInfoModel = convertMapToUserInfo(userInfo.get(0));
        return Tasks.instrumented(FillUserForm.class, userInfoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(fillName)
                        .andIfSo(Enter.theValue(userInfo.getName()).into(LBL_NAME_MODAL))
        );

        actor.attemptsTo(
                Check.whether(fillCountry)
                        .andIfSo(Enter.theValue(userInfo.getCountry()).into(LBL_COUNTRY_MODAL))
        );

        actor.attemptsTo(
                Check.whether(fillCity)
                        .andIfSo(Enter.theValue(userInfo.getCity()).into(LBL_CITY_MODAL))
        );

        actor.attemptsTo(
                Check.whether(fillCreditCard)
                        .andIfSo(Enter.theValue(userInfo.getCreditCard()).into(LBL_CARD_MODAL))
        );

        actor.attemptsTo(
                Check.whether(fillMonth)
                        .andIfSo(Enter.theValue(userInfo.getMonth()).into(LBL_MONTH_MODAL))
        );

        actor.attemptsTo(
                Check.whether(fillYear)
                        .andIfSo(Enter.theValue(userInfo.getYear()).into(LBL_YEAR_MODAL))
        );

        actor.attemptsTo(Click.on(BTN_PURCHASE));
    }

    public FillUserForm withoutName() {
        this.fillName = false;
        return this;
    }

    public FillUserForm withoutCountry() {
        this.fillCountry = false;
        return this;
    }

    public FillUserForm withoutCity() {
        this.fillCity = false;
        return this;
    }

    public FillUserForm withoutCreditCard() {
        this.fillCreditCard = false;
        return this;
    }

    public FillUserForm withoutMonth() {
        this.fillMonth = false;
        return this;
    }

    public FillUserForm withoutYear() {
        this.fillYear = false;
        return this;
    }
}
