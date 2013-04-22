package controller;

import com.chaojiwudi.mvc.controller.Controller;

import java.io.IOException;

public class BooksController extends Controller {

    public void index() throws IOException {
        response.getWriter().write("Books Index!");
    }

    public void add() throws IOException {
        response.getWriter().write("Books Add!");
    }

    public void create() throws IOException {
        response.getWriter().write("Books Create!");
    }

    public void show() throws IOException {
        String id = params.get("id");
        response.getWriter().write("Books Show id " + id + "!");
    }

    public void edit() throws IOException {
        String id = params.get("id");
        response.getWriter().write("Books Edit id " + id + "!");
    }

    public void update() throws IOException {
        String id = params.get("id");
        response.getWriter().write("Books Update id " + id + "!");
    }

    public void destroy() throws IOException {
        String id = params.get("id");
        response.getWriter().write("Books Destroy id " + id + "!");
    }

}
