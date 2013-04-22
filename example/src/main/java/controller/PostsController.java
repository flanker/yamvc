package controller;

import com.chaojiwudi.mvc.controller.Controller;

import java.io.IOException;

public class PostsController extends Controller {

    public void get() throws IOException {
        response.getWriter().write("Hello Posts Get!");
    }

    public void edit() throws IOException {
        response.getWriter().write("Hello Posts Edit!");
    }
}
