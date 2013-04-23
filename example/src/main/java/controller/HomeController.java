package controller;

import com.chaojiwudi.mvc.controller.Controller;
import com.chaojiwudi.mvc.router.action.actionResult.ActionResult;

import java.io.IOException;

public class HomeController extends Controller {

    public ActionResult index() throws IOException {
        return string("Hello Home Index!");
    }

    public ActionResult about() throws IOException  {
        return view();
    }

}
