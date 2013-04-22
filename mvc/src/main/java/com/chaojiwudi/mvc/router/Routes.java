package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.action.RouteParseResult;
import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.action.Rule;
import com.chaojiwudi.mvc.router.matcher.UrlResult;

import java.util.ArrayList;
import java.util.List;

public class Routes {

    List<Route> routers = new ArrayList<Route>();

    public void put(String routePath, Class clazz, RouterAction action) {
        routers.add(new Route(routePath, clazz, action));
    }

    public RouteParseResult parse(String requestUrl) {
        for (Route route : routers) {
            UrlResult urlResult = route.parse(requestUrl);
            if (urlResult.isMatch()) {
                return new RouteParseResult(urlResult, route.getRule());
            }
        }
        return null;
    }
}
