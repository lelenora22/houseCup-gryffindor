package org.generation.italy.houseCup.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "classes")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private long id;
    @Column(name = "class_name")
    private String className;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @OneToMany(mappedBy = "course")
    private List<Student> students = new ArrayList<>();
    @ManyToMany(mappedBy = "courses")
    private List<Teacher> teachers = new ArrayList<>();
    public Course(){

    }

    public Course(long id, String className) {
        this.id = id;
        this.className = className;
    }

    public long getId(){
        return id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
