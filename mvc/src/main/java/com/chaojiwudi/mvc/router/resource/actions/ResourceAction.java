package com.chaojiwudi.mvc.router.resource.actions;

import com.chaojiwudi.mvc.router.action.RouterAction;

import java.lang.reflect.Method;

public class ResourceAction<T> implements RouterAction<T> {

    private String action;

    public ResourceAction(String action) {
        this.action = action;
    }

    @Override
    public void run(T controller) throws Exception {
        Class<?> clazz = controller.getClass();
        Method method = clazz.getMethod(action);
        method.invoke(controller);
    }

}
