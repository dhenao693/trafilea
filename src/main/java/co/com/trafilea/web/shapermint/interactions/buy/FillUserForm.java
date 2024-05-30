package co.com.trafilea.web.shapermint.interactions.buy;

import co.com.trafilea.web.shapermint.models.UserInfo;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Map;

import static co.com.trafilea.web.shapermint.utils.ConvertMapToModel.convertMapToUserInfo;

@RequiredArgsConstructor
public class FillUserForm implements Interaction {
    private final UserInfo userInfo;

    public static FillUserForm toPay(List<Map<String, String>> userInfo) {
        UserInfo userInfoModel = convertMapToUserInfo(userInfo.get(0));
        return Tasks.instrumented(FillUserForm.class, userInfoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

}
