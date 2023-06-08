package com.kibernumacademy.devops.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kibernumacademy.devops.entitys.Student;
import com.kibernumacademy.devops.repositories.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
  private final IStudentRepository repository;
  
  public StudentServiceImpl(IStudentRepository repository) {
    this.repository = repository;
  }
  @Override
  public List<Student> listAllStudents() {
    return (List<Student>) repository.findAll();
  }

  @Override
  public Student saveStudent(Student student) {
    return repository.save(student);
  }

  @Override
  public Optional<Student> getStudentById(Long id) {
    return repository.findById(id);
  }

  @Override
  public Student updatedStudent(Student student) {
    return repository.save(student);
  }

  @Override
  public void deleteStudentById(Long id) {
    repository.deleteById(id);
  }
}
