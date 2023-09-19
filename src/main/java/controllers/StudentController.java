package controllers;

import DB.DbManger;
import entity.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentController", value = "/student")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // подключиться к БД
        // получить данные
        // передать данные на front
        DbManger db = new DbManger();
        List<Student> students = db.getActivStudent();

        request.setAttribute("students", students);
        request.getRequestDispatcher("JSP/student.jsp").forward(request, response);
    }

}
