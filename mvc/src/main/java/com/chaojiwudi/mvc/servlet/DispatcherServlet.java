package com.chaojiwudi.mvc.servlet;

import com.chaojiwudi.mvc.init.Initializer;
import com.chaojiwudi.mvc.router.Router;
import core.IocContainer;
import core.IocContainerBuilder;
import org.apache.velocity.app.Velocity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

public class DispatcherServlet extends HttpServlet {

    private Initializer initializer;
    private Router router;

    public DispatcherServlet() throws Exception {
        IocContainer container = new IocContainerBuilder().withPackageName("config").build();
        initializer = container.getBeanByCompatibleType(Initializer.class);
        router = new Router(container);
    }

    @Override
    public void init() throws ServletException {
        try {
            initializer.config(router);
        } catch (Exception e) {
            e.printStackTrace();
        }

        initVelocity();
    }

    private void initVelocity() throws ServletException {
        String absoluteRootPath = this.getServletContext().getRealPath("/");
        Properties properties = new Properties();
        properties.setProperty("file.resource.loader.path", absoluteRootPath + "/WEB-INF/views/");
        try {
            Velocity.init(properties);
        } catch (Exception e) {
            throw new ServletException("init template engine config fail", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        dispatch(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        dispatch(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) {
        dispatch(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
        dispatch(request, response);
    }

    private void dispatch(HttpServletRequest request, HttpServletResponse response) {
        router.run(request, response);
    }

}
