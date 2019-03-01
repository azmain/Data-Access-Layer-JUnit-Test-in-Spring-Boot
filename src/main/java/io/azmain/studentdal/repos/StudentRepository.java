package io.azmain.studentdal.repos;

import io.azmain.studentdal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
