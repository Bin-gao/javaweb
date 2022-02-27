package com.lbgao.serlvet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: lbgao
 * @Date: 2022/2/26 23:03
 */

public class ServletDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        RequestDispatcher dispatcher = context.getRequestDispatcher("/gp");//转发的请求路径
        dispatcher.forward(req,resp);//调用forward实现转发请求

    }
}
