package dio.api.domain.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Card {
    
    private Long id;
    private String number;
    private BigDecimal limit;
}
