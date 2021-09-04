package dio.springboot.personspringapi.repository;

import dio.springboot.personspringapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
