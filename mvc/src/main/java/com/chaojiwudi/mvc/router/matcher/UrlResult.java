package com.chaojiwudi.mvc.router.matcher;

import java.util.HashMap;

public class UrlResult {

    private boolean isMatch;
    private HashMap<String, String> params;

    public UrlResult(boolean isMatch, HashMap<String, String> params) {
        this.isMatch = isMatch;
        this.params = params;
    }

    public UrlResult(boolean isMatch) {
        this.isMatch = isMatch;
    }

    public boolean isMatch() {
        return isMatch;
    }

    public String getParam(String name) {
        if (params == null) {
            return null;
        }
        return params.get(name);
    }

    public HashMap<String, String> getParams() {
        return params;
    }
}
