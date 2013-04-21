package com.chaojiwudi.mvc.router;

import core.IocContainer;
import core.IocContainerBuilder;
import org.junit.Before;
import testPackage.controller.TestController;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;


public class RouterTest {

    private Router router;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        IocContainer container = new IocContainerBuilder().withPackageName("testPackage.controller").build();
        router = new Router(container);
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
    }

    @Test
    public void test_router() throws Exception {
        stub(request.getServletPath()).toReturn("/");

        router.register("/", TestController.class, TestController::testAction);

        router.run(request, response);
    }

}
