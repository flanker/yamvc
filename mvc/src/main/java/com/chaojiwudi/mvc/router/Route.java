package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.action.Rule;
import com.chaojiwudi.mvc.router.url.Url;

public class Route {
    private Url url;
    private Rule rule;

    public Route(Url url, Rule rule) {
        this.url = url;
        this.rule = rule;
    }

    public boolean match(String requestUrl) {
        return url.parse(requestUrl).isMatch();
    }

    public Rule getRule() {
        return rule;
    }
}
