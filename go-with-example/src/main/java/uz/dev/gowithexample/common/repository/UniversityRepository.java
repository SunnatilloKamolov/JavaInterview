package uz.dev.gowithexample.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.gowithexample.common.model.University;

public interface UniversityRepository extends JpaRepository<University,Long> {

}
