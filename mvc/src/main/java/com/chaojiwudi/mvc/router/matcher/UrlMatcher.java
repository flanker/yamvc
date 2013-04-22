package com.chaojiwudi.mvc.router.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class UrlMatcher {

    public static final String ROUTE_REGEX = ".*:([^/]*).*";
    public static final String PARAM_NAME_REGEX = ":[^/]*";

    public static UrlMatcher create(String route) {
        Pattern routePattern = Pattern.compile(ROUTE_REGEX);
        Matcher matcher = routePattern.matcher(route);

        if (matcher.matches()) {
            return new ParamUrlMatcher(matcher.group(1), route.replaceFirst(PARAM_NAME_REGEX, "([^/]*)"));
        }
        else {
            return new SimpleUrlMatcher(route);
        }
    }

    public abstract ParseResult parse(String requestUrl);
}
