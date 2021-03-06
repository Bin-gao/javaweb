package com.lbgao.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @Auther: lbgao
 * @Date: 2022/2/27 15:06
 */

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //如何让浏览器5秒自动刷新一次
        resp.setHeader("refresh","10");
        //在内存中创建一个图片
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D g = (Graphics2D) image.getGraphics();

        //设置图片的背景颜色
//        g.setBackground();
        g.setColor(Color.white);
        g.fillRect(0,0,80,20);

        //给图片写数据
        g.setColor(Color.black);
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(makeNum(),0,20);

        //告诉浏览器，这个请求用图片的方式打开
        resp.setContentType("image/jpeg");
        //网站存在缓存，不然浏览器缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("chche-Control","no-cache");
        resp.setHeader("Prama","no-cache");

        //把图片写给浏览器
        ImageIO.write(image,"jpg",resp.getOutputStream());
    }


    private String makeNum() {
        Random random = new Random();

        String num = random.nextInt(9999999) + "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < 7 - num.length() ; i++) {
            sb.append(2);
        }
        return sb.toString() + num;
    }
}
