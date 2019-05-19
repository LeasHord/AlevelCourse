package entities;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "groops", catalog = "alevelmodule")
public class Group implements Serializable {

    private String name;
    private String specialization_name;
    private int id;
    private int number_of_students;



    public Group() {

    }

    public Group(String name, String specialization_name,  int number_of_students) {
        this.name = name;
        this.specialization_name = specialization_name;

        this.number_of_students = number_of_students;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column (name = "name", unique = true, nullable = false)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column (name = "specialization_name", nullable = false, length = 50)

    public String getSpecialization_name() {
        return specialization_name;
    }

    public void setSpecialization_name(String specialization_name) {
        this.specialization_name = specialization_name;
    }

    @Column(name = "number_of_students", nullable = false, length = 20)

    public int getNumber_of_students() {
        return number_of_students;
    }

    public void setNumber_of_students(int number_of_students) {
        this.number_of_students = number_of_students;
    }

    private Teacher teacher_id;
    @OneToOne(fetch = FetchType.LAZY)

    public Teacher getTeacher_id() {
        return this.teacher_id;
    }

    public void setTeacher_id(Teacher teacher_id) {
        this.teacher_id = teacher_id;
    }
}
