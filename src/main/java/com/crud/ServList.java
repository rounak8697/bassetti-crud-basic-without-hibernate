package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlist")
public class ServList extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    {
        try{
            DAO d=new DAO();

            List<StdModel> listserv=d.getstudentlist();                         //passing the list to this servlet
            //PrintWriter out= resp.getWriter();
            //out.println(listserv);

            req.setAttribute("list", listserv);                              //attaching the list in req

            RequestDispatcher rd = req.getRequestDispatcher("viewall.jsp");
            rd.forward(req, resp);                                             //sending req and resp to viewall.jsp

        } catch(Exception e){System.out.println(e);}
    }
}
