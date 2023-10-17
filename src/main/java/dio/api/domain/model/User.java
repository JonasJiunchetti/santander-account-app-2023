package dio.api.domain.model;

import java.util.List;

import lombok.Data;

@Data
public class User {
    
    private Long id;
    private String name;    
    private Account account;
    private Card card;
    private List<Feature> features;
    private List<News> news;
}
