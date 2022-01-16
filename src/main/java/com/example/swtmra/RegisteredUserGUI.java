package com.example.swtmra;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/registeredUserWebpage"}, name = "regisetredServlet")
public class RegisteredUserGUI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("uname", request.getParameter("uname"));
        request.getRequestDispatcher("RegisteredUserWebPage.ftl").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
