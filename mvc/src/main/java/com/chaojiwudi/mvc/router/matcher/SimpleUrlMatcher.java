package com.chaojiwudi.mvc.router.matcher;

public class SimpleUrlMatcher implements UrlMatcher {

    private String url;

    public SimpleUrlMatcher(String url) {
        this.url = url;
    }

    @Override
    public ParseResult parse(String requestUrl) {
        return new ParseResult(url.equals(requestUrl));
    }
}
