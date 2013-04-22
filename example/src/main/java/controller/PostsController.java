package controller;

import com.chaojiwudi.mvc.controller.Controller;

import java.io.IOException;

public class PostsController extends Controller {

    public void get() throws IOException {
        String id = params.get("id");
        response.getWriter().write("Hello Posts Get " + id + " !");
    }

    public void edit() throws IOException {
        String id = params.get("id");
        response.getWriter().write("Hello Posts Edit " + id + " !");
    }
}
