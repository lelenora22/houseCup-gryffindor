package org.generation.italy.houseCup.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="scores")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="score_id")
    private long id;
    private int points;
    private String motivation;
    private LocalDate assign_date;
    @ManyToOne
    @JoinColumn(name = "stud_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name="teacher_id")
    private Teacher teacher;

    public Score(){

    }

    public Score(long id, int points, String motivation, LocalDate assign_date, Student student, Teacher teacher) {
        this.id = id;
        this.points = points;
        this.motivation = motivation;
        this.assign_date = assign_date;
        this.student = student;
        this.teacher = teacher;
    }



    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public LocalDate getAssign_date() {
        return assign_date;
    }

    public void setAssign_date(LocalDate assign_date) {
        this.assign_date = assign_date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
