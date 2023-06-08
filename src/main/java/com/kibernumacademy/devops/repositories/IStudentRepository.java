package com.kibernumacademy.devops.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kibernumacademy.devops.entitys.Student;

public interface IStudentRepository extends CrudRepository<Student,Long> {
}
