package dev.krishvora09;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")  ---  This Works if we are using external tomcat
public class HelloServlet extends HttpServlet {

//    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Service Method Called!");

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello World</b></h2>");
    }

}
