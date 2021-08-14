package com.crud;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/update2")
public class Update2 extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
    {
//       PrintWriter out=resp.getWriter();
//       out.println("in up");
        int idup2=Integer.parseInt(req.getParameter("upid"));
        String nameup2=req.getParameter("upname");
        int rollup2=Integer.parseInt(req.getParameter("uproll"));
        String departup2=req.getParameter("updepart");

        DaoOperation c=new DaoOperation();
        c.updatecon(new StdModel(idup2,nameup2,rollup2,departup2));

        DAO dup=new DAO();
        List<StdModel> l= dup.getstudentlist();

        req.setAttribute("list",l);
        RequestDispatcher rdup= req.getRequestDispatcher("viewall.jsp");
        rdup.forward(req,resp);
    }
}
