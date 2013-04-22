package com.chaojiwudi.mvc.router.url;

public enum HttpMethod {
    Get("GET"), Post("POST"), Put("PUT"), Delete("DELETE");

    private String method;

    private HttpMethod(String method) {
        this.method = method;
    }

    public boolean match(String method) {
        return this.method.equalsIgnoreCase(method);
    }
}
