package co.com.pragma.web.demoblaze.utils;


import co.com.pragma.web.demoblaze.models.User;
import co.com.pragma.web.demoblaze.models.UserInfo;

import java.util.Map;

public class ConvertMapToModel {
    public static User convertMapToUser(Map<String, String> map) {
        return User.builder()
                .username(map.get("username"))
                .password(map.get("password"))
                .build();
    }

    public static UserInfo convertMapToUserInfo(Map<String, String> map) {
        return UserInfo.builder()
                .name(map.get("name"))
                .country(map.get("country"))
                .city(map.get("city"))
                .creditCard(map.get("creditCard"))
                .month(map.get("month"))
                .year(map.get("year"))
                .build();
    }
}
