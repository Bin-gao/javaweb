package com.lbgao.serlvet;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther: lbgao
 * @Date: 2022/2/26 22:27
 */

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.print("hello");

        ServletContext cont = this.getServletContext();

        String username = "lbgao";
        cont.setAttribute("username",username);
    }

}
