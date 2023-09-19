package DB;

import entity.Discipline;
import entity.Student;
import entity.Term;

import java.util.List;

public interface IDbManger {
    List<Student> getActivStudent();

    void createStudent(String sur_name, String name, String group, String date_in);

    void deleteStudent(String ids);

    Student getStudentToId(String id);

    void modifyStudent(String id, String sur_name, String name, String group, String date_in);

    List<Term> getActivTermStudent(String id);

}
