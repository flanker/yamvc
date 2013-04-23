package com.chaojiwudi.mvc.router.resource.actions;

import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;

import java.lang.reflect.Method;

public class ResourceAction<T> implements RouterAction<T> {

    private String action;

    public ResourceAction(String action) {
        this.action = action;
    }

    @Override
    public ActionResult run(T controller) throws Exception {
        Class<?> clazz = controller.getClass();
        Method method = clazz.getMethod(action);
        return (ActionResult) method.invoke(controller);
    }

}
