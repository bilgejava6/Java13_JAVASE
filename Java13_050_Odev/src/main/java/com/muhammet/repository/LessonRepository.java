package com.muhammet.repository;

import com.muhammet.entity.Lesson;

public class LessonRepository extends RepositoryManager<Lesson,Long>{
    public LessonRepository() {
        super(new Lesson());
    }
}
