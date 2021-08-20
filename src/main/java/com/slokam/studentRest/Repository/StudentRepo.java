package com.slokam.studentRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.studentRest.Pojo.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
