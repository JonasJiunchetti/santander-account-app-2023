package dio.api.domain.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Account {
    
    private Long id;
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;
    
}
