package com.chaojiwudi.mvc.servlet;

import com.chaojiwudi.mvc.init.Initializer;
import com.chaojiwudi.mvc.router.Router;
import core.IocContainer;
import core.IocContainerBuilder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {

    private Initializer initializer;
    private Router router;

    public DispatcherServlet() throws Exception {
        IocContainer initContainer = new IocContainerBuilder().withPackageName("config").build();
        initializer = (Initializer) initContainer.getBeanByCompatibleType(Initializer.class);
    }

    @Override
    public void init() {
        try {
            IocContainer controllerContainer = new IocContainerBuilder().withPackageName(initializer.getPackageName()).build();
            router = new Router(controllerContainer);
            initializer.config(router);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        dispatch(request, response, HttpMethod.Get);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        dispatch(request, response, HttpMethod.Post);
    }

    private void dispatch(HttpServletRequest request, HttpServletResponse response, HttpMethod method) {
        router.run(request, response);
    }

    private enum HttpMethod {
        Get, Post
    }
}
