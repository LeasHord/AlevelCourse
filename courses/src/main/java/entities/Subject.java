package entities;

import javax.persistence.*;
import java.io.Serializable;

@Table (name = "subjects", catalog = "alevelmodule")
public class Subject implements Serializable {

    private String subject;
    private int timeload;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Column(name = "subject", nullable = false)
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "subject", cascade = CascadeType.ALL)
    private Lecture lecture;

    public Lecture getLecture() {
        return this.lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    @ManyToOne
    @JoinColumn(name = "teachers_id")
    private Teacher responcibleTeacher;

    public Teacher getResponcibleTeacher() {
        return responcibleTeacher;
    }

    public void setResponcibleTeacher(Teacher responcibleTeacher) {
        this.responcibleTeacher = responcibleTeacher;
    }

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "specialization_name")
    private Specialization specialization;

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @Column(name = "timeload")

    public int getTimeload() {
        return timeload;
    }

    public void setTimeload(int timeload) {
        this.timeload = timeload;
    }
}
