package dio.api.services;

import dio.api.domain.model.User;

public interface UserService {
    
    User findyById(Long id);

    User create(User userToCreate);
}
