package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.action.Rule;
import com.chaojiwudi.mvc.router.matcher.UrlMatcher;
import com.chaojiwudi.mvc.router.matcher.UrlResult;
import com.chaojiwudi.mvc.router.url.HttpMethod;

public class Route {

    private UrlMatcher urlMatcher;
    private Rule rule;
    private HttpMethod method;

    public Route(String routePath, Class clazz, RouterAction action) {
        urlMatcher = UrlMatcher.create(routePath);
        rule = new Rule(clazz, action);
    }

    public <T> Route(HttpMethod method, String routePath, Class<T> clazz, RouterAction<T> action) {
        this.method = method;
        urlMatcher = UrlMatcher.create(routePath);
        rule = new Rule(clazz, action);
    }

    public UrlResult parse(String requestUrl) {
        return urlMatcher.parse(requestUrl);
    }

    public Rule getRule() {
        return rule;
    }

    public HttpMethod getMethod() {
        return method;
    }
}
