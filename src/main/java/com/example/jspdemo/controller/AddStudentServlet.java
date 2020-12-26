package com.example.jspdemo.controller;

import com.example.jspdemo.data.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "AddStudentServlet",
        urlPatterns = "/add-student"
)
public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/add-student.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        StudentDao.create(request.getParameter("firstName"), request.getParameter("lastName"));
        response.sendRedirect(request.getContextPath() + "/student-board");
    }
}
