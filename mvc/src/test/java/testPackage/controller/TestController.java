package testPackage.controller;

import com.chaojiwudi.mvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends Controller {

    public void testAction(HttpServletRequest request, HttpServletResponse response) {
        System.out.print("bla bla bla");
    }
}
