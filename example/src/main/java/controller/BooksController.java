package controller;

import com.chaojiwudi.mvc.controller.Controller;
import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;
import model.Book;

import java.util.List;

public class BooksController extends Controller {

    public ActionResult index() {
        List<Book> books = Book.findAll();
        return view(books);
    }

    public ActionResult add() {
        return view();
    }

    public ActionResult create() {
        return redirect(BooksController.class, BooksController::show);
    }

    public ActionResult show() {
        Book book = Book.findById(params.get("id"));
        return view(book);
    }

    public ActionResult edit() {
        Book book = Book.findById(params.get("id"));
        return view(book);
    }

    public ActionResult update() {
        String id = params.get("id");
        return string("Books Update id " + id + "!");
    }

    public ActionResult destroy() {
        String id = params.get("id");
        return string("Books Destroy id " + id + "!");
    }

}
