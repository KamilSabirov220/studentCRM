package controllers;

import DB.DbManger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentDelete", value = "/deleteStudent")
public class StudentDelete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //получение данных
        //удаление
        //вернуться на контроллер студенты
        String ids = request.getParameter("deleteStudentHidden");
        DbManger db = new DbManger();
        db.deleteStudent(ids);
        response.sendRedirect("/student");
    }
}
