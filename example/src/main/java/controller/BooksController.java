package controller;

import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;
import com.chaojiwudi.mvc.controller.Controller;
import model.Book;

import java.io.IOException;

public class BooksController extends Controller {

    public ActionResult index() throws IOException {
        return string("Books Index!");
    }

    public ActionResult add() throws IOException {
        return string("Books Add!");
    }

    public ActionResult create() throws IOException {
        return string("Books Create!");
    }

    public ActionResult show() {
        Book book = Book.findById(params.get("id"));
        return view(book);
    }

    public ActionResult edit() throws IOException {
        String id = params.get("id");
        return string("Books Edit id " + id + "!");
    }

    public ActionResult update() throws IOException {
        String id = params.get("id");
        return string("Books Update id " + id + "!");
    }

    public ActionResult destroy() throws IOException {
        String id = params.get("id");
        return string("Books Destroy id " + id + "!");
    }

}
