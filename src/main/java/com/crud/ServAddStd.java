package com.crud;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class ServAddStd extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        int idadd=Integer.parseInt(req.getParameter("userid"));
        String nameadd=req.getParameter("username");
        int rolladd=Integer.parseInt(req.getParameter("roll"));
        String departadd=req.getParameter("depart");

        DAO addDAO= new DAO();
        addDAO.creatstudent(new StdModel(idadd,nameadd,rolladd,departadd));

        RequestDispatcher rd2= req.getRequestDispatcher("servlist");
        rd2.forward(req, resp);
    }
}


