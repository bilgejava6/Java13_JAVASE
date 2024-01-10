package com.muhammet.repository;

import com.muhammet.entity.Teacher;

public class TeacherRepoitory extends RepositoryManager<Teacher,Long>{
    public TeacherRepoitory() {
        super(new Teacher());
    }
}
