package com.crud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class loginpage extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        //System.out.println("abc");
        String uname = request.getParameter("usname");
        String upass = request.getParameter("uspass");

        if (uname.equals("rounak") && upass.equals("1234"))
        {
            HttpSession session=request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("frontpage.jsp");
        } else
        {
            response.sendRedirect("error.jsp");
        }

    }
}
