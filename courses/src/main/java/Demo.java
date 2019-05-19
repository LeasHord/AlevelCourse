import entities.Group;
import entities.Teacher;
import jdbc.JDBCConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class Demo {
    public static SessionFactory sessionFactory;

    public static void main(String[] args) {


        JDBCConnection conn = new JDBCConnection();
        conn.createTable();


        sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Teacher teacher = new Teacher();
        teacher.setName("Johnn");
        teacher.setSurname("Smith");
        teacher.setExperience(5);
        teacher.setPhone("78962354711");


        Teacher teacher1 = new Teacher();
        teacher.setName("Alice");
        teacher.setSurname("McLeaf");
        teacher.setExperience(1);
        teacher.setPhone("78963352718");

        Teacher teacher2 = new Teacher();
        teacher.setName("Michael");
        teacher.setSurname("Wallington");
        teacher.setExperience(6);
        teacher.setPhone("787722345678");

        Teacher teacher3 = new Teacher();
        teacher.setName("Beth");
        teacher.setSurname("Rooth");
        teacher.setExperience(4);
        teacher.setPhone("78998763456");

        Teacher teacher4 = new Teacher();
        teacher.setName("Olive");
        teacher.setSurname("Young");
        teacher.setExperience(3);
        teacher.setPhone("78784927562");

        Teacher teacher5 = new Teacher();
        teacher.setName("Sam");
        teacher.setSurname("Welsh");
        teacher.setExperience(6);
        teacher.setPhone("79987515361");

        Teacher teacher6 = new Teacher();
        teacher.setName("Belle");
        teacher.setSurname("Miles");
        teacher.setExperience(5);
        teacher.setPhone("78667647960");

        Teacher teacher7 = new Teacher();
        teacher.setName("Jane");
        teacher.setSurname("Watson");
        teacher.setExperience(2);
        teacher.setPhone("70096673246");

        Teacher teacher8 = new Teacher();
        teacher.setName("Bruce");
        teacher.setSurname("Binn");
        teacher.setExperience(4);
        teacher.setPhone("78900678532");

        Teacher teacher9 = new Teacher();
        teacher.setName("Liam");
        teacher.setSurname("Graves");
        teacher.setExperience(9);
        teacher.setPhone("70085765241");

        session.save(teacher);
        session.save(teacher1);
        session.save(teacher2);
        session.save(teacher3);
        session.save(teacher4);
        session.save(teacher5);
        session.save(teacher6);
        session.save(teacher7);
        session.save(teacher8);
        session.save(teacher9);

        session.getTransaction().commit();
       sessionFactory.close();






    }

}
