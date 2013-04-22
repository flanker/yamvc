package com.chaojiwudi.mvc.router.matcher;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParamUrlMatcher implements UrlMatcher {

    private String paramName;
    private final Pattern pattern;

    public ParamUrlMatcher(String paramName, String regex) {
        this.paramName = paramName;
        pattern = Pattern.compile(regex);
    }

    @Override
    public ParseResult parse(String requestUrl) {
        Matcher matcher = pattern.matcher(requestUrl);
        if (matcher.matches()) {
            HashMap<String, String> params = new HashMap<>();
            params.put(paramName, matcher.group(1));
            return new ParseResult(true, params);
        } else {
            return new ParseResult(false);
        }

    }
}
