package com.kibernumacademy.devops;

import com.kibernumacademy.devops.entitys.Student;
import com.kibernumacademy.devops.repositories.IStudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication implements CommandLineRunner {
  private final IStudentRepository repository;
  public DevopsApplication(IStudentRepository repository) {
    this.repository = repository;
  }
  public static void main(String[] args) {
    SpringApplication.run(DevopsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
 Student student1 = new Student("Miguel", "Ramos", "mramoscli@gmail.com", "Curso082");
 Student student2 = new Student("Camila", "Marquez", "cmarquez@gmail.com", "Curso083");
    repository.save(student1);
    repository.save(student2);

  }
}
