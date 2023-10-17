package dio.api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.api.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String accountNumber);
}
