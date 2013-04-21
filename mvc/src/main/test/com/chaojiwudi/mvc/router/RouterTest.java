package com.chaojiwudi.mvc.router;

import org.junit.Before;
import testPackage.controller.TestController;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;


public class RouterTest {

    private Router router;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        router = new Router("testPackage.controller");
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
