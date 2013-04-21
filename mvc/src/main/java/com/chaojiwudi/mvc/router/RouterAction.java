package com.chaojiwudi.mvc.router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RouterAction<T> {
    void run(T controller, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
