package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.academy.model.Feedback;

public interface IFeedbackRepository extends JpaRepository<Feedback,Long> {

}
