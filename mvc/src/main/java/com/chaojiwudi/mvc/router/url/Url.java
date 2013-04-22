package com.chaojiwudi.mvc.router.url;

import com.chaojiwudi.mvc.router.matcher.ParamUrlMatcher;
import com.chaojiwudi.mvc.router.matcher.ParseResult;
import com.chaojiwudi.mvc.router.matcher.SimpleUrlMatcher;
import com.chaojiwudi.mvc.router.matcher.UrlMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

    public static final String ROUTE_REGEX = ".*:([^/]*).*";
    public static final String PARAM_NAME_REGEX = ":[^/]*";
    private UrlMatcher urlMatcher;

    public Url(String route) {
        Pattern routePattern = Pattern.compile(ROUTE_REGEX);
        Matcher matcher = routePattern.matcher(route);

        if (matcher.matches()) {
            urlMatcher = new ParamUrlMatcher(matcher.group(1), route.replaceFirst(PARAM_NAME_REGEX, "([^/]*)"));
        }
        else {
            urlMatcher = new SimpleUrlMatcher(route);
        }
    }

    public ParseResult parse(String requestUrl) {
        return urlMatcher.parse(requestUrl);
    }
}
