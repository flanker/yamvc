package com.chaojiwudi.mvc.router.matcher;

public interface UrlMatcher {
    ParseResult parse(String requestUrl);
}
