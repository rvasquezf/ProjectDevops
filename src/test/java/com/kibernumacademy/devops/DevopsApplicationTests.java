package com.kibernumacademy.devops;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kibernumacademy.devops.entitys.Student;
import com.kibernumacademy.devops.repositories.IStudentRepository;


@SpringBootTest
class DevopsApplicationTests {

  @Test
  void contextLoads() {
  }
  
  @Autowired
  private IStudentRepository repository;

  @Test
  void testCourseIsString() throws Exception {
	  	  
      Iterable<Student> students = repository.findAll();
      for (Student student : students) {
          assertTrue(student.getCourse() instanceof String);
      }
  }
  
  

}
