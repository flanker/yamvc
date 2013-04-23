package controller;

import com.chaojiwudi.mvc.controller.Controller;
import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;

public class PostsController extends Controller {

    public ActionResult get() {
        String id = params.get("id");
        return string("Test Posts Get " + id + " !");
    }

    public ActionResult edit() {
        String id = params.get("id");
        return string("Test Posts Edit " + id + " !");
    }

    public ActionResult update() {
        String id = params.get("id");
        return string("Test Posts Update " + id + " !");
    }
}
