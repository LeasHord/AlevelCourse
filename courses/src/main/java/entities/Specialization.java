package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Table(name = "specializations", catalog = "alevelmodule")
public class Specialization implements Serializable {

   @OneToMany(mappedBy = "specializations",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Student student;

   @OneToMany(mappedBy = "specializations",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Subject> subjects = new HashSet<Subject>();


}
