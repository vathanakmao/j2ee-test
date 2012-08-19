package com.vathanakmao.testproj.j2eetest.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vathanakmao.testproj.j2eetest.util.WebUtil;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = -4270627945765174414L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("message", "Hello World!");
        WebUtil.forward("helloworld.jsp", request, response);
    }
}
