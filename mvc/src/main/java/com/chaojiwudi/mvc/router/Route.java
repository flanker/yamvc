package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.action.Rule;
import com.chaojiwudi.mvc.router.matcher.UrlResult;
import com.chaojiwudi.mvc.router.matcher.UrlMatcher;

public class Route {

    private UrlMatcher urlMatcher;
    private Rule rule;

    public Route(String routePath, Class clazz, RouterAction action) {
        urlMatcher = UrlMatcher.create(routePath);
        rule = new Rule(clazz, action);
    }

    public UrlResult parse(String requestUrl) {
        return urlMatcher.parse(requestUrl);
    }

    public Rule getRule() {
        return rule;
    }
}
