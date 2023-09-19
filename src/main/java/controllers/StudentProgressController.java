package controllers;

import DB.DbManger;
import entity.Student;
import entity.Term;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentProgressController", value = "/studentProgress")
public class StudentProgressController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("progressStudentHidden");
        DbManger db = new DbManger();
        Student student = db.getStudentToId(id);
        req.setAttribute("student", student);
        List<Term> terms = db.getActivTermStudent(id);
        Term term = terms.get(0);
        req.setAttribute("terms", terms);
        req.setAttribute("term", term);

        req.getRequestDispatcher("JSP/progress_student.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
