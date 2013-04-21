package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.controller.Controller;
import core.IocContainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class Router {

    private final IocContainer container;
    HashMap<String, Rule> routers = new HashMap<String, Rule>();

    public Router(IocContainer container) throws Exception {
        this.container = container;
    }

    public <T> void register(String path, Class<T> clazz, RouterAction<T> action) {
        container.register(clazz);
        routers.put(path, new Rule(clazz, action));
    }

    public void run(HttpServletRequest request, HttpServletResponse response) {
        Rule rule = routers.get(request.getPathInfo());
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

