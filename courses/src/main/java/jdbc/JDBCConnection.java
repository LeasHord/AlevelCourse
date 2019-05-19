package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/alevelmodule?serverTimezone=UTC";

    static final String USER = "root";
    static final String PASS = "Lizo4ka@Koti4";

    public Connection conn = null;
    public Statement stmt = null;


    public void createTable() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                System.out.println("Connecting to a selected database...");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Connected database successfully...");
                System.out.println("Creating statement...");
                stmt = conn.createStatement();
                String sql = "CREATE TABLE teachers(" +
                        "id INT NOT NULL," +
                        "name VARCHAR (50) NOT NULL," +
                        "surname VARCHAR (20) NOT NULL," +
                        "phone INT (12)NOT NULL," +
                        "workExperience INT NOT NULL)";
                String sql1 = "CREATE TABLE students (" +
                        "id INT NOT NULL," +
                        "name VARCHAR (20) NOT NULL," +
                        "subject VARCHAR (20) NOT NULL," +
                        "specialization_Id VARCHAR (50) NOT NULL," +
                        "group_name VARCHAR (20) NOT NULL)";

                String sql2 = "CREATE TABLE subjects (" +
                        "subject VARCHAR (50) NOT NULL," +
                        "teachers_id INT NOT NULL," +
                        "students_id INT NOT NULL," +
                        "specialization_name VARCHAR (50) NOT NULL," +
                        "timeLoad INT NOT NULL)";

                String sql3 = "CREATE TABLE groops (" +
                        "name VARCHAR (20) NOT NULL," +
                        "number INT NOT NULL," +
                        "specialization_name VARCHAR (50) NOT NULL," +
                        "numberOfStudents INT NOT NULL)";

                String sql4 = "CREATE TABLE specializations(" +
                        "name VARCHAR (50) NOT NULL," +
                        "subject VARCHAR (50) NOT NULL)";

                String sql5 = "CREATE TABLE lectures(" +
                        "teachers_id INT NOT NULL," +
                        "subject VARCHAR (50) NOT NULL," +
                        "group_id INT NOT NULL," +
                        "duration INT NOT NULL," +
                        "cost DOUBLE NOT NULL)";

                String sql6 = "CREATE TABLE practices(" +
                        "teachers_id INT NOT NULL," +
                        "subject VARCHAR (50) NOT NULL," +
                        "group_id INT NOT NULL," +
                        "duration INT NOT NULL," +
                        "cost DOUBLE NOT NULL)";

                stmt.execute(sql);
                stmt.execute(sql1);
                stmt.execute(sql2);
                stmt.execute(sql3);
                stmt.execute(sql4);
                stmt.execute(sql5);
                stmt.execute(sql6);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

    }

}
