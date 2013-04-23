package controller;

import com.chaojiwudi.mvc.controller.Controller;
import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;

import java.io.IOException;

public class PostsController extends Controller {

    public ActionResult get() throws IOException {
        String id = params.get("id");
        return string("Hello Posts Get " + id + " !");
    }

    public ActionResult edit() throws IOException {
        String id = params.get("id");
        return string("Hello Posts Edit " + id + " !");
    }
}
