package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.academy.model.Staff;
import rikkei.academy.model.User;

import java.util.Optional;

public interface IStaffRepository extends JpaRepository<Staff,Long> {

    Boolean existsByName(String name);
    Optional<Staff> findByName(String name);
    Boolean deleteStaffByName(String name);
}
