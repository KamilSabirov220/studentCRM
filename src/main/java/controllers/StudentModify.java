package controllers;

import DB.DbManger;
import entity.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentModify", value = "/modifyStudent")
public class StudentModify extends HttpServlet {
    private String id = "";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //получить данные студента
        //отобразить их
        //открыть страницу
        id = request.getParameter("modifyStudentHidden");
        DbManger db = new DbManger();
        Student student = db.getStudentToId(id);
        request.setAttribute("student", student);
        request.getRequestDispatcher("JSP/modify_student.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //получаем данные со страницы
        //сохроняем их
        //возвращаемся на страницу студенты

        String sur_name = request.getParameter("sur_name");
        String name = request.getParameter("name");
        String group = request.getParameter("group");
        String date_in = request.getParameter("date_in");

        DbManger db = new DbManger();
        db.modifyStudent(id, sur_name, name, group, date_in);

        response.sendRedirect("/student");


    }
}
