package com.lbgao.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @Auther: lbgao
 * @Date: 2022/2/27 14:31
 */

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1. 要获取下载文件的路径
        String realPath = this.getServletContext().getRealPath("/WEB-INF/classes/高.png");
        System.out.println("下载文件资源路径：" + realPath);
//        2. 下载的文件名是啥？
        String filename = realPath.substring(realPath.lastIndexOf("\\") + 1);
        System.out.println(filename);

//        3. 设置想办法让浏览器能够支持(Content-Disposition)下载我们需要的东西,
        resp.setHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode(filename,"UTF-8"));
//        4. 获取下载文件的输入流
        FileInputStream fis = new FileInputStream(realPath);
//        5. 创建缓冲区
        byte[] buffer = new byte[1024];
//        6. 获取OutputSteam对象
        ServletOutputStream out = resp.getOutputStream();
//        7. 讲FileOutputStream流写入到buffer缓冲区
//        8. 使用OutputStream讲缓冲区的数据输出到客户端
        int len = -1;
        while ((len = fis.read(buffer)) > 0) {
            out.write(buffer,0,len);
        }

        fis.close();
        out.close();

    }
}
