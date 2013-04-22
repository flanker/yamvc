package com.chaojiwudi.mvc.router.matcher;

public class SimpleUrlMatcher extends UrlMatcher {

    private String url;

    public SimpleUrlMatcher(String url) {
        this.url = url;
    }

    @Override
    public UrlResult parse(String requestUrl) {
        return new UrlResult(url.equals(requestUrl));
    }
}
