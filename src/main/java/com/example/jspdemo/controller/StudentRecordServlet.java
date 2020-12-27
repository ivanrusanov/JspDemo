package com.example.jspdemo.controller;

import com.example.jspdemo.data.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "StudentServlet",
        urlPatterns = "/student")
public class StudentRecordServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String studentID = request.getParameter("id");
        if (studentID != null) {
            int id = Integer.parseInt(studentID);
            new StudentDao().get(id)
                    .ifPresent(s -> request.setAttribute("student", s));
        }

        request.getRequestDispatcher("/jsp/studentRecord.jsp")
                .forward(request, response);
    }
}
