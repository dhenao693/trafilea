package co.com.trafilea.web.shapermint.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String username;
    private String password;
}
