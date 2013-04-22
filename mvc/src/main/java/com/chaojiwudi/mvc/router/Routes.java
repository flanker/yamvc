package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.action.Rule;
import com.chaojiwudi.mvc.router.matcher.ParseResult;

import java.util.ArrayList;
import java.util.List;

public class Routes {

    List<Route> routers = new ArrayList<Route>();

    public void put(String routePath, Class clazz, RouterAction action) {
        routers.add(new Route(routePath, clazz, action));
    }

    public Rule parse(String requestUrl) {
        for (Route route : routers) {
            ParseResult parseResult = route.parse(requestUrl);
            if (parseResult.isMatch()) {
                return route.getRule();
            }
        }
        return null;
    }
}
