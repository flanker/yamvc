package com.chaojiwudi.mvc.router.action.actionResult;

import com.chaojiwudi.mvc.router.action.RouterAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectActionResult<T> implements ActionResult {

    private HttpServletRequest request;
    private Class clazz;
    private RouterAction action;

    public <T> RedirectActionResult(HttpServletRequest request, Class<T> clazz, RouterAction<T> action) {
        this.request = request;
        this.clazz = clazz;
        this.action = action;
    }

    @Override
    public void render(HttpServletResponse response) throws Exception {
        response.sendRedirect(request.getContextPath() + "/books");
    }

}
