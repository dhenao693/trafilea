package co.com.trafilea.web.shapermint.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardInfo {
    private String cardNumber;
    private String cardName;
    private String expDate;
    private String cvv;
}
