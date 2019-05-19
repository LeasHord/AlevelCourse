package entities;

import javax.persistence.*;

@Entity

@Table(name = "practices", catalog = "alevelmodule")
public class Practice {

    @ManyToOne
    @JoinColumn(name = "teachers_id")
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @OneToOne
    @JoinColumn(name = "subject")
    private Subject subject;

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    private int duration;
    @Column(name = "duration", nullable = false)

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private double payment;
    @Column(name = "payment", nullable = false)

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }


}
