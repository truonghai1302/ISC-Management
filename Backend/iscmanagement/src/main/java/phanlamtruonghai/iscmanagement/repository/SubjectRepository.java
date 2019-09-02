package phanlamtruonghai.iscmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import phanlamtruonghai.iscmanagement.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
