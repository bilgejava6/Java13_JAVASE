package com.muhammet;

import com.muhammet.entity.Contact;
import com.muhammet.entity.Lesson;
import com.muhammet.entity.Student;
import com.muhammet.entity.Teacher;
import com.muhammet.repository.LessonRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Contact contact = Contact.builder()
                .city("Ankara")
                .build();
        Student student = Student.builder()
                .name("Muhammet")
                .contact(contact)
                .build();
        contact.setStudent(student);
        Teacher teacher = Teacher.builder()
                .name("Cemal")
                .build();
        Lesson lesson = Lesson.builder()
                .name("Java")
                .teacher(teacher)
                .build();
        teacher.setLesson(lesson);
        lesson.setStudents(List.of(student));
        student.setLessons(List.of(lesson));
        new LessonRepository().save(lesson);
    }
}
