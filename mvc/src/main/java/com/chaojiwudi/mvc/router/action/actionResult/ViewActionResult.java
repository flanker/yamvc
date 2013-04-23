package com.chaojiwudi.mvc.router.action.actionResult;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.context.Context;

import javax.servlet.http.HttpServletResponse;

public class ViewActionResult implements ActionResult {

    private Template template;
    private Context context = new VelocityContext();

    public ViewActionResult(String viewName, Object model) {
        context.put("model", model);
        getTemplate(viewName);
    }

    public ViewActionResult(String viewName) {
        getTemplate(viewName);
    }

    private void getTemplate(String viewName) {
        try {
            template = Velocity.getTemplate(viewName + ".vm");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(HttpServletResponse response) throws Exception {
        template.merge(context, response.getWriter());
        response.getWriter().flush();
    }

}
