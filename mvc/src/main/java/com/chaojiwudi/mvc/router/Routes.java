package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.action.Rule;
import com.chaojiwudi.mvc.router.url.Url;

import java.util.ArrayList;
import java.util.List;

public class Routes {
    List<Route> routers = new ArrayList<Route>();

    public void put(String routePath, Class clazz, RouterAction action) {
        Url url = new Url(routePath);
        Rule rule = new Rule(clazz, action);
        routers.add(new Route(url, rule));
    }

    public Rule parse(String requestUrl) {
        for (Route route : routers) {
            if (route.match(requestUrl)) {
                return route.getRule();
            }
        }
        return null;
    }
}
