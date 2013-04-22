package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.controller.Controller;
import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.action.Rule;
import core.IocContainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Router {

    private final IocContainer container;
    private Routes routers = new Routes();

    public Router(IocContainer container) throws Exception {
        this.container = container;
    }

    public <T> void register(String path, Class<T> clazz, RouterAction<T> action) {
        container.register(clazz);
        routers.put(path, clazz, action);
    }

    public void run(HttpServletRequest request, HttpServletResponse response) {
        Rule rule = routers.parse(request.getPathInfo());
        try {
            Controller controller = (Controller) container.getBean(rule.getClazz());
            controller.setRequest(request);
            controller.setResponse(response);
            rule.getAction().run(controller);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

