package com.muhammet.repository;

import com.muhammet.entity.Student;

public class StudentRepository extends  RepositoryManager<Student,Long>{
    public StudentRepository() {
        super(new Student());
    }
}
