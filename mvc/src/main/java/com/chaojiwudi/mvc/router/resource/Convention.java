package com.chaojiwudi.mvc.router.resource;

import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.url.HttpMethod;

public class Convention<T> {
    private String name;
    private Class<T> clazz;
    private HttpMethod method;
    private Action action;

    public Convention(String name, Class<T> clazz, HttpMethod method, Action action) {
        this.name = name;
        this.clazz = clazz;
        this.method = method;
        this.action = action;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public String getPath() {
        return action.path(name);
    }

    public RouterAction<T> getAction() {
        return null;
    }
}
