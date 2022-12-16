package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.academy.model.Agency;

public interface IAgencyRepository extends JpaRepository<Agency,Long> {

}
