package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.action.RouteParseResult;
import com.chaojiwudi.mvc.router.action.RouterAction;
import com.chaojiwudi.mvc.router.matcher.UrlResult;
import com.chaojiwudi.mvc.router.url.HttpMethod;

import java.util.ArrayList;
import java.util.List;

public class Routes {

    List<Route> routers = new ArrayList<Route>();

    public <T> void put(HttpMethod method, String routePath, Class<T> clazz, RouterAction<T> action) {
        routers.add(new Route(method, routePath, clazz, action));
    }

    public RouteParseResult parse(String method, String requestUrl) {
        for (Route route : routers) {
            UrlResult urlResult = route.parse(requestUrl);
            if (route.getMethod().match(method) && urlResult.isMatch()) {
                return new RouteParseResult(urlResult, route.getRule());
            }
        }
        return null;
    }
}
