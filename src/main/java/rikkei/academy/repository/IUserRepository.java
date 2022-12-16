package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.academy.model.User;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User,Long> {
    Boolean existsByName(String name);
    Boolean existsByEmail(String email);
    Optional<User> findByName(String name);
    Boolean deleteUserByEmail(String email);
}
