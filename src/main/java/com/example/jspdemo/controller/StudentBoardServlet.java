package com.example.jspdemo.controller;

import com.example.jspdemo.model.Student;
import com.example.jspdemo.data.StudentDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "StudentBoardServlet",
        urlPatterns = "/student-board"
)
public class StudentBoardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Student> studentList = new StudentDao().getAll();
        request.setAttribute("studentList", studentList);

        request.getRequestDispatcher("/jsp/studentBoard.jsp")
                .forward(request, response);
    }
}
