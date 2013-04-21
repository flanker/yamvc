package controller;

import com.chaojiwudi.mvc.controller.Controller;
import core.annotation.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class HomeController extends Controller {

    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello Home Index!");
    }

    public void about(HttpServletRequest request, HttpServletResponse response) throws IOException  {
        response.getWriter().write("Hello Home about!");
    }
}
