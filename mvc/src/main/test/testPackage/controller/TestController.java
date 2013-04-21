package testPackage.controller;

import com.chaojiwudi.mvc.controller.Controller;
import core.annotation.Component;

@Component
public class TestController extends Controller {

    public void testAction() {
        System.out.print("test");
    }

}