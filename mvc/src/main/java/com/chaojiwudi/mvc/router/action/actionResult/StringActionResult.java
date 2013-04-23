package com.chaojiwudi.mvc.router.action.actionResult;

import javax.servlet.http.HttpServletResponse;

public class StringActionResult implements ActionResult {

    private String text;

    public StringActionResult(String text) {
        this.text = text;
    }

    @Override
    public void render(HttpServletResponse response) throws Exception {
        response.setContentType("text/plain");
        response.getWriter().write(text);
    }

}
