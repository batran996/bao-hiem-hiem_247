package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.academy.model.RankStaff;
import rikkei.academy.model.Role;
import rikkei.academy.model.RoleName;

import java.util.Optional;

public interface IRankStaffRepository extends JpaRepository<RankStaff,Long> {
    Optional<RankStaff> findByName(String name);
}
