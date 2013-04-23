package com.chaojiwudi.mvc.controller;

import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;
import com.chaojiwudi.mvc.router.action.actionResult.StringActionResult;
import com.chaojiwudi.mvc.router.action.actionResult.ViewActionResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    HttpServletRequest request;
    protected HttpServletResponse response;
    protected HashMap<String, String> params;

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public void setParams(HashMap<String, String> params) {
        this.params = params;
    }

    protected ActionResult view(Object model) {
        String viewName = getName() + "/" + getActionName();
        return new ViewActionResult(viewName, model);
    }

    protected ActionResult view() {
        String viewName = getName() + "/" + getActionName();
        return new ViewActionResult(viewName);
    }

    protected ActionResult string(String text) {
        return new StringActionResult(text);
    }

    private String getName() {
        Pattern pattern = Pattern.compile(".*\\.([A-Za-z]*)Controller");
        Matcher matcher = pattern.matcher(this.getClass().getName());
        matcher.matches();
        return matcher.group(1).toLowerCase();
    }

    private String getActionName() {
        StackTraceElement element = Thread.currentThread().getStackTrace()[3];
        return element.getMethodName();
    }

}
