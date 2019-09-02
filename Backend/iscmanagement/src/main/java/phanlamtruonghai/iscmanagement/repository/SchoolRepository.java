package phanlamtruonghai.iscmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import phanlamtruonghai.iscmanagement.model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
