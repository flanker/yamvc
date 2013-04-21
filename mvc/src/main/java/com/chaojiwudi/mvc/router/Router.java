package com.chaojiwudi.mvc.router;

import core.IocContainer;
import core.IocContainerBuilder;

import java.util.HashMap;

public class Router {

    private final IocContainer container;
    HashMap<String, Rule> routers = new HashMap<String, Rule>();

    public Router(String packageName) throws Exception {
        container = new IocContainerBuilder().withPackageName(packageName).build();
    }

    public <T> void register(String path, Class<T> clazz, RouterAction<T> action) {
        routers.put(path, new Rule(clazz, action));
    }

    public void run(String path) throws Exception {
        Rule rule = routers.get(path);
        rule.getAction().run(container.getBean(rule.getClazz()));
    }

}

