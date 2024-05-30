package co.com.trafilea.web.shapermint.utils;


import co.com.trafilea.web.shapermint.models.UserInfo;

import java.util.Map;

public class ConvertMapToModel {


    public static UserInfo convertMapToUserInfo(Map<String, String> map) {
        return UserInfo.builder()
                .email(map.get("email"))
                .firstName(map.get("firstName"))
                .lastName(map.get("lastName"))
                .address(map.get("address"))
                .aptSuite(map.get("aptSuite"))
                .city(map.get("city"))
                .country(map.get("country"))
                .state(map.get("state"))
                .postalCode(map.get("postalCode"))
                .phone(map.get("phone"))
                .build();
    }
}
