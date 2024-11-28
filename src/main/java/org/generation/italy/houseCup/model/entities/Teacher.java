package org.generation.italy.houseCup.model.entities;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.lang.Class;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private long id;
    private String firstname;
    private String surname;
    private LocalDate dob;
    private char sex;
    private String mail;
    private String phone;
    @Column(name = "start_date")
    private LocalDate startdate;
    private String nickname;
    @ManyToMany
    @JoinTable(
            name = "teaching_assignments",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id")

    )
    private List<Course> courses = new ArrayList<>();

    public Teacher(){

    }

    public Teacher(long id, String firstname, String surname, LocalDate dob, char sex, String mail, String phone, LocalDate startdate, String nickname) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.dob = dob;
        this.sex = sex;
        this.mail = mail;
        this.phone = phone;
        this.startdate = startdate;
        this.nickname = nickname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
