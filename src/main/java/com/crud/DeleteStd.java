package com.crud;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/delete")
public class DeleteStd extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        int s=Integer.parseInt(req.getParameter("searchid"));

        DaoOperation c = new DaoOperation();
        c.deletecon(s);

        DAO deldao=new DAO();
        List<StdModel> l=deldao.getstudentlist();
        req.setAttribute("list",l);

        RequestDispatcher rd = req.getRequestDispatcher("viewall.jsp");
        rd.forward(req,resp);

    }
}
