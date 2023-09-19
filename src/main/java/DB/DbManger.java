package DB;

import entity.Discipline;
import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbManger implements IDbManger {

    @Override
    public List<Student> getActivStudent() {

        List<Student> res = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/java_7_student", "root", "Liy@0702Esm1r1306");

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student where status = 1;");
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setSur_name(rs.getString("sur_name"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate_in(rs.getDate("date_in"));
                student.setStatus((byte) 1);
                res.add(student);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    public void createStudent(String sur_name, String name, String group, String date_in) {

        List<Student> res = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/java_7_student", "root", "Liy@0702Esm1r1306");

            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO `student` " +
                    "(`sur_name`, `name`, `group`, `date_in`) " +
                    "VALUES ('"+sur_name+"', '"+name+"', '"+group+"', '"+date_in+"');");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteStudent(String ids) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/java_7_student", "root", "Liy@0702Esm1r1306");

            Statement statement = connection.createStatement();
            statement.execute("UPDATE `student` SET `status` = '0' WHERE (`id` in ("+ids+"));");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
