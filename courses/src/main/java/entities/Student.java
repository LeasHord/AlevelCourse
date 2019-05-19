package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "students", catalog = "alevelmodule")
public class Student implements Serializable {

    private int id;
    private String name;



    public Student() {

    }

    public Student(String name) {
        this.name = name;
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

    @Column(name = "name", unique = true, nullable = false)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "students", cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    private Set<Subject> subjects = new HashSet<Subject>();

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    @ManyToOne
   @JoinColumn(name = "specialization_name")
   public Set<Specialization> specializations = new HashSet<Specialization>();



    @ManyToOne()
    @JoinColumn(name = "groops_name")
    private Group group;

}
