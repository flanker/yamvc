package controller;

import com.chaojiwudi.mvc.controller.Controller;
import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;

import java.io.IOException;

public class UsersController extends Controller {

    public ActionResult get() throws IOException {
        String id = params.get("id");
        return string("You are getting user: " + id + " !");
    }

    public ActionResult update() throws IOException {
        String id = params.get("id");
        return string("You are updating user: " + id + " !");
    }
}
