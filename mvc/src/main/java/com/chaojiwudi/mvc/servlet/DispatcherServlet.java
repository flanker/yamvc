package com.chaojiwudi.mvc.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DispatcherServlet extends HttpServlet {

    @Override
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        dispatch(request, response, HttpMethod.Get);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        dispatch(request, response, HttpMethod.Post);
    }

    private void dispatch(HttpServletRequest request, HttpServletResponse response, HttpMethod method) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.write("Hello World");
    }

    private enum HttpMethod {
        Get, Post
    }
}
