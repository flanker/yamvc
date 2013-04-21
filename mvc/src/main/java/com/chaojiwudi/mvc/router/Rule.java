package com.chaojiwudi.mvc.router;

public class Rule {

    private Class clazz;
    private RouterAction action;

    public Rule(Class clazz, RouterAction action) {
        this.clazz = clazz;
        this.action = action;
    }

    public RouterAction getAction() {
        return action;
    }

    public Class getClazz() {
        return clazz;
    }
}
