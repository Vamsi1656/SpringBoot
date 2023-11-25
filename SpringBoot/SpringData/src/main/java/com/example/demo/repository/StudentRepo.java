package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> 
{

}
