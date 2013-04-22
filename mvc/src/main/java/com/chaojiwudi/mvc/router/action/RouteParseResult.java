package com.chaojiwudi.mvc.router.action;

import com.chaojiwudi.mvc.controller.Controller;
import com.chaojiwudi.mvc.router.matcher.UrlResult;
import core.IocContainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RouteParseResult {

    private UrlResult urlResult;
    private Rule rule;

    public RouteParseResult(UrlResult urlResult, Rule rule) {
        this.urlResult = urlResult;
        this.rule = rule;
    }

    public void execute(IocContainer container, HttpServletRequest request, HttpServletResponse response) {
        try {
            Controller controller = createController(container, request, response);
            rule.getAction().run(controller);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Controller createController(IocContainer container, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Controller controller = (Controller) container.getBean(rule.getClazz());
        controller.setRequest(request);
        controller.setResponse(response);
        controller.setParams(urlResult.getParams());
        return controller;
    }
}
