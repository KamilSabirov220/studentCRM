package controllers;

import DB.DbManger;
import entity.Discipline;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DisciplineList", value = "/discipline_list")
public class DisciplineList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("JSP/discipline_list.jsp").forward(request, response);
    }

}
