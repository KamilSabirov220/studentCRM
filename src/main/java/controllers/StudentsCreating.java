package controllers;

import DB.DbManger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentsCreating", value = "/students_creating")
public class StudentsCreating extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("JSP/students_creating.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // перехватить данные
        // сохранить данные в БД
        // перейти на страницу студент_лист
        String sur_name = request.getParameter("sur_name");
        String name = request.getParameter("name");
        String group = request.getParameter("group");
        String date_in = request.getParameter("date_in");

        if (sur_name.isEmpty() || name.isEmpty() || group.isEmpty() || date_in.isEmpty()) {
        }
        else {
            DbManger manager = new DbManger();
            manager.createStudent(sur_name, name, group, date_in);
            response.sendRedirect("/student");
        }


    }
}
