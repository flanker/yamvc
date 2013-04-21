package com.chaojiwudi.mvc.router;

import testPackage.controller.TestController;
import org.junit.Test;

public class RouterTest {

    @Test
    public void test_router() throws Exception {
        Router router = new Router("testPackage.controller");

        router.register("/", TestController.class, c -> c.testAction());

        router.run("/");
    }
}
