package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "teachers", catalog = "alevelmodule")
public class Teacher implements Serializable {

    private int id;
    private String name;
    private String surname;
    private String phone;
    private int experience;

    public Teacher() {

    }

    public Teacher(String name, String surname, String phone, int experience) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.experience = experience;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)

    @OneToMany(mappedBy = "teachers")
    private Set<Lecture>lectures = new HashSet<Lecture>();
    private Set<Subject> subjects = new HashSet<Subject>();
    private Set<Practice>practices = new HashSet<Practice>();

    public Set<Practice> getPractices() {
        return practices;
    }

    public void setPractices(Set<Practice> practices) {
        this.practices = practices;
    }

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name", unique = true, nullable = false, length = 50)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "surname", unique = true, nullable = false, length = 50)

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "phone", unique = true, nullable = false, length = 11)

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Group groop;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "teachers", cascade = CascadeType.ALL)
    public Group getGroop() {
        return groop;
    }

    public void setGroop(Group groop) {
        this.groop = groop;
    }


    @Column(name = "experience", unique = false, nullable = false, length = 20)

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


}
