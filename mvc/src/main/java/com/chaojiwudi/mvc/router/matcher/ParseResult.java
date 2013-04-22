package com.chaojiwudi.mvc.router.matcher;

import java.util.HashMap;

public class ParseResult {

    private boolean isMatch;
    private HashMap<String, String> params;

    public ParseResult(boolean isMatch, HashMap<String, String> params) {
        this.isMatch = isMatch;
        this.params = params;
    }

    public ParseResult(boolean isMatch) {
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
}
