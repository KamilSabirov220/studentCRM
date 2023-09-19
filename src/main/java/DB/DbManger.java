package DB;

import entity.Discipline;
import entity.Student;
import entity.Term;

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
                    "VALUES ('" + sur_name + "', '" + name + "', '" + group + "', '" + date_in + "');");

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
            statement.execute("UPDATE `student` SET `status` = '0' WHERE (`id` in (" + ids + "));");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student getStudentToId(String id) {
        Student res = new Student();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/java_7_student", "root", "Liy@0702Esm1r1306");

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student where id = " + id + ";");
            while (rs.next()) {
                res.setId(rs.getInt("id"));
                res.setSur_name(rs.getString("sur_name"));
                res.setName(rs.getString("name"));
                res.setGroup(rs.getString("group"));
                res.setDate_in(rs.getDate("date_in"));
                res.setStatus((byte) 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public void modifyStudent(String id, String sur_name, String name, String group, String date_in) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/java_7_student", "root", "Liy@0702Esm1r1306");

            Statement statement = connection.createStatement();
            statement.execute("UPDATE `student` SET \n" +
                    "`sur_name` = '" + sur_name + "', \n" +
                    "`name` = '" + name + "', \n" +
                    "`group` = '" + group + "', \n" +
                    "`date_in` = '" + date_in + "' \n" +
                    "WHERE (`id` = " + id + ");");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Term> getActivTermStudent(String id) {
        List<Term> res = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/java_7_student", "root", "Liy@0702Esm1r1306");

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM term t\n" +
                    "join term_discipline td on t.id = td.discipline_id\n" +
                    "join student_term_discipline std on std.term_discipline_id = td.id\n" +
                    "where std.student_id = " + id + "and t.status = 1 order by t.name;");
            while (rs.next()) {
                Term term = new Term();
                term.setId(rs.getInt("id"));
                term.setName(rs.getString("name"));
                term.setDuration(rs.getString("duration"));
                term.setStatus((byte) 1);
                res.add(term);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

}
