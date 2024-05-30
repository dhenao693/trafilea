package co.com.trafilea.web.shapermint.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String aptSuite;
    private String city;
    private String country;
    private String state;
    private String postalCode;
    private String phone;
}
