package controller;

import com.chaojiwudi.mvc.controller.Controller;

import java.io.IOException;

public class HomeController extends Controller {

    public void index() throws IOException {
        response.getWriter().write("Hello Home Index!");
    }

    public void about() throws IOException  {
        response.getWriter().write("Hello Home about!");
    }
}
