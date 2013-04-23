package com.chaojiwudi.mvc.router.action.actionResult;

import javax.servlet.http.HttpServletResponse;

public interface ActionResult {

    void render(HttpServletResponse response) throws Exception;

}
