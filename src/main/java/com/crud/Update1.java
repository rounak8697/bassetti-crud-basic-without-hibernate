package com.crud;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/update1")
public class Update1 extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        int idup1=Integer.parseInt(req.getParameter("id"));
        req.setAttribute("id",idup1);

        String nameup1= req.getParameter("name");
        req.setAttribute("name",nameup1);

        int rollup1=Integer.parseInt(req.getParameter("rollno"));
        req.setAttribute("rollno",rollup1);

        String departup1=req.getParameter("depart");
        req.setAttribute("depart",departup1);
//        PrintWriter out= resp.getWriter();
//        System.out.println(idup1);
        RequestDispatcher rd = req.getRequestDispatcher("Updatepage.jsp");
        rd.forward(req,resp);
    }
}
