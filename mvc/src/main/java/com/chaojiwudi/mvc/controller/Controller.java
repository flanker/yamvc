package com.chaojiwudi.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

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
}
