package co.com.pragma.web.demoblaze.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private String name;
    private String country;
    private String city;
    private String creditCard;
    private String month;
    private String year;
}
