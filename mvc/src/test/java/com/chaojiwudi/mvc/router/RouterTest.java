package com.chaojiwudi.mvc.router;

import core.IocContainer;
import core.IocContainerBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import testPackage.controller.TestController;

public class RouterTest {

    private Router router;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        IocContainer container = new IocContainerBuilder().build();
        router = new Router(container);
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }

    @Test
    public void test_router() throws Exception {
        request.setPathInfo("/");

        router.register("/", TestController.class, TestController::testAction);

        router.run(request, response);
    }

}
