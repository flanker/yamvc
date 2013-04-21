package testPackage.controller;

import com.chaojiwudi.mvc.controller.Controller;
import core.annotation.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TestController extends Controller {

    public void testAction(HttpServletRequest request, HttpServletResponse response) {
        System.out.print("bla bla bla");
    }
}
