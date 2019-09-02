package phanlamtruonghai.iscmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import phanlamtruonghai.iscmanagement.model.Major;;

@Repository
public interface MajorRepository extends JpaRepository<Major, Long>{

}
