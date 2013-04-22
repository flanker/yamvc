package controller;

import com.chaojiwudi.mvc.controller.Controller;

import java.io.IOException;

public class UsersController extends Controller {

    public void get() throws IOException {
        String id = params.get("id");
        response.getWriter().write("You are getting user: " + id + " !");
    }

    public void update() throws IOException {
        String id = params.get("id");
        response.getWriter().write("You are updating user: " + id + " !");
    }
}
